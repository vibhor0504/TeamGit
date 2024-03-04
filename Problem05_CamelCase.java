package problemSolving;

import java.util.Scanner;


/**
 * Problem Statement
 */

/**
 * Camel Case is a naming style common in many programming languages. In Java, method and variable names typically
 * start with a lowercase letter, with all subsequent words starting with a capital letter (example: startThread).
 * Names of classes follow the same pattern, except that they start with a capital letter (example: BlueCar).
 *
 * Your task is to write a program that creates or splits Camel Case variable, method, and class names.
 *
 * Input Format
 *
 * Each line of the input file will begin with an operation (S or C) followed by a semi-colon followed by M, C, or V
 * followed by a semi-colon followed by the words you'll need to operate on.
 * The operation will either be S (split) or C (combine)
 * M indicates method, C indicates class, and V indicates variable
 * In the case of a split operation, the words will be a camel case method, class or variable name that you need
 * to split into a space-delimited list of words starting with a lowercase letter.
 * In the case of a combine operation, the words will be a space-delimited list of words starting with lowercase letters
 * that you need to combine into the appropriate camel case String. Methods should end with an empty set of parentheses to
 * differentiate them from variable names.
 * Output Format
 *
 * For each input line, your program should print either the space-delimited list of words (in the case of a split operation)
 * or the appropriate camel case string (in the case of a combine operation).
 * Sample Input
 *
 * S;M;plasticCup()
 *
 * C;V;mobile phone
 *
 * C;C;coffee machine
 *
 * S;C;LargeSoftwareBook
 *
 * C;M;white sheet of paper
 *
 * S;V;pictureFrame
 *
 * Sample Output
 *
 * plastic cup
 *
 * mobilePhone
 *
 * CoffeeMachine
 *
 * large software book
 *
 * whiteSheetOfPaper()
 *
 * picture frame
 *
 * Explanation
 *
 * Use Scanner to read in all information as if it were coming from the keyboard.
 *
 * Print all information to the console using standard output (System.out.print() or System.out.println()).
 *
 * Outputs must be exact (exact spaces and casing).
 */

public class Problem05_CamelCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextLine()) {
            String input = scanner.nextLine();
            processInput(input);
        }
        scanner.close();
    }

    private static void processInput(String input) {
        String[] parts = input.split(";");
        char operation = parts[0].charAt(0);
        char type = parts[1].charAt(0);
        String words = parts[2];
        if(words.contains("()")){
            words = words.substring(0,words.length()-2);
        }

        switch (operation) {
            case 'S':
                splitAndPrint(operation,type, words);
                break;
            case 'C':
                combineAndPrint(operation,type, words);
                break;
            default:
                System.out.println("Invalid operation");
        }
    }

    private static void splitAndPrint(char operation, char type, String words) {
        String[] splitWords = words.split("(?=[A-Z])|(?<=[a-z])(?=[0-9])|(?<=[0-9])(?=[a-z])");
        for (int i = 0; i < splitWords.length; i++) {
            splitWords[i] = splitWords[i].toLowerCase();
        }

        String result = String.join(" ", splitWords);
        printResult(operation,type, result);
    }

    private static void combineAndPrint(char operation, char type, String words) {
        String[] splitWords = words.split(" ");
        StringBuilder result = new StringBuilder();
        int count = 0;
        if (type == 'M') {
            for (String splitWord : splitWords) {
                if(count==0){
                    result.append(splitWord.substring(0, 1).toLowerCase())
                            .append(splitWord.substring(1));
                }else{
                    result.append(splitWord.substring(0, 1).toUpperCase())
                            .append(splitWord.substring(1));
                }

                count++;
            }
            result.append("()");
        } else if (type == 'C' || type == 'V') {
            for (String splitWord : splitWords) {
                result.append(splitWord.substring(0, 1).toUpperCase())
                        .append(splitWord.substring(1).toLowerCase());
            }
        }

        printResult(operation,type, result.toString());
    }

    private static void printResult(char operation, char type, String result) {
        if (type == 'M') {
            System.out.println(result);
        } else if (type == 'C' && operation == 'C') {
            System.out.println(result.substring(0, 1).toUpperCase() + result.substring(1));
        } else if (type == 'C' && operation == 'S') {
            System.out.println(result.substring(0, 1).toLowerCase() + result.substring(1));
        }
        else if (type == 'V'){
            System.out.println(result.substring(0, 1).toLowerCase() + result.substring(1));
        }else {
            System.out.println("Invalid type");
        }
    }

}

