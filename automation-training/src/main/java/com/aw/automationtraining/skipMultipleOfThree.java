package com.aw.automationtraining;

public class skipMultipleOfThree {

    public static void main(String[] args)
    {
        System.out.println("1 to 15 numbers skipping multiples of 3 ");
        for(int i=1; i<=15; i++)
        {
            if(i%3!=0)
            {
                System.out.println(i);
                continue;
            }
        }

    }
    
}
