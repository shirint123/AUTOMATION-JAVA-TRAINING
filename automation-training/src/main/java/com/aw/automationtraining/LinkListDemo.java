package com.aw.automationtraining;
import java.util.LinkedList;
/* 
5. ArrayList, LinkedList, HashSet, HashMap

Assignment:

1. Create an 'ArrayList<String>' of browser names and print them.
2. Create a 'HashSet<String>' to remove duplicate browser names.
3. Create a 'HashMap<String, String>' with 'TestCaseName' -> 'Status'. Print all entries.
4. Create a 'LinkedList<Integer>' and add 5 numbers, then remove the first element.
*/

public class LinkListDemo 
{
    public static void main(String[] args)
    {
        LinkedList<Integer> numbers = new LinkedList<Integer>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        System.out.println("Numbers: " + numbers);
        numbers.removeFirst();
        System.out.println("Numbers after removing first element: " + numbers);
    }
}