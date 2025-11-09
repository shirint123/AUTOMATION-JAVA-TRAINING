/*
 * 1.	Create a 'Stack<String>' named 'pagesVisited'.
2. Push '"LoginPage"', '"HomePage"', '"CartPage"'.
3. Pop one element (simulate “back” button).
4. Peek the current page on top.
5. Print all elements.

 */

package com.aw.automationtraining;

import java.util.*;

public class StackDemo1
{
    public static void main(String[] args)
    {
        Stack<String> pagesVisited = new Stack<>();
        pagesVisited.push("LoginPage");
        pagesVisited.push("HomePage");
        pagesVisited.push("CartPage");
        System.out.println(" Removing  element from Stack ");
        String removedpage = pagesVisited.pop();
        System.out.println(removedpage);
        System.out.println(" Printing all elements of statck ");
        for(String e : pagesVisited)
        {
            System.out.println(e);
        }
    }
}