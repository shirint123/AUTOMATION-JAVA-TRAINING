package com.aw;

public class ExpressionsAssignment3 {

    int length =5;
    int breadth=3;
    int mark1=80;
    int mark2=90;
    int mark3=70;
    String firstName="Shirin";
    String lastName="Targaonkar";
    int totalMarks=500;
    int obtainedMarks=420;

    
    public static void main(String[] args) {
        ExpressionsAssignment3 e1=new ExpressionsAssignment3();

        System.out.println(" Simple Expressions example : Area of "+ e1.length +" & "+ e1.breadth +" = "+(e1.length*e1.breadth));
        System.out.println(" Math Expressions example : Average of "+ e1.mark1 +","+ e1.mark2 +" & "+ e1.mark3 + " = "+
        (e1.mark1+e1.mark2+e1.mark3)/3);
        System.out.println(" String Expression example : Full Name = "+ e1.firstName+e1.lastName);
        System.out.println(" Combined Expression example : Percentage of "+ e1.totalMarks +" & "+ e1.obtainedMarks + " = "
        +(e1.obtainedMarks*100)/e1.totalMarks);

    }

    
}
