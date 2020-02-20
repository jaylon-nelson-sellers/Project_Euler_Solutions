/**
 * Largest palindrome product
 *
 * Problem 4
 * A palindromic number reads the same both ways. The largest palindrome made
 * from the product of two 2-digit numbers is 9009 = 91 × 99.
 *
 * Find the largest palindrome made from the product of two 3-digit numbers.
 *
 * Brainstorming:
 * I can brute force this i believe. a nested for loop will probably do the job.
 *
 * Result:
 * After some debugging, I got the correct answer of 913 x 993 = 906609.
 * I did this by using two methods: one to go through each value through 1-999
 * and one to check if the product of the values is a palindrome.
 * Rate it a 2/10. Solved on first attempt.
 */
public class Problem4 {

    public static void main(String[] args) {
        int[] temp = (palindromeFinder(1000));
        System.out.println("Value 1:" + temp[0] + "Value 2:" + temp[1]);
        int palindrome = temp[0] * temp[1];
        System.out.println("Largest Palindrome is: " + palindrome);
    }

    public static int[] palindromeFinder(int max) {
        int[] maxValue = new int[2];
        maxValue[0] = 0;
        maxValue[1] = 0;
        for (int i = 1; i < max; i++) {
            for (int j = 1; j < max; j++) {
                int tempNumber = (i * j);
                String tempString =  Integer.toString(tempNumber);
                if (palindromeChecker(tempString)) {
                    if (maxValue[0] * maxValue[1] < i * j) {
                        maxValue[0] = i;
                        maxValue[1] = j;
                    }
                }
            }
        }
        return maxValue;
    }

    public static boolean palindromeChecker(String toBeChecked) {
        int length = toBeChecked.length();
        if (length % 2 == 0) {
            int end = length - 1;
            for (int i = 0; i < length; i++) {
                if (toBeChecked.charAt(i) == toBeChecked.charAt(end)) {
                    end--;
                    continue;
                } else {
                    return false;
                }
            }
            return true;

        } else if (length == 1) {
            return true;
        } else {
            int end = length - 1;
            for (int i = 0; i < length; i++) {
                if (i == (length / 2) + 1) {
                    end--;
                    continue;
                }

                if (toBeChecked.charAt(i) == toBeChecked.charAt(end)) {
                    end--;
                    continue;
                } else {
                    return false;
                }
            }
        }
        return false;
    }
}
