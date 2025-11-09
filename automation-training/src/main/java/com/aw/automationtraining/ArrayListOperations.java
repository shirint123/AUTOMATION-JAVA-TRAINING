package com.aw.automationtraining;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListOperations
{
    public static void main(String[] args)
    {
        ArrayList<String> testCases = new ArrayList<> ();
        testCases.add(" LoginTest");
        testCases.add("LogoutTest");
        testCases.add("AddItemTest");
        testCases.add("AddItemTest");
        System.out.println(" All elements of Arraylist  : ");
        for(String e :testCases)
        {
            System.out.println(e);
        }

        for(int i=0; i<testCases.size(); i++)
        {
            if(i==1)
            {
                System.out.println(" Second element of arrylist = "+testCases.get(i));
            }
        }
        System.out.println(" Removing third element from arraylist");
        testCases.remove(2);
        System.out.println(" Array list after remoing thrid element : ");
        Iterator<String> itr = testCases.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }

    }
}