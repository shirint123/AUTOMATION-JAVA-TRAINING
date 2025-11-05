package com.aw.automationtraining;
import java.util.Scanner;


public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String userName = sc.nextLine();

        
        // Using StringBuilder to reverse the string
        StringBuilder reversedName = new StringBuilder(userName);
        reversedName.reverse();
        
        StringBuffer finalMessage = new StringBuffer();
        finalMessage.append(reversedName);

        finalMessage.append(" - Welcome to Automation Training");
        System.out.println(finalMessage.toString());


    }
}
