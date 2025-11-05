package com.aw.automationtraining;
/* 
 Class, Object, Constructor

Assignment:
Create a class 'Car' with attributes: 'brand', 'model', 'price'.

* Create a parameterized constructor and a method 'displayCarInfo()'.
* In the main class, create two objects and print their info.

 */

 public class ConstructorDemo
 {
    String brand;
    String model;
    float price;

    public ConstructorDemo(String brand,String model,float price)
    {
        this.brand=brand;
        this.model=model;
        this.price =price;
        
    }

    public void displayCarinfo( )
    {
        System.out.println(" Car brand = "+brand);
        System.out.println(" Car model = "+model);
        System.out.println(" Car price = "+price);
    }

    public static void main(String[] args)
    {
        ConstructorDemo cd = new ConstructorDemo("BMW","BMW-X7",1.25f);
        System.out.println("Output from first object ");
        cd.displayCarinfo();
        System.out.println("------------------------------------");
        ConstructorDemo cd1 = new ConstructorDemo("Skoda","Kalaq",7.55f);
        System.out.println("Output from second object ");
        cd1.displayCarinfo();

    }
 }

