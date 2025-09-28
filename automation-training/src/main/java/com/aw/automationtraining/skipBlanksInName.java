// 5. Skip blanks in names

package com.aw.automationtraining;

public class skipBlanksInName {

    public static void main(String[] args) 
    {
        
        String[] names = {"Amit", "","Ravi","Sneha"};
        for(int i=0; i<names.length;i++)
        {
            if(names[i]!="")
            {
                System.out.println(names[i]);
                continue;
            }
        }
    }
    
}
