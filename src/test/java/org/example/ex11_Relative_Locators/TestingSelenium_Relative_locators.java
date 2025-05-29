package org.example.ex11_Relative_Locators;

import org.example.CommonToAll;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class TestingSelenium_Relative_locators extends CommonToAll {

    @Test
    public void test_relative_locator(){

        String url = "https://awesomeqa.com/practice.html";
        driver.get(url);

        WebElement years_of_experience = driver.findElement(By.xpath("//span[text()=\"Years of Experience\"]"));

        driver.findElement(with(By.id("exp-1")).toRightOf(years_of_experience)).click();

        jvm_wait(3000);

    }
}
