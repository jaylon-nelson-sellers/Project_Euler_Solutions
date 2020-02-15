/**
 * Multiples of 3 and 5
 *
 * Problem 1
 * If we list all the natural numbers below 10 that are multiples of 3 or 5,
 * we get 3, 5, 6 and 9. The sum of these multiples is 23.
 *
 * Find the sum of all the multiples of 3 or 5 below 1000.
 *
 * Brainstorming:
 * We need to find an algorithm that checks the value of a number to see if it's
 * divisible by 3 or 5
 *
 * Solution:
 * The method I used had a for loop that went to 1000 and used % operators to
 * each value. If it came back positive then the method findValues added it.
 * Finally this method sent it back to main and printed the value.
 *
 * Result:
 * 233168
 * Solved on first Attempt
 * Rate this problem a 1/10 in difficulty as I did fairly quickly with no bugs
 * or errors.
 */
public class Problem1 {

    /**
     * Starts program, initiates the helper method and prints the solution.
     * @param args Inputs from command
     */
    public static void main(String[] args) {
        System.out.println(findValues());
    }

    /**
     * Uses a simple for loop to solve the problem. Checks value within for loop.
     * @return an int representing the answer
     */
    private static int findValues() {
        int value = 0;
        int limit = 1000;
        for (int i = 0; i < limit; i++) {
            if (i % 3 == 0|| i % 5 == 0) {
                 value = value + i;
            }
        }

        return value;
    }
}
