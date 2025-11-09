/*
 * Create a 'HashSet<String>' for 'apiEndpoints'.
2. Add:
   '"POST /addOrder"', '"GET /orderStatus"', '"POST /addOrder"', '"DELETE /cancelOrder"'.
3. Print all endpoints.
4. Observe if duplicates are allowed and check the order.

 */
package com.aw.automationtraining;
import java.util.HashSet;

public class HashSetDemo
{
    public static void main(String[] args)
    {
        HashSet<String> apiEndpoints = new HashSet<>();
        apiEndpoints.add("POST/addOrder");
        apiEndpoints.add("GET/orderStatus");
        apiEndpoints.add("POST/addOrder");
        apiEndpoints.add("DELETE/cancelOrder");
        System.out.println(" Elements of HasSet ");
        for(String e:apiEndpoints)
        {
            System.out.println(e);
        }

    }
}