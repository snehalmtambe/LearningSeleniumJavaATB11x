package org.example.ex11_Relative_Locators;

import org.example.CommonToAll;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class TestingSelenium_Relative_locators_1 extends CommonToAll {

    @Test
    public void test_relative_locator(){

        String url = "https://awesomeqa.com/practice.html";
        driver.get(url);

        WebElement Automation_tool = driver.findElement(By.xpath("//span[text()=\"Automation Tools\"]"));

        driver.findElement(with(By.id("tool-2")).toRightOf(Automation_tool)).click();

        jvm_wait(3000);

    }
}
