public class VeriablesAssignment1 {
// Variables - Assignment 1 :Create & print variables
    String name = "Shirin";
    int age = 30;
    double marks = 95.78;
    boolean isPassed = true;
    final double PI = 3.14;
    //Changing value of final variable will give error
   // PI=3.16;
    

    public static void main(String[] args) {
        VeriablesAssignment1 v1= new VeriablesAssignment1();
        System.out.println("Example of string variable: Name = " + v1.name);
        System.out.println("Example of integer variable: Age = " + v1.age);
        System.out.println("Example of double variable: Marks = " + v1.marks);
        System.out.println("Example of boolean variable: Is Passed = " + v1.isPassed);
        //Declare counter variable, assigned value 1 to it and print it
        //create a variable inside main method and print it
        int Counter = 1;
        System.out.println("Example of integer variable: Counter = " + Counter);
        // increment the counter variable and print it
        Counter++;
        System.out.println("Example of integer variable: Counter = " + Counter);
        
       
    }

    
}
