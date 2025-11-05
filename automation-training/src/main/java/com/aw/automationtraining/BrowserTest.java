package com.aw.automationtraining;
/*
 * 9. Abstraction (abstract, interface)

Assignment:

1. Create an abstract class 'Browser' with abstract method 'launch()'.
2. Create subclasses 'ChromeBrowser' and 'Firefo*Browser' that implement 'launch()'.
3. Create an interface 'WebActions' with methods 'click()' and 'sendKeys()'.
4. Implement it in a class 'WebDriverActions'.

 */


abstract class Browser
{
    abstract void launch();
}

class Chromebrowser extends Browser
{
    @Override
    void launch()
    {
        System.out.println(" Launching Chrome browser");
    }
}

class FirefoxBrowser extends Browser
{
    @Override
    void launch()
    {
        System.out.println(" Launching Firefox browser ");
    }
}

interface WebActions
{
    void click();
    void sendKeys(String input);
}

class WebDriverActions implements WebActions
{
    @Override 
    public void click()
    {
        System.out.println("Element clicked ");
    }

    @Override
    public void sendKeys(String input)
    {
        System.out.println(" Input sent :"+input);
    }
}

public class BrowserTest
{
    public static void main(String[] args)
    {
        Browser chrome =new Chromebrowser();
        Browser firefox = new FirefoxBrowser();

        chrome.launch();
        firefox.launch();

        WebActions actions= new WebDriverActions();
        actions.click();
        actions.sendKeys("Implementation of abstract class & Interface");
        
    }
}