//12. Rectangle class

  // * Fields: 'length', 'width'.
   //* Methods: 'area()', 'perimeter()'.
   //* Create object and print area + perimeter.


package com.aw.automationtraining;

import java.util.Scanner;

public class Rectangle {

    public int area(int length, int width)
    {
        
        return length*width;
    }

    public int perimeter(int length, int width)
    {
        return(2*(length+width));
    }

    public static void main(String[] args) 
    {
        Rectangle r = new Rectangle();
        System.out.println(" Please enter length of the rectangle : ");
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        System.out.println(" Please enter width of the rectangle : ");
        int width = sc.nextInt();
        if(length<=0)
        {
            System.out.println(" Invalid length !! ");
            
        }
        else if (width<=0)
        {
            System.out.println(" Invalid width !! ");
        
        }
        else
        {
            System.out.println(" Area of rectangle is : "+r.area(length, width));
            System.out.println(" Perimeter of rectangle is : "+r.perimeter(length, width));
        }
          
    }
    
}
