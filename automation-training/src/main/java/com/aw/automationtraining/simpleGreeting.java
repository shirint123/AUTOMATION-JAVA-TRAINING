package com.aw.automationtraining;

import java.util.Scanner;

public class simpleGreeting {

    public String greet(String name)
    {
        return" Hello "+ name;
    }

    public static void main(String[] args) 
    {
        simpleGreeting sg = new simpleGreeting();
        System.out.println(" Please enter name ");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println("String = "+sg.greet(name));
    }
    
}
