package com.aw.automationtraining;

import java.time.LocalTime;

public class DecisionMakingStatment_PrintStringAspercurrentHour {
    
    public static void main(String[] args) {
        
        // get current hour
        int hour = LocalTime.now().getHour();

        if((hour >= 5 && hour < 12))
        {
            System.out.print(" Current Time : "+hour +" AM" );
            System.out.print(" Good Morning !!! ");
        }
        else if (hour >= 12 && hour < 17)
        {
            System.out.print(" Current Time : "+hour+" PM");
            System.out.print(" Good Afternoon !!! ");
        }
        else
        {
            System.out.print(" Current Time : "+hour+" PM");
            System.out.print(" Good Evening !!! ");
        }
    }
}
