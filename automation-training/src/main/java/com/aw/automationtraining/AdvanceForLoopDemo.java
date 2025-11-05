package com.aw.automationtraining;

import java.util.ArrayList;
import java.util.Iterator;

public class AdvanceForLoopDemo 
{
    public static void main(String[] args)
    {

       ArrayList<String> browserNames = new ArrayList<String>();
       browserNames.add("Chrome");
       browserNames.add("Firefox");
       browserNames.add("Edge");
       browserNames.add("Safari");
       System.out.println("Output from ArrayList ");
       for(String browserName : browserNames)
       {
        System.out.println(browserName);
       }
       System.out.println("Output from Iterator ");
       Iterator<String> it = browserNames.iterator();
       while(it.hasNext())
       {
           String browserName = it.next();
           if(browserName.equalsIgnoreCase("Firefox"))
           {
                it.remove();
                System.out.println("Removed Browser "+browserName);
           }
           
       }
 }
}