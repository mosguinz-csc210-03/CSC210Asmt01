/*
 * Assignment 01
 * Description: [Part 1 of 3] BMI calculator
 * Name: Kullathon "Mos" Sitthisarnwattanachai
 * Teammate: Amber Hartigan
 * ID: 921425216
 * Class: CSC 210-03
 * Semester: Fall 2020
 */

import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        // Run the program loop.
        loop();
    }

    /**
     * Print the program welcome header, as required by (3)(a).
     */
    private static void printHeader() {
        System.out.println("============================");
        System.out.println("Welcome to my BMI calculator");
        System.out.println("============================");
    }

    /**
     * Calculate the BMI from the given weight and height.
     *
     * @param weight Weight in pounds.
     * @param height Height in inches.
     * @return The BMI value (lbs/in^2).
     */
    private static double calculateBMI(double weight, double height) {
        return 703 * weight / (height * height);
    }

    /**
     * Run the program loop.
     */
    private static void loop() {
        // Print the header.
        printHeader();

        // Create a Scanner object.
        Scanner scan = new Scanner(System.in);
        
        // Input prompts for height (in feet and inches, separately).
        System.out.println("Please enter your height in feet and inches (press Enter after each number)");
        System.out.print("Feet: ");

        // Scan and store the user's input for height in feet.
        int heightFt = scan.nextInt();
        System.out.print("Inches: ");

        // Scan and store the user's input for height in inches.
        int heightIn = scan.nextInt();
        System.out.printf("Your height: %d'%d\"", heightFt, heightIn);

        // Input prompt for weight.
        System.out.printf("\n\nPlease enter your weight in pounds: ");
        double weight = scan.nextDouble();

        // Format and print output to 2 decimal places.
        System.out.printf("Your weight: %.2f lbs", weight);
        System.out.printf("\n\n>>> Your BMI is: %.2f", calculateBMI(weight, heightFt * 12 + heightIn));
    }
}
