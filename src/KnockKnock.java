/*
 * Assignment 01
 * Description: [Part 2 of 3] "Knock knock" joke generator
 * Name: Kullathon "Mos" Sitthisarnwattanachai
 * Teammate: Amber Hartigan
 * ID: 921425216
 * Class: CSC 210-03
 * Semester: Fall 2020
 */

import java.util.Scanner;

public class KnockKnock {
    public static void main(String[] args) {
        // Run the program loop.
        loop();
    }

    /**
     * Print the program welcome header, as required by (3)(a).
     */
    private static void printHeader() {
        System.out.println("========================================");
        System.out.println("Welcome to my Knock Knock joke generator");
        System.out.println("========================================");
    }

    /**
     * Run the program loop.
     */
    public static void loop() {
        // Print the header.
        printHeader();

        // Create a Scanner object.
        Scanner scan = new Scanner(System.in);

        // Prompts for user to respond to input.
        System.out.println("Knock knock");

        // Expects "Who's there?" Scan and discard input.
        scan.nextLine();
        System.out.println("Annie");

        // "Annie who?" Scan and store the first word (ending on first whitespace).
        String resp = scan.next();
        System.out.printf("%s thing you can do better, I can do better", resp);
    }
}
