package problemSolving;

import java.io.*;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

/**
 * Problem Statement
 */

/**
 *
 * Given a time in -hour AM/PM format, convert it to military (24-hour) time.
 *
 * Note: - 12:00:00AM on a 12-hour clock is 00:00:00 on a 24-hour clock.
 * - 12:00:00PM on a 12-hour clock is 12:00:00 on a 24-hour clock.
 *
 * Example
 *
 *
 * Return '12:01:00'.
 *
 *
 * Return '00:01:00'.
 *
 * Function Description
 *
 * Complete the timeConversion function in the editor below.
 * It should return a new string representing the input time in 24 hour format.
 *
 * timeConversion has the following parameter(s):
 *
 * string s: a time in  hour format
 * Returns
 *
 * string: the time in  hour format
 * Input Format
 *
 * A single string  that represents a time in -hour clock format (i.e.:  or ).
 *
 * Constraints
 *
 * All input times are valid
 *
 */


public class Problem03_TimeConversion {

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = bufferedReader.readLine();

        String result = timeConversion(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();
        bufferedReader.close();
        bufferedWriter.close();

    }

    public static String timeConversion(String s) {
        String updatedTime = "";
        DateTimeFormatter inputFormat = DateTimeFormatter.ofPattern("hh:mm:ssa");
        DateTimeFormatter outputFormat = DateTimeFormatter.ofPattern("HH:mm:ss");
        LocalTime localTime = LocalTime.parse(s, inputFormat);
        updatedTime = localTime.format(outputFormat);

        return updatedTime;
    }
}


/**
 * Alternavtive Approach
 *
 * // if(s.contains("AM") && s.substring(0, 2).equals("12")){
 *         //     updatedTime = s.substring(0, 2).replace("12", "00")+ s.substring(2, s.length()-2);
 *         // }else if(s.contains("PM")){
 *         //     int intValueToBeReplaced = Integer.valueOf(s.substring(0, 2));
 *         //     if(intValueToBeReplaced!=12){
 *         //         intValueToBeReplaced = intValueToBeReplaced + 12;
 *         //         updatedTime = s.substring(0, 2).replace(s.substring(0, 2), String.valueOf(intValueToBeReplaced)+ s.substring(2, s.length()-2));
 *         //     }
 *         // }else{
 *         //     updatedTime = s.replace("AM", "");
 *         // }
 */
