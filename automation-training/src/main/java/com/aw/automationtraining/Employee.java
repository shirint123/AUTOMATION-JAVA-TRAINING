package com.aw.automationtraining;
/*
 10. Encapsulation (getters & setters)

Assignment:

1. Create a class 'Employee' with private fields 'name', 'id', 'salary'.
2. Generate getters and setters for each.
3. In main, set the values and print them using getters.

 */

public class Employee
{
    private String name;
    private int id;
    private double salary;

    public String getName()
    {
        return name;
    }

    public int getId()
    {
        return id;
    }

    public double getSalary()
    {
        return salary;
    }

    public void setName(String name)
    {
        this.name=name;
    }

    public void setId(int id)
    {
        this.id=id;
    }
    public void setSalary(double salary)
    {
        this.salary=salary;
    }

}
