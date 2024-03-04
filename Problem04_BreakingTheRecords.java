package problemSolving;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

/**
 * Problem Statement
 */

/**
 *
 * Maria plays college basketball and wants to go pro. Each season she maintains a record of her play.
 * She tabulates the number of times she breaks her season record for most points and least points in a game.
 * Points scored in the first game establish her record for the season, and she begins counting from there.
 *
 * Example
 *
 * Scores are in the same order as the games played. She tabulates her results as follows:
 *
 *                                      Count
 *     Game  Score  Minimum  Maximum   Min Max
 *      0      12     12       12       0   0
 *      1      24     12       24       0   1
 *      2      10     10       24       1   1
 *      3      24     10       24       1   1
 * Given the scores for a season, determine the number of times Maria breaks her records
 * for most and least points scored during the season.
 *
 * Function Description
 *
 * Complete the breakingRecords function in the editor below.
 *
 * breakingRecords has the following parameter(s):
 *
 * int scores[n]: points scored per game
 * Returns
 *
 * int[2]: An array with the numbers of times she broke her records. Index  is for breaking most points records,
 * and index  is for breaking least points records.
 * Input Format
 *
 * The first line contains an integer , the number of games.
 * The second line contains  space-separated integers describing the respective values of .
 *
 */



public class Problem04_BreakingTheRecords {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> scores = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        List<Integer> result = breakingRecords(scores);

        bufferedWriter.write(
                result.stream()
                        .map(Object::toString)
                        .collect(joining(" "))
                        + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();
    }
    public static List<Integer> breakingRecords(List<Integer> scores) {

        int minScore = scores.get(0);
        int maxScore = scores.get(0);
        int minCount = 0;
        int maxCount = 0;

        for (int i = 1; i < scores.size(); i++) {
            int currentScore = scores.get(i);

            if (currentScore < minScore) {
                minScore = currentScore;
                minCount++;
            } else if (currentScore > maxScore) {
                maxScore = currentScore;
                maxCount++;
            }
        }

        List<Integer> result = new ArrayList<>();
        result.add(maxCount);
        result.add(minCount);
        return result;
    }
}
