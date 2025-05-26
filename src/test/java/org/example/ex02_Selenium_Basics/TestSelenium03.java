package org.example.ex02_Selenium_Basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class TestSelenium03 {

    @Test
    public void test_VWO(){
        //SearchContext d2 = new InternetExplorerDriver();


        WebDriver d = new ChromeDriver();
        d.get("https://app.vwo.com/#/login");

        d.quit();

        RemoteWebDriver d1 = new FirefoxDriver();
        d1.get("https://app.vwo.com/#/login");
        d1.quit();
    }
}
