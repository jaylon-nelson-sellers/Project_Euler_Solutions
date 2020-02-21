/**
 * Sum square difference
 *
 * Problem 6
 * The sum of the squares of the first ten natural numbers is,
 *
 * 1^2+2^2+...+10^2=385
 * The square of the sum of the first ten natural numbers is,
 *
 * (1+2+...+10)^2=552=3025
 * Hence the difference between the sum of the squares of the first ten natural
 * numbers and the square of the sum is 3025−385=2640.
 *
 * Find the difference between the sum of the squares of the first one hundred
 * natural numbers and the square of the sum.
 *
 * Brainstorming: This one seems pretty simple. I'll make two methods that do
 * each problem and just subtract them.
 *
 * Result:
 * Another first attempt. At this rate I'll be done by june :).
 * Ended up getting:
 * Squares of Sum for 100
 * 25502500
 * Sum of Squares for 100
 * 338350
 * Difference is 25164150
 *
 * Difficulty: 1/10
 *
 */
public class Problem6 {

    /**
     * Main method that starts program and initiates smaller methods.
     * @param args arguments being passed in.
     */
    public static void main(String[] args) {
        int limit = 100;
        int difference = squareOfSum(limit) - sumOfSquare(limit);
        System.out.println("Difference is " + difference);
    }

    /**
     * this method adds the numbers under the limit and squares the sum.
     * Also prints a message to the user.
     * @param limit limit to be observed.
     * @return An int representing the square of the Sum.
     */
    private static int squareOfSum(int limit) {
        int sum = 0;
        for (int i = 1; i <= limit; i++) {
            sum += i;
        }
        System.out.println("Squares of Sum for " + limit);
        System.out.println(sum * sum);
        return sum * sum;
    }

    /**
     * This method adds the numbers under the limit after they've been squared.
     * Also prints a message to the user.
     * @param limit limit to be observed
     * @return an int representing the sum of the square.
     */
    private static int sumOfSquare(int limit) {
        int sum = 0;
        for (int i = 1; i <= limit; i++) {
            sum += (i * i);
        }
        System.out.println("Sum of Squares for " + limit);
        System.out.println(sum);
        return sum;
    }

}
