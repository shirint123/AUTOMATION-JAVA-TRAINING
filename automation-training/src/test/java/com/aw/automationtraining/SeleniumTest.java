package com.aw.automationtraining;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SeleniumTest {
    
    private WebDriver driver;
    
    @BeforeMethod
    public void setUp() {
        // Setup WebDriver using WebDriverManager
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }
    
    @Test
    public void testExampleOrgTitle() {
        // Navigate to example.org
        driver.get("https://example.org");
        
        // Get the page title
        String actualTitle = driver.getTitle();
        
        // Assert that the title contains "Example Domain"
        Assert.assertEquals(actualTitle, "Example Domain", 
            "Page title should be 'Example Domain'");
        
        System.out.println("Page title: " + actualTitle);
    }
    
    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
