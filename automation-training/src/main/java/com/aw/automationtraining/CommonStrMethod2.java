package com.aw.automationtraining;

public class CommonStrMethod2 {
    public static void main(String[] args) {
    
    String CSV = "Chrome,Firefox,Edge";
    String[] browsers = CSV.split(",");
    for(String browser : browsers) {
        System.out.println(browser);
    }

    }
}