/*
 * Create a 'LinkedHashSet<String>' named 'executedTests'.
2. Add: '"LoginTest"', '"AddToCartTest"', '"PaymentTest"', '"LoginTest"'.
3. Print all elements and notice insertion order is preserved.

 */

package com.aw.automationtraining;
import java.util.LinkedHashSet;

public class LinkedHashSetDemo
{
    public static void main(String[] args)
    {
        LinkedHashSet<String> executedTests = new LinkedHashSet<>();
        executedTests.add("LoginTest");
        executedTests.add("AddToCartTest");
        executedTests.add("PaymentTest");
        executedTests.add("AddToCartTest");
        System.out.println(" Elements of LinkedHashSet ");
        for(String e:executedTests)
        {
            System.out.println(e);
        }
    
    }
}