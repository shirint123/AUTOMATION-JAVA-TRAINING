package com.aw.automationtraining;
import java.util.*;

public class DecisionMakingStatments_LargestOfThree {

    public static void main(String[] args) {

        int no1=10;
        int no2=20;
        int no3=30;

        if(no1>no2 && no1>no3)
        {
            System.out.println(no1+" is greatest of "+ no1+" "+no2+" "+no3);
        }
        else if(no2>no1 && no2>no3)
        {
            System.out.println(no2+" is greatest of "+ no1+" "+no2+" "+no3);
        }

        else
        {
            System.out.println(no3+" is greatest of "+ no1+" "+no2+" "+no3);
        }

        Scanner sc = new Scanner(System.in);
        System.out.print(" Please enter first no : ");
        int num1 =sc.nextInt();
        System.out.print(" Please enter second no : ");
        int num2 =sc.nextInt();
        System.out.print(" Please enter third no : ");
        int num3 =sc.nextInt();

        if(num1>num2 && num1>num3)
        {
            System.out.println(num1+" is greatest of "+ num1+" "+num2+" "+num3);
        }
        else if(num2>num1 && num2>num3)
        {
            System.out.println(num2+" is greatest of "+ num1+" "+num2+" "+num3);
        }

        else
        {
            System.out.println(num3+" is greatest of "+ num1+" "+num2+" "+num3);
        }



    }
    
}
