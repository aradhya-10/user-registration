package org.example;

import java.util.Scanner;

public class UserRegistration {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Ask the user to enter the first name
        System.out.println("Enter your first name: ");
        String firstName = sc.nextLine();

        // Validate the first name
        while(!isValidFirstName(firstName)) {
            System.out.println("Invalid first name! Please enter a first name starting with a capital letter and at least 3 characters long.");
            firstName = sc.nextLine();
        }
        System.out.println("Valid first name entered: " + firstName);
    }

    // UC1: Validate the first name
    public static boolean isValidFirstName(String firstName) {
    //    return firstName.length() >= 3 && Character.isUpperCase(firstName.charAt(0));
        String firstNameRegex = "^[A-Z][a-zA-Z]{2,}$";
        return firstName.matches(firstNameRegex);
    }
}

