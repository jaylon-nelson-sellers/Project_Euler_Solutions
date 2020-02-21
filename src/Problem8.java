import java.math.BigDecimal;

/**
 * The four adjacent digits in the 1000-digit number that have the greatest
 * product are 9 × 9 × 8 × 9 = 5832.
 *
 * 73167176531330624919225119674426574742355349194934
 * 96983520312774506326239578318016984801869478851843
 * 85861560789112949495459501737958331952853208805511
 * 12540698747158523863050715693290963295227443043557
 * 66896648950445244523161731856403098711121722383113
 * 62229893423380308135336276614282806444486645238749
 * 30358907296290491560440772390713810515859307960866
 * 70172427121883998797908792274921901699720888093776
 * 65727333001053367881220235421809751254540594752243
 * 52584907711670556013604839586446706324415722155397
 * 53697817977846174064955149290862569321978468622482
 * 83972241375657056057490261407972968652414535100474
 * 82166370484403199890008895243450658541227588666881
 * 16427171479924442928230863465674813919123162824586
 * 17866458359124566529476545682848912883142607690042
 * 24219022671055626321111109370544217506941658960408
 * 07198403850962455444362981230987879927244284909188
 * 84580156166097919133875499200524063689912560717606
 * 05886116467109405077541002256983155200055935729725
 * 71636269561882670428252483600823257530420752963450
 *
 * Find the thirteen adjacent digits in the 1000-digit number that have the
 * greatest product. What is the value of this product?
 *
 * Brainstorming: What even is this problem? Honestly who comes up with problems
 * like this? Anyway after staring at the problem for 5 minutes I understood
 * what was needed. I'm going to put this number into a string and just use
 * substring in a loop.
 *
 * Result:
 * 1st Submit: Was wrong I was using ints when these numbers got really big.
 * 2nd submit: Correct! 2.3514624E10 or 23514624000. Ints really need to up
 * their game. I'm probably going to just use doubles because I was frustrated
 * for a second. Overall this problem wasn't to bad.
 * Difficulty: 2/10
 *
 */
public class Problem8 {

    /**
     * Main method used for finding values. Initiates sub-methods and prints
     * result.
     * @param args arguments being passed through.
     */
    public static void main(String[] args) {
        double foundValue = toIterate(13);
        System.out.println("The largest product is:" + foundValue);
    }

    /**
     * toIterate checks the adjacent values and finds the product of them.
     * Tracks the largest for the 1000 digit number and returns it.
     * Uses a few nested for loops for tracking and printing.
     * @param adjacent number of adjacent values to be multiplied
     * @return the largest product based on the number of values.
     */
    private static double toIterate(int adjacent) {
        double largest = 0;
        double tempSum = 0;
        String digit = "73167176531330624919225119674426574742355349194934" +
                "96983520312774506326239578318016984801869478851843" +
                "85861560789112949495459501737958331952853208805511" +
                "12540698747158523863050715693290963295227443043557" +
                "66896648950445244523161731856403098711121722383113" +
                "62229893423380308135336276614282806444486645238749" +
                "30358907296290491560440772390713810515859307960866" +
                "70172427121883998797908792274921901699720888093776" +
                "65727333001053367881220235421809751254540594752243" +
                "52584907711670556013604839586446706324415722155397" +
                "53697817977846174064955149290862569321978468622482" +
                "83972241375657056057490261407972968652414535100474" +
                "82166370484403199890008895243450658541227588666881" +
                "16427171479924442928230863465674813919123162824586" +
                "17866458359124566529476545682848912883142607690042" +
                "24219022671055626321111109370544217506941658960408" +
                "07198403850962455444362981230987879927244284909188" +
                "84580156166097919133875499200524063689912560717606" +
                "05886116467109405077541002256983155200055935729725" +
                "71636269561882670428252483600823257530420752963450";
        //iterates through the block
        for (int i =0; i <= digit.length() - 13; i++) {
            tempSum = 1;
            //iterates through the adjacent values and multiples them
            for (int j = 0; j < adjacent; j++) {
                double tempNum = Integer.valueOf(digit.substring(i+j, i+j + 1));
                tempSum = tempNum * tempSum;
            }
            //tests to see if a new max should be set.
            if (tempSum > largest) {
                System.out.println("These are the new largest adjacent:");
                for (int k = 0; k < adjacent; k++) {
                    System.out.print(digit.charAt(i+k) + " ");

                }
                System.out.println(" " + tempSum);
                System.out.println(" ");
                largest = tempSum;
            }
        }
        //makes it easier to submit value. I don't know if Euler accepts e not.
        System.out.println(BigDecimal.valueOf(largest).toPlainString());
        return largest;
    }

}
