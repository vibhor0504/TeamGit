package problemSolving;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.Stream;
import static java.util.stream.Collectors.toList;

/**
 * Problem Statement
 */

/**
 * Task Description:
 *
 * You are given an array of integers.
 * Your task is to calculate and print the ratios of positive, negative, and zero elements.
 * Display the decimal value of each fraction on a new line with 6 places after the decimal point.
 *
 * Note:
 * This challenge introduces precision problems. The test cases are scaled to six decimal places,
 * and answers with an absolute error of up to are acceptable.
 *
 * Example:
 *
 * makefile
 * Copy code
 * Input:
 * 5
 * 1 -2 0 4 -5
 *
 * Output:
 * 0.400000
 * 0.400000
 * 0.200000
 * Function Description:
 *
 * Complete the plusMinus function in the editor below.
 *
 * plusMinus has the following parameter(s):
 *
 * int arr[n]: an array of integers
 * Print:
 * Print the ratios of positive, negative, and zero values in the array.
 * Each value should be printed on a separate line with 6 digits after the decimal. The function should not return a value.
 *
 * Input Format:
 *
 * The first line contains an integer, n, the size of the array.
 * The second line contains n space-separated integers that describe arr.
 * Constraints:
 * Output Format:
 * Print the following 3 lines, each to 6 decimals:
 *
 * Proportion of positive values
 * Proportion of negative values
 * Proportion of zeros
 */

public class Problem01_PlusMinus {

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine().trim());
        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());
        plusMinus(arr);
        bufferedReader.close();

    }

    public static void plusMinus(List<Integer> arr) {
        // Write your code here

        int sizeOfArray = arr.size();
        int positiveValue = 0, negativeValue = 0, zeroValue = 0;

        for(Integer value : arr){
            if(value > 0){
                positiveValue++;
            }else if(value < 0){
                negativeValue++;
            }else{
                zeroValue++;
            }
        }
        /*
            Above logic can also be handled as:
            positiveValue += (value > 0) ? 1 : 0;
            negativeValue += (value < 0) ? 1 : 0;
            zeroValue += (value == 0) ? 1 : 0;
         */

        double postiveProp = 0.0, negativeProp = 0.0, zeroProp = 0.0;

        postiveProp = (double) positiveValue / (double) sizeOfArray;
        negativeProp = (double) negativeValue / (double) sizeOfArray;
        zeroProp = (double) zeroValue / (double) sizeOfArray;

        String roundedPositiveNumber = String.format("%.6f", postiveProp);
        String roundedNegativeNumber = String.format("%.6f", negativeProp);
        String roundedZeroNumber = String.format("%.6f", zeroProp);

        System.out.println(Double.valueOf(roundedPositiveNumber));
        System.out.println(Double.valueOf(roundedNegativeNumber));
        System.out.println(Double.valueOf(roundedZeroNumber));
    }
}
