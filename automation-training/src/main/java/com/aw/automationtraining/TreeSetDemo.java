
package com.aw.automationtraining;
import java.util.TreeSet;

public class TreeSetDemo
{
    public static void main(String[] args)
    {
        TreeSet<String> countries = new TreeSet<>();
        countries.add("India");
        countries.add("USA");
        countries.add("Germany");
        countries.add("Australia");
        countries.add("India");
        System.out.println(" Elements of TreeSet ");
        System.out.println(countries);
        System.out.println(countries.first());
        System.out.println(countries.last());
        System.out.println(countries.headSet("Germany"));
        System.out.println(countries.tailSet("Germany"));


    }
}