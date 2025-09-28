package com.aw.automationtraining;

import java.util.Scanner;

public class FindFirstEvennumber {

    
    public static void main(String[] args) {
        boolean foundEven = false;
        System.out.print(" Please enter total no of array elelemts : ");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int [] myNumber = new int[size];
        for(int i=0; i<size; i++)
        {
            System.out.print(" Enter "+(i) + " Element : ");
            myNumber[i] = sc.nextInt();
            

        }

        for(int ele : myNumber)
        {
            if(ele%2==0)
            {
                System.out.println("First even number found !! " +ele);
                foundEven = true;
                break;
            }
           
            else
            {
                System.out.println(ele);
            }
            
            
        }
        
        if(foundEven!=true)
        System.out.println(" No even number found !! ");
    }
    
}
