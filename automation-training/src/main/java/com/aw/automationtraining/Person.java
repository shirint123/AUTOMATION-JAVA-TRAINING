package com.aw.automationtraining;

/*
 * 8. this & super Keywords

Assignment:

1. Create a parent class 'Person' with 'name' and 'age'.
2. Create a subclass 'Student' with an extra 'course' field.
3. Use 'super()' to call the parent constructor and 'this' to reference current class variables.

 */

 public class Person
 {
    String name;
    Integer age;

    Person(String name, Integer age)
    {
        this.name = name;
        this.age = age; 
    }
    void displayInfo()
    {
        System.out.println(" Name = "+name);
        System.out.println(" Age = "+age);
    }
 }

 
