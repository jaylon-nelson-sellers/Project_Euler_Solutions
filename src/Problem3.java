
import java.util.ArrayList;
import java.util.Stack;

/**
 * Largest prime factor
 *
 * Problem 3
 * The prime factors of 13195 are 5, 7, 13 and 29.
 *
 * What is the largest prime factor of the number 600851475143 ?
 * Got this
 *
 * BrainStorming:
 * I need to figure out a factoring algorithm and a prime number verifier.
 * I did look up the Trial Division method but I did not look at any code for
 * it.
 *
 * Result:
 * Attempt 1: I submitted 716151937 but that turned out to be wrong. Turns out
 * my algorithm was not checking and just finding numbers divisible by the
 * number.
 * Attempt 2: Got the correct answer! it ended up being a lot lower at 6857
 * I made some slight tweaks and made the results a bit more readable.
 * Additionally I considered using recursion but I ended up not, because brute
 * force worked just fine (If not taking extra time.)
 */
public class Problem3 {

    /**
     * Main used to start the program and execute main functions. Creates a
     * stack that holds the factors. Executes the generator main method and then
     * checks for the largest factor using Math. function.
     * @param args arguments to be passed in.
     */
    public static void main(String[] args){
        Stack<Double> factors = new Stack<>();
        factors = factorGenerator(600851475143.0);
        double maxValue = 0;
        for (Double factor: factors) {
            maxValue = Math.max(maxValue,factor);
        }
        System.out.println(maxValue);
    }

    /**
     * Brute Force factor generator.
     *
     * Uses a for loop to go through each value to find factors within each
     * number. Finds out which number is divisible, and then sends that value
     * to the generator2 which finds out if it is a Prime number. Adds it if
     * possible.
     * @param toBeFact double to checked
     * @return a Stack of factors for the number.
     */
    private static Stack<Double> factorGenerator
            (Double toBeFact) {
        Stack<Double> factors = new Stack<>();
        Stack<Double> temp = new Stack<>();
        for (int i = 1; i <= toBeFact; i++) {
            if (i == 1) {
                continue;
            }
            if (toBeFact % i == 0) {
                if (i < 0) {
                    return factors;
                }
                System.out.println("Checking: " + i);
                double checked = factorGenerator2(i);

                if (checked == -1) {
                    System.out.println("This is a bad number!");
                } else {
                    System.out.println("This is a good number!: " + checked);
                    temp.add(checked);
                }
            }
            for (int j = 0; j < temp.size(); j++) {
                System.out.println("Added: " + temp.peek());
                factors.add(temp.pop());
            }
        }
        return factors;
    }

    /**
     * Smaller factor method that goes through each factor to check if it is
     * prime. Checks for outliers and stops any infinite loops. Also reports to
     * terminal.
     * @param toBeFact double passed in to be checked.
     * @return a double. Either -1 or the prime factor.
     */
    private static double factorGenerator2
            (double toBeFact) {
        boolean condition = true;
        for (int i = 1; i <= toBeFact; i++) {
            if (i == 1) {
                continue;
            }
            if (toBeFact % i == 0 && i != toBeFact) {
                System.out.println("Sub-checking: " + i);
                condition = false;
            }
        }
        if (condition) {
            return toBeFact;
        } else {
            return -1;
        }
    }

}
