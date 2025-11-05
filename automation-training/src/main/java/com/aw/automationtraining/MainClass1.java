package com.aw.automationtraining;

/*
 * 10. Encapsulation (getters & setters)

Assignment:

1. Create a class 'Employee' with private fields 'name', 'id', 'salary'.
2. Generate getters and setters for each.
3. In main, set the values and print them using getters.

 */


public class MainClass1
{
    public static void main(String[] args)
    {
        Employee em = new Employee();
        em.setName("Shirin Targaonkar");
        em.setId(101);
        em.setSalary(50000.00);

        System.out.println("Employee details are :");
        System.out.println("Employee Name = "+em.getName());
        System.out.println("Employee id = "+em.getId());
        System.out.println("Employee salary "+em.getSalary());
    }
}