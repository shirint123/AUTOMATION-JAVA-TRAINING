// 6. Skip odd numbers
// Print all even numbers between 1 and 20 by skipping odds using 'continue'.

package com.aw.automationtraining;

public class skipOddNumbers 
{

    public static void main(String[] args) 
    {
        System.out.println(" Printing all even numbers between 1 to 20 skipping odd numbers ");

        for(int i=1; i<=20; i++)
        {
            if(i%2==0)
            {
                System.out.println(i);
                continue;
            }
        }
    }

    
}
