package com.aw.automationtraining;

public class LoopingStatment_TableOfFive {

    public void printTable()
    {
        System.out.println(" Table of 5 : ");
        int counter =1;
        while(counter<=10)
        {
            System.out.println("5 X "+counter+" = "+(5*counter));
            counter++;
        }
    }

    public static void main(String[] args) {
        LoopingStatment_TableOfFive l1 = new LoopingStatment_TableOfFive();
        l1.printTable();
        
    }
    
}
