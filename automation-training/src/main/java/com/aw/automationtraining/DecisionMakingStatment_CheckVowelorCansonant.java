package com.aw.automationtraining;
import java.util.*;

public class DecisionMakingStatment_CheckVowelorCansonant {

    public static void main(String[] args) {
       
        char ch;
        Scanner sc = new Scanner(System.in) ;
        do {

        System.out.print(" Please enter character of your choice: ");
        ch = sc.next().charAt(0);
        if(ch =='z')
            {
                System.out.println(" This is the last character !!!");
                break;
            }
            switch(ch)
            {
                case  'a' :
                case  'A' :
                case  'e' :
                case  'E' :
                case  'i' :
                case  'I' : 
                case  'o' :
                case  'O' :
                case  'u' :
                case  'U' :
                System.out.print(" Entered character "+ch+ " is vawel ");
                System.out.println();
                break;
                default :
                System.out.print(" Entered character "+ch+ " is Cansonant "); 
                System.out.println();
            }
            
        } while(true); 
    }      
 }
    

