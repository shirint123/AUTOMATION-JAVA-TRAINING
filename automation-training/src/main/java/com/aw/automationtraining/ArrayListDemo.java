package com.aw.automationtraining;
import java.util.ArrayList;
import java.util.HashSet;

/* 5. ArrayList, LinkedList, HashSet, HashMap

Assignment:

1. Create an 'ArrayList<String>' of browser names and print them.
2. Create a 'HashSet<String>' to remove duplicate browser names.
3. Create a 'HashMap<String, String>' with 'TestCaseName' -> 'Status'. Print all entries.
4. Create a 'LinkedList<Integer>' and add 5 numbers, then remove the first element.
*/

public class ArrayListDemo 
{
    public static void main(String[] args)
    {
        ArrayList<String> browserNames = new ArrayList<String>();
        browserNames.add("Chrome");
        browserNames.add("Firefox");
        browserNames.add("Edge");
        browserNames.add("Edge");
        browserNames.add("Firefox");
        System.out.println("Browser names: " + browserNames);

        HashSet<String> browserNamesHashSet = new HashSet<String>(browserNames);
        System.out.println("Unique Browser Names : ");
        System.out.println("Browser names HashSet: " + browserNamesHashSet);

    }    
}