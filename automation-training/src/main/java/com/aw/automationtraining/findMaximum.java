//8. Find maximum
  // Create a method 'int max(int a, int b)' that returns the larger number using 'return'


package com.aw.automationtraining;

import java.util.Scanner;

public class findMaximum {

    public int max(int a, int b)
    {
        if(a>b)
        {
            return a;
        }
        else
        {

            return b;
        }
    }

    public static void main(String[] args) 
    {
        findMaximum fm = new findMaximum();
        System.out.print(" Enter first number : ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.print(" Enter second number : ");
        int b = sc.nextInt();
        System.out.println("  Larger of "+ a +" & " + b +" = "+fm.max(a,b));

    }
    
}
