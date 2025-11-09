package com.aw.automationtraining;

public class BrowserConfig
{
    static String browserName = "Chrome";
    static
    {
        System.out.println(" Static block executed: Loading default browser configuration... ");
    }

    public static String getBrowserinfor()
    {
        return " Running tests on Chrome browser ";
    }
}

