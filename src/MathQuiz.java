/*
 * Assignment 01
 * Description: [Part 3 of 3] Own idea: math quiz mini-game
 * Name: Kullathon "Mos" Sitthisarnwattanachai
 * Teammate: Amber Hartigan
 * ID: 921425216
 * Class: CSC 210-03
 * Semester: Fall 2020
 */

import java.util.Scanner;

class MathQuiz {
    public static void main(String[] args) {
        // Run the program loop.
        loop();
    }

    /**
     * Print the program welcome header, as required by (3)(a).
     */
    private static void printHeader() {
        System.out.println("=======================");
        System.out.println("Welcome to my math quiz");
        System.out.println("=======================");
    }

    /**
     * Evaluate the answer and print the corresponding messages.
     * @param number The number that is to be squared; provided
     *               by the user in the first part.
     * @param userAnswer The answer that the user provided.
     */
    private static void evaluate(int number, int userAnswer) {
        // This is the expected answer.
        int expectedAnswer = number * number;

        /*
            Determine which message to use, depending on the user's
            answer. "Correct" if the answer matches the expected
            answer. Otherwise "Incorrect".
         */
        String msg = userAnswer == expectedAnswer ? "Correct" : "Incorrect";

        System.out.printf("\n>>> %s! The answer is: %d.", msg, expectedAnswer);
    }

    private static void loop() {
        // Print the header.
        printHeader();

        // Create a Scanner object.
        Scanner scan = new Scanner(System.in);

        // Prompt for a user for a number.
        System.out.print("Enter an integer: ");
        int number = scan.nextInt();

        // Ask user for an answer to their number.
        System.out.printf("What is the value of %1$d squared (%1$d^2)? Answer: ", number);
        int answer = scan.nextInt();

        // Evaluate the given answer and display a message accordingly.
        evaluate(number, answer);
    }
}