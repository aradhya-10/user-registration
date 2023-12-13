package org.example;

import java.util.Scanner;

public class UserRegistration {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Ask the user to enter the first name
        System.out.println("Enter your first name: ");
        String firstName = sc.nextLine();

        // Validate the first name
        while(!isValidName(firstName)) {
            System.out.println("Invalid first name! Please enter a first name starting with a capital letter and at least 3 characters long.");
            firstName = sc.nextLine();
        }
        System.out.println("Valid first name entered: " + firstName);

        // Ask the user to enter the last name
        System.out.println("Enter your first name: ");
        String lastName = sc.nextLine();

        // Validate the first name
        while(!isValidName(lastName)) {
            System.out.println("Invalid last name! Please enter a last name starting with a capital letter and at least 3 characters long.");
            lastName = sc.nextLine();
        }
        System.out.println("Valid last name entered: " + lastName);
    }

    // UC1 & UC2: Validate the first and last names
    public static boolean isValidName(String name) {
    //    return firstName.length() >= 3 && Character.isUpperCase(firstName.charAt(0));
        String nameRegex = "^[A-Z][a-zA-Z]{2,}$";
        return name.matches(nameRegex);
    }
}

