/**
 * 10001st prime
 *
 * Problem 7
 * By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see
 * that the 6th prime is 13.
 *
 * What is the 10 001st prime number?
 *
 * Brainstorming:
 * This problem seems simple but I think the difficult aspect will be verifying
 * if a number is a prime. Other than that it's simple iteration. I'll most
 * likely break it up into two methods: One to iterate and one to check if a
 * number is a prime.
 *
 * Result:
 * 1st attempt: I submitted the 10000! I made a silly mistake but I think I'm
 * on the right track. let me make some small changes.
 * 2nd attempt: I submitted the 10000 again. I was counting 0 as a prime number
 * when technically it isn't.
 * 3rd attempt: Got the correct answer! 104743 is the 10001 prime.
 * This problem was easy but I made some silly mistakes
 * Difficulty: 2/10
 *
 */
public class Problem7 {
    /**
     * Main method that starts sub methods.
     * @param args arguments being passed in.
     */
    public static void main(String[] args) {
        int primeWanted = 10001;
        double primeFound = primeFinder(primeWanted);
        System.out.println("The " + primeWanted + " prime is:" + primeFound);
    }

    /**
     * This method iterates through the limit to find the prime corresponding to
     * that number. Uses a while loop to go through values while checking for
     * prime numbers. If found the method adds to the int i which tracks primes
     * found.
     * @param limit the prime number wanted
     * @return a double representing the found prime.
     */
    private static double primeFinder(int limit) {
        int i = 0;
        int j = 1;
        boolean testCondition = false;

        while (i != limit + 1) {
            testCondition = primeVerify(j);
            if (testCondition) {
                System.out.println(j + " is a prime number! It is the " + i +
                        " found!");
                i++;
            }
            if (i == limit + 1) {
                return j;
            }
           j++;
        }
        return j;
    }

    /**
     * This method uses brute force to find out if a number is a prime.
     * If the passed in value is not divisable by any numbers then it returns
     * true.
     * @param toBeVerified number to be checked if it's a prime.
     * @return a boolean determining if the number is a prime.
     */
    public static boolean primeVerify(double toBeVerified) {
        for (int i = 0; i < toBeVerified; i++) {
            if (i == 1) {
                continue;
            }

            if (toBeVerified % i == 0 ) {
                return false;
            }
        }
        return true;
    }
}
