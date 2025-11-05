package com.aw.automationtraining;
import java.util.HashMap;
/* 
 * 5. ArrayList, LinkedList, HashSet, HashMap

Assignment:
3. Create a 'HashMap<String, String>' with 'TestCaseName' -> 'Status'. Print all entries.
4. Create a 'LinkedList<Integer>' and add 5 numbers, then remove the first element.

 */

 public class HashMapAssignment 
 {
    public static void main(String[] args)
    {
        HashMap<String, String>TestCaseStatus = new HashMap<String, String>();
        TestCaseStatus.put("CreateTicket", "Pass");
        TestCaseStatus.put("UpdateTicket", "Fail");
        TestCaseStatus.put("DeleteTicket", "Pass");
        TestCaseStatus.put("ViewTicket", "Pass");
        System.out.println("Test Case Status: " + TestCaseStatus);
    }
 }
