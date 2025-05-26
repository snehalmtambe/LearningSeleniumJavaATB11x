package org.example.ex02_Selenium_Basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestSelenium04_WebDriver {

    @Test
    public void test_Selenium(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://app.vwo.com/#/login");

        driver.quit();
    }
}
