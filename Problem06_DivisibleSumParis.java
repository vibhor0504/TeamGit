package problemSolving;

import java.io.*;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

/**
 * Problem Statement
 */

/**
 * Given an array of integers and a positive integer , determine the number of  pairs where  and  +  is divisible by .
 *
 * Example
 *
 *
 *
 * Three pairs meet the criteria:  and .
 *
 * Function Description
 *
 * Complete the divisibleSumPairs function in the editor below.
 *
 * divisibleSumPairs has the following parameter(s):
 *
 * int n: the length of array
 * int ar[n]: an array of integers
 * int k: the integer divisor
 * Returns
 * - int: the number of pairs
 *
 * Input Format
 *
 * The first line contains  space-separated integers,  and .
 * The second line contains  space-separated integers, each a value of .
 *
 * Constraints
 *
 * Sample Input
 *
 * STDIN           Function
 * -----           --------
 * 6 3             n = 6, k = 3
 * 1 3 2 6 1 2     ar = [1, 3, 2, 6, 1, 2]
 * Sample Output
 *
 *  5
 */


public class Problem06_DivisibleSumParis {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n = Integer.parseInt(firstMultipleInput[0]);

        int k = Integer.parseInt(firstMultipleInput[1]);

        List<Integer> ar = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        int result = divisibleSumPairs(n, k, ar);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }

    public static int divisibleSumPairs(int n, int k, List<Integer> ar) {
        int count = 0;

        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if ((ar.get(i) + ar.get(j)) % k == 0) {
                    count++;
                }
            }
        }
        return count;
    }
}
