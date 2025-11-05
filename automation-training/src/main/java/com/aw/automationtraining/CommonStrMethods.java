package com.aw.automationtraining;

import java.util.Scanner;


public class CommonStrMethods 
{
    public static void main(String[] args) 
    {
        // user of method - contains()
        Scanner sc = new Scanner(System.in);
        System.out.println(" Please enter sentence having Selenium word : ");
        String str= sc.nextLine();
        if(str.contains("Selenium"))
        {
            System.out.println("Word Selenium found in the sentence ");
        }
        else if (str.contains("selenium"))
        {
            System.out.println("Word selenium found in the sentence ");
        }
        else
        {
            System.out.println("Word Selenium or selenium not found in the sentence ");
        }
        
        
    }
}