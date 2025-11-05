package com.aw.automationtraining;


/*  Create a custom exception class 'InvalidAgeException'.
2. In main, take an integer 'age' as input.
3. If 'age < 18', throw the exception with a message '"Not eligible for driving license"'.
4. Catch and print the message.
*/

import java.util.Scanner;

// Step 1: Define the custom exception
class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

public class DrivingLicenseCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Step 2: Take age input
            System.out.print("Enter your age: ");
            int age = scanner.nextInt();

            // Step 3: Validate age and throw exception if under 18
            if (age < 18) {
                throw new InvalidAgeException("Not eligible for driving license");
            }

            System.out.println("You are eligible for a driving license.");
        } catch (InvalidAgeException e) {
            // Step 4: Catch and print the exception message
            System.out.println("Exception: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
