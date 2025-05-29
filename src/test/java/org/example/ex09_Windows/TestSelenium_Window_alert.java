package org.example.ex09_Windows;

import org.example.CommonToAll;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;


import java.util.Set;

public class TestSelenium_Window_alert extends CommonToAll {

    @Test
    public void test_windowsAlert(){

        String url = "https://the-internet.herokuapp.com/windows";

        driver.get(url);

        String parent = driver.getWindowHandle();
        System.out.println(parent);

        WebElement clickHere = driver.findElement(By.xpath("//div[@class=\"example\"]/a"));

        clickHere.click();

        Set<String> windowhandles = driver.getWindowHandles();

        System.out.println(windowhandles);

        for(String handle : windowhandles)
        {
            driver.switchTo().window(handle);
            if(driver.getPageSource().contains("New Window"))
            {

                System.out.println("test case pass");
            }
            driver.switchTo().window(parent);
        }

    }

}
