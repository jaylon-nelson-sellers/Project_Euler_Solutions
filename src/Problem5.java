import java.math.BigDecimal;
/**Smallest multiple

 Problem 5
 2520 is the smallest number that can be divided by each of the numbers from 1
 to 10 without any remainder.

 What is the smallest positive number that is evenly divisible by all of the
 numbers from 1 to 20?

 Brainstorming: I think another brute force attempt will work. Using a nested
 for loop for all values.

 Result:
 First Attempt got a really large number, I used the debugger to test 2520 and
 it got the correct answer (returning positive for each value) but the given
 number is massive at 2.32792561E8
 *
 * I got the correct answer? but the computer rounded up which confused me. I
 * rounded it down, and the answer was correct. Not really happy with it because
 * I had to intervene with the answer and didn't get a direct answer.
 * difficulty: 2/10
 * first attempt
 */
public class Problem5 {

    /**
     * Main method that finds the value. Executes sub methods.
     * @param args arguments being passed in.
     */
    public static void main(String[] args) {
        //Got a weird number? Rounded it down
        //System.out.println(findDivisible());

        int p = 232792560;

        for (int i = 1; i <= 20; i++) {
            System.out.println(p / i);
        }
    }

    /**
     * This method uses a nested loop to iterate through as many values needed
     * to find the correct value. Uses a boolean to continue iterating until
     * boolean condition is not meet (Value found),then returns that value.
     * Inner for loop iterates through 1 to 20 to test each value.
     * @return a double representing the found value.
     */
    private static double findDivisible() {
        boolean testCondition = false;
        double i = 1;
        while (!testCondition) {
            for (int j = 1; j <= 20; j++) {
                if (i % j == 0) {
                    testCondition = true;
                } else {
                    testCondition = false;
                    break;
                }
            }
            i++;
        }

        System.out.println("2) " + BigDecimal.valueOf(i).toPlainString());
        return i;
    }

}

