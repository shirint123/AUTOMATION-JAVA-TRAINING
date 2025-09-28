package com.aw.automationtraining;
import java.util.Scanner;

public class stopatNegative {

    public static void main(String[] args) 
    {
        boolean negativeNumber = false;
        System.out.println(" Please 10 numbers : ");
        Scanner sc = new Scanner(System.in);
        int [] myNumber = new int[10];
        for(int i=0; i<10; i++)
        {
            System.out.print(" Enter "+(i) + " number : ");
            myNumber[i] = sc.nextInt();
            if(myNumber[i]<0)
            {
                negativeNumber = true;
                break;
            }
            else
            {
                continue;
            }

        }
        
    }
    
}
