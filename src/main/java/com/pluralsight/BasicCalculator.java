package com.pluralsight;

import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {

        // create a scanner
        Scanner newScanner = new Scanner(System.in);
        // ask the user for the first number
        System.out.println("Enter first number: ");
        // store the answer from the user
        int firstValue = newScanner.nextInt();
        // ask the user for the second number
        System.out.println("Enter the second number: ");
        // store the answer from the user
        int secondValue = newScanner.nextInt();
        // ask the user what operation they want to use

        // pulls the enter key out of the buffer so it stops at the next read line
        newScanner.nextLine();

        System.out.println("Possible calculations:\n" +
                "(A)dd\n" +
                "(S)ubtract\n" +
                "(M)ultiply\n" +
                "(D)ivide");
        System.out.println("Please select an option: ");
        String userAnswer = newScanner.nextLine();
        // multiply the two values from the user and print to screen
        System.out.printf("%d * %d = %d", firstValue, secondValue, firstValue * secondValue);
    }
}
