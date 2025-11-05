package com.aw.automationtraining;
import java.util.*;

/* 11. Exception Handling

Assignment:

1. Write a program that divides two numbers.
2. Use 'try', 'catch', and 'finally' to handle 'ArithmeticException'.
3. Print '"Division complete"' in the 'finally' block.
*/

public class DevisionException
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        try
        {
            System.out.println(" Please enter numerator ");
            int numerator = sc.nextInt();

            System.out.println(" Please enter denominator");
            int denominator =sc.nextInt();

            int devision = numerator/denominator;
            System.out.println(" Numerator = "+numerator);
            System.out.println("denominator = "+denominator);
            System.out.println(" Devision = "+devision);
        }
        catch(ArithmeticException e)
        {
            System.out.println(" Error : Invalid devision : Can not devide by zero");
        }
        finally
        {
            System.out.println("Devision completed & result displayed ");
            
        }
    }
}