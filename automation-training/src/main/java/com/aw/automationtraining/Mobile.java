package com.aw.automationtraining;

public class Mobile 
{
    String brand;
    float price;

    public void printDetails(String brand, float price)
    {
        System.out.println(" Mobile brand : "+brand);
        System.out.println(" Mobile price : "+price);
    }
    public static void main(String[] args) 
    {
        Mobile m1 = new Mobile();
        Mobile m2 = new Mobile();

        System.out.println(" Mobile1 infor : ");
        m1.brand = "Redmi";
        m1.price = 10000.00f;
        m1.printDetails(m1.brand,m1.price);

        System.out.println(" Mobile2 infor : ");
        m2.brand = "Samsung Galaxy";
        m2.price = 24000.00f;
        m2.printDetails(m2.brand,m2.price);

    }
    
}
