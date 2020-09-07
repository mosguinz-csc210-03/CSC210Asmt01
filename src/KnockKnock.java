/*
 * Assignment 01
 * Description: [Part 2 of 3] "Knock knock" joke generator
 * Name: Kullathon "Mos" Sitthisarnwattanachai
 * ID: 921425216
 * Class: CSC 210-03
 * Semester: Fall 2020
 */

import java.util.Scanner;

public class KnockKnock {
    public static void main(String[] args) {
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
    private static void loop() {
        printHeader();

        // Create a Scanner object.
        Scanner scan = new Scanner(System.in);

        // Prompts for user to respond to input.
        System.out.println("Knock knock");
        scan.nextLine();  // "Who's there?"
        System.out.println("Annie");
        String resp = scan.next(); // "Annie who?"
        System.out.printf("%s thing you can do better", resp);
    }
}
