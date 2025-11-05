package com.aw.automationtraining;
import java.io.FileReader;
import java.io.IOException;

public class ExceptionDemo {
    public static void main(String[] args) {
        // Checked Exception: IOException while reading a file
        try {
            FileReader reader = new FileReader("sample.txt"); // Ensure this file exists or handle the exception
            int character;
            System.out.println("File contents:");
            while ((character = reader.read()) != -1) {
                System.out.print((char) character);
            }
            reader.close();
        } catch (IOException e) {
            System.out.println("IOException caught: " + e.getMessage());
        }

        System.out.println("\n---");

        // Unchecked Exception: ArithmeticException due to division by zero
        try {
            int result = 10 / 0; // This will throw ArithmeticException
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException caught: " + e.getMessage());
        }
    }
}
