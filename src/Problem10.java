/**
 * Summation of primes
 *
 * Problem 10
 * The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.
 *
 * Find the sum of all the primes below two million.
 *
 * Brainstorming:
 * This one is easier because I can use a previous method I made and add them,
 * then print that value.
 *
 * Result:
 * Oh my goodness this ran for a while. Guess my laptop is a bit underpowered.
 * Answer: 142913828922
 * Ended up getting this after 3 hours of computing time.
 * Overall this was fairly easy but it took a while.
 * 1/10.
 *
 */
public class Problem10 {

    /**
     * Main method that executes helper functions.
     * @param args arguments being passed through.
     */
    public static void main(String[] args) {
        System.out.println(sumOfPrime(2000000));
    }

    /**
     * This method simply goes through each number in the loop and checks if
     * it's prime. If it is it adds them. Else does nothing.
     * @param limit limit to be observed.
     * @return the sum of the prime number under the limit.
     */
    private static double sumOfPrime(int limit) {
        double sum = 0;
        for (int i = 1; i < limit; i++) {
            if (i == 1) {
                continue;
            }
            if (primeChecker(i)) {
                System.out.println("This is a Prime! " + i);
                sum += i;
            }
        }
        return sum;
    }

    /**
     * This method checks if a value is prime. If so it then returns if true or
     * not.
     * @param number the number to be checked.
     * @return a boolean representing if the number is prime.
     */
    private static boolean primeChecker(int number) {
        boolean condition = true;
        for (int i = 1; i <= number; i++) {
            if (i == 1) {
                continue;
            }
            if (number % i == 0 && i != number) {
                condition = false;
            }
        }
        if (condition) {
            return true;
        } else {
            return false;
        }
    }
}
