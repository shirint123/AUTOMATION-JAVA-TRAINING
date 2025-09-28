// 9. Check eligibility
// Create a method 'boolean isEligible(int age)' that returns true if age ≥ 18, otherwise false.


package com.aw.automationtraining;

import java.util.Scanner;

public class checkEligibility 
{
    public boolean isEligible(int age)
    {
        if(age>=18)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public static void main(String[] args) 
    {
        checkEligibility ck = new checkEligibility();
        System.out.print(" Please enter age : ");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        System.out.print(ck.isEligible(age));
    }
    
}
