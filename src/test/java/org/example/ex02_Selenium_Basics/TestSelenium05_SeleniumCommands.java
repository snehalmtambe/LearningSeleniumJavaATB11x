package org.example.ex02_Selenium_Basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class TestSelenium05_SeleniumCommands {

    @Test
    public void test_SeleniumCommands()
    {
        WebDriver driver = new EdgeDriver();

        driver.get("https://www.google.com/");

        driver.manage().window().maximize();


        //driver.manage().window().minimize();

        System.out.println(driver.getTitle());

        System.out.println(driver.getCurrentUrl());

        System.out.println(driver.getPageSource());

        driver.quit();

    }

}
