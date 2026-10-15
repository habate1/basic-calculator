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
    }
}
