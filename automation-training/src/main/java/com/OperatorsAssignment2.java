package com;

public class OperatorsAssignment2 {

    int a=10;    
    int b=3;
    int x=5;
    int y=10;
    boolean hasPen=true;
    boolean hasBook=false;
    int num = 10;
    int age =18;
   
    public static void main(String[] args) {
        OperatorsAssignment2 O1=new OperatorsAssignment2();
        // Arithmatic operators
        System.out.println("****************Arithmatic Operators************************");
        System.out.println("Arithmatic operators");
        System.out.println("Addition of a and b = " + (O1.a + O1.b));
        System.out.println("Subtraction of a and b = " + (O1.a - O1.b));
        System.out.println("Multiplication of a and b = " + (O1.a * O1.b));
        System.out.println("Division of a and b = " + (O1.a / O1.b));
        System.out.println("Modulus of a and b = " + (O1.a % O1.b));
        System.out.println("************************************************************");
        //Relational operators
        System.out.println("****************Relational Operators************************");
        
        if((O1.x == O1.y))
        System.out.println(" X = "+O1.x+", Y = "+O1.y+"are equal");

        if((O1.x != O1.y))
        System.out.println(" X = "+O1.x+", Y = "+O1.y+" are not equal");
        System.out.println("************************************************************");

        //Logical operators
        //Result of logical AND operator
        System.out.println("****************Logical Operators************************");
        System.out.println("Result of logical AND operator hasPen and hasBook= " + (O1.hasPen && O1.hasBook));
        //Result of logical OR operator
        System.out.println("Result of logical OR operator hasPen or hasBook= " + (O1.hasPen || O1.hasBook));
        //Result of logical NOT operator
        System.out.println("Result of logical NOT operator hasPen= " + (!O1.hasPen));
        System.out.println("************************************************************");

        //Assignment operators
        System.out.println("****************Assignment Operators************************");
        O1.num+=5;
        System.out.println("Value of num+=5 : " + O1.num);
        O1.num-=2;
        System.out.println("Value of num-=2 : " + O1.num);
        O1.num*=3;
        System.out.println("Value of num*=3 : " + O1.num);
        O1.num/=4;
        System.out.println("Value of num/=4 : " + O1.num);
        
        System.out.println("************************************************************");

        //Ternary operator
        System.out.println("****************Ternary Operators************************");
        String result= (O1.age>=18) ? "Adult" : "Minor";
        System.out.println("Result of age comparision using ternary operator age>=18 : " + result);
        System.out.println("************************************************************");
        
    }
       
    
}
