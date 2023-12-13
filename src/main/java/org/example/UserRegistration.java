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
            System.out.println("Invalid first name! Must start with a capital letter and be at least 3 characters long.");
            firstName = sc.nextLine();
        }
        System.out.println("Valid first name entered: " + firstName);

        // Ask the user to enter the last name
        System.out.println("Enter your first name: ");
        String lastName = sc.nextLine();

        // Validate the first name
        while(!isValidName(lastName)) {
            System.out.println("Invalid last name! Must start with a capital letter and be at least 3 characters long.");
            lastName = sc.nextLine();
        }
        System.out.println("Valid last name entered: " + lastName);

        // Ask the user to enter the last name
        System.out.println("Enter your email: ");
        String email = sc.nextLine();

        // Validate the first name
        while(!isValidName(email)) {
            System.out.println("Invalid email! Please enter a valid email.");
            email = sc.nextLine();
        }
        System.out.println("Valid email entered: " + email);
    }

    // UC1 & UC2: Validate the first and last names
    public static boolean isValidName(String name) {
    //    return firstName.length() >= 3 && Character.isUpperCase(firstName.charAt(0));
        String nameRegex = "^[A-Z][a-zA-Z]{2,}$";
        return name.matches(nameRegex);
    }

    // UC3: Validate the email
    public static boolean isValidEmail(String email) {
        // Email pattern with 3 mandatory parts and 2 optional parts with precise @ and . positions
        String emailRegex = "^[a-zA-Z0-9]+([._+-][a-zA-Z0-9]+)*@[a-zA-Z0-9]+(\\.[a-zA-Z]{2,}){1,2}$";
        return email.matches(emailRegex);
    }
}

