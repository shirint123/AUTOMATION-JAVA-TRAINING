/*
 * 1. Create a 'Vector<Integer>' to store response codes ('200, 404, 500, 302').
2. Add elements, then print them using 'Enumeration'.
3. Add and remove some values, observe the order.

 */
package com.aw.automationtraining;
import java.util.Vector;
import java.util.Enumeration;

public class VectorDemo1
{
    public static void main(String[] args)
    {
        Vector<Integer> responseCode = new Vector<>();
        responseCode.add(200);
        responseCode.add(404);
        responseCode.add(500);
        responseCode.add(302);
        System.out.println(" Printing elements of Vector using Enum ");
        Enumeration<Integer> e = responseCode.elements();
        while(e.hasMoreElements())
        {
            System.out.println(e.nextElement());
        }
        System.out.println(" Adding element to vector(responseCode) ");
        responseCode.add(201);
        System.out.println(" Removing 500 from Vetcor(responseCode)");
        responseCode.remove(Integer.valueOf(500));
        System.out.println("Printing elements of vector" );
        Enumeration<Integer> e1 = responseCode.elements();
        while(e1.hasMoreElements())
        {
            System.out.println(e1.nextElement());
        }
        
    }
}
