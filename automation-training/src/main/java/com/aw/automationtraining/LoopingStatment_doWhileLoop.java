package com.aw.automationtraining;
import java.util.*;

public class LoopingStatment_doWhileLoop {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int number;
         do
         {
            System.out.println(" Please enter any number ");
            number = sc.nextInt();
         } while(number !=0);

    }
    
}
