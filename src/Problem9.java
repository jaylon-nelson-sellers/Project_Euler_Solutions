/**
 * Special Pythagorean triplet
 *
 * Problem 9
 * A Pythagorean triplet is a set of three natural numbers, a < b < c, for which
 * ,
 *
 * a^2 + b^2 = c^2
 * For example, 3^2 + 4^2 = 9 + 16 = 25 = 5^2.
 *
 * There exists exactly one Pythagorean triplet for which a + b + c = 1000.
 * Find the product abc.
 *
 * Brainstorming:
 * this one is just following a formula so I'm not too worried. I'm going to
 * do a nested loop and just return whatever works.
 *
 * Results:
 * 1st attempt. Did not work. I think my formula was off. I was keeping k as
 * i^2 + j^2 instead of the sqrt of that.
 * 2nd attempt: Got the right answer. This came out correct after fixing the
 * previous mistake, so I'm happy.
 * Answer: a = 200 b = 375 c = 425 a * b * c = 31875000
 * Difficulty: 1/10
 */
public class Problem9 {

    /**
     * Main that starts program and executes helper methods.
     * @param args arguments to be passed in.
     */
    public static void main(String[] args) {
        System.out.println(tripletFinder(1000));
    }

    /**
     * this method takes in a sum (in this problem 1000) and uses a nested loop
     * to find the desired value.
     * Finds the C value (represented as K) and uses a test case to see if
     * they're equal. if so returns that value.
     * @param sum sum to be found.
     * @return the product of a, b and c.
     */
    public static int tripletFinder(int sum) {
        int i = 0;
        int j = 0;
        double k = 0;
        boolean condition = false;

        while (!condition) {
            for (i = 1; i <= sum; i++) {
                for (j = 1; j <= sum; j++) {
                    k = Math.sqrt((i*i) + (j*j));
                    if (i + j + k == sum) {
                        condition = true;
                        System.out.println("a: " + i + "+ b: " + j + " = " + k);
                        return (int) (i * j * k);
                    }
                    if (i + j + k > sum) {
                        break;
                    }
                    System.out.println("These don't work");
                    System.out.println(i + j + k);
                    }
                }
            }
        return -1;
        }
    }
