// Print the multiplication table of 3 (from '3x1' to '3x10'). If result goes above 15, stop using 'break'.
package com.aw.automationtraining;


public class multiplicationTableCutOff {

    public static void main(String[] args) {
        
        System.out.println(" Table of 3  : ");
        for(int i=1; i<=10;i++)
        {
            if((i*3)>15)
            {
                break;
            }
            else
            {
                System.out.println(" 3 * "+i+" = "+(i*3));
            }
        }

    }
    
}
