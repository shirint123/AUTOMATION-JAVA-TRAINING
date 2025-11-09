/* 
 * 1. Create a 'LinkedList<String>' named 'browsers'.
2. Add '"Chrome"', '"Edge"', '"Firefox"'.
3. Add '"Safari"' at the first position and '"Opera"' at the last position.
4. Remove '"Edge"'.
5. Print all browsers.

 */
package com.aw.automationtraining;
import java.util.LinkedList;

public class LinkListDemo2
{
    public static void main(String[] args)
    {
        LinkedList<String> browsers = new LinkedList<>();
        browsers.add("Chrome");
        browsers.add("Edge");
        browsers.add("Firefox");
        System.out.println(" Adding Safari at first position of Linked List");
        browsers.addFirst("Safari");
        System.out.println(" Adding Opera at the last position of Linked List ");
        browsers.addLast("Opera");
        System.out.println(" Removing Edge from Linked List ");
        browsers.remove("Edge");
        System.out.println(" Browsers from Linked List ");
        for(String e : browsers)
        {
            System.out.println(e);
        }

    }

}
