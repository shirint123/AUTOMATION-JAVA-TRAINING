package com.aw.automationtraining;

public class TestExecution
{
    public static void main(String[] args)
    {
        System.out.println(" Browser Name = "+BrowserConfig.browserName);
        BrowserConfig.browserName = "Edge";
        System.out.println(" Browser Name = "+BrowserConfig.browserName);
        System.out.println(BrowserConfig.getBrowserinfor());
    }
}

