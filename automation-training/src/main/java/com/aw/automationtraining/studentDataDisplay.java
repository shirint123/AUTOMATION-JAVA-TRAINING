//10. Student class

//* Fields: 'name', 'age'.
//* Method: 'display()'.
//* Create 2 student objects and display details.


package com.aw.automationtraining;

public class studentDataDisplay {

    public void display(String name, int age)
    {
        System.out.print(" Student name = "+name);
        System.out.println(" Student age = "+age);
    }

    public static void main(String[] args) 
    {
        studentDataDisplay sd =new studentDataDisplay();
        sd.display("Priyanka",16);
        studentDataDisplay sd1 =new studentDataDisplay();
        sd1.display("Mukta",18);
    }

    
}
