package org.example.ex02_Selenium_Basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSelenium07_MiniProject {

    @Test
    public void test_Mini_Project(){

        WebDriver driver = new EdgeDriver();

        driver.get("https://katalon-demo-cura.herokuapp.com/");
        driver.manage().window().maximize();

        if(driver.getPageSource().equals("CURA Healthcare Service"))
        {
            System.out.println("Test case passed");
            Assert.assertTrue(true);
        }
        else {
            System.out.println("Text is missing");
        }

        driver.quit();
    }
}
