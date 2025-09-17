package com.aw.automationtraining;
import java.util.*;

public class DecisionMakingStatment_EvenOddNo {

    public static void main(String[] args) {

        int no=25;

        if(no/2==0)
        {
            System.out.println(no+" is even no ");
        }
        else
        {
            System.out.println(no+" is odd no ");
        }
        
        Scanner sc =new Scanner (System.in);
        System.out.println(" Please enter any no : ");
        int num = sc.nextInt();
        if(num/2==0)
        {
            System.out.println(" Entered no " +num+" is even no ");
        }
        else
        {
            System.out.println(" Entered no " +num+" is odd no ");
        }

    }
    
}
