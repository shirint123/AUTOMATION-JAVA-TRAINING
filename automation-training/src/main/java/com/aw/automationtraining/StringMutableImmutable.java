package com.aw.automationtraining;

/* Assignment:

1. Create a string 's = "QA";'
2. Append '" Engineer"' using 'concat()'.
3. Print both 's' and the new string.
4. Explain (in a comment) why the original string did not change. */

public class StringMutableImmutable 
{
    public static void main(String[] args) 
    {
        String s = "QA";
        String newString = s.concat(" Engineer");
        System.out.println("Original String: " + s);
        System.out.println("New String: " + newString);

        /* Explanation: The original string did not change because strings in Java are immutable.
        When you use concat() to append text to a string, it creates a new string object and returns it.
        The original string remains unchanged. */   
    }
}