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
        System.out.println("Enter your last name: ");
        String lastName = sc.nextLine();

        // Validate the first name
        while(!isValidName(lastName)) {
            System.out.println("Invalid last name! Must start with a capital letter and be at least 3 characters long.");
            lastName = sc.nextLine();
        }
        System.out.println("Valid last name entered: " + lastName);

        // Ask the user to enter their email
        System.out.println("Enter your email: ");
        String email = sc.nextLine();

        // Validate the email format
        while(!isValidEmail(email)) {
            System.out.println("Invalid email! Please enter a valid email.");
            email = sc.nextLine();
        }
        System.out.println("Valid email entered: " + email);

        // Ask the user to enter their contact
        System.out.println("Enter your contact number: ");
        String contact = sc.nextLine();

        // Validate the contact number
        while(!isValidContact(contact)) {
            System.out.println("Invalid contact! Please enter a valid contact.");
            contact = sc.nextLine();
        }
        System.out.println("Valid contact entered: " + contact);

        // Ask the user to enter their password
        System.out.println("Enter your password: ");
        String password = sc.nextLine();

        // Validate the password
        while(!isValidPassword(password)) {
            System.out.println("Invalid password! Please enter a valid password.");
            password = sc.nextLine();
        }
        System.out.println("Valid password entered" );
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

    // UC4: Validate the contact
    public static boolean isValidContact(String contact) {
        // Mobile number pattern with + and country code followed by a 10-digit number
        String contactRegex = "^\\+[0-9]{2}[1-9][0-9]{9}$";
        return contact.matches(contactRegex);
    }

    //UC5: Validate password
    public static boolean isValidPassword(String password) {
        // UC6: At least one Upper Case Letter
        String passRegex = ".*[A-Z].*";
        // Check if the password has a minimum of 8 characters
        return password.length() >= 8 && password.matches(passRegex);
    }
}

