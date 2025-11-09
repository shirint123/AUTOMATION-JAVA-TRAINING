
package com.aw.automationtraining;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetsDemo
{
    public static void main(String[] args)
    {
        SortedSet<Integer> responseTime = new TreeSet<>();
        responseTime.add(320);
        responseTime.add(150);
        responseTime.add(180);
        responseTime.add(450);
        responseTime.add(150);
        System.out.println(" Elements of SortedSet(TreeSet)");
        System.out.println(responseTime);
        System.out.println(" Removing first element ");
        if (!responseTime.isEmpty()) 
        {
            Integer smallest = responseTime.first();
            Integer largest = responseTime.last();

            responseTime.remove(smallest);
            responseTime.remove(largest);
            System.out.println("After removing smallest (" + smallest + 
                               ") and largest (" + largest + ") values:");
            System.out.println("Updated Response Times: " + responseTime);

        }
    }
}