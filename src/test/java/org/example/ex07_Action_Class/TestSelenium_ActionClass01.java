package org.example.ex07_Action_Class;

import org.example.CommonToAll;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class TestSelenium_ActionClass01 {

    @Test
    public void test_Action_Class()
    {
        WebDriver driver = new EdgeDriver();
        String url = "https://awesomeqa.com/practice.html";

        driver.get(url);

        WebElement firstname = driver.findElement(By.name("firstname"));

        Actions action = new Actions(driver);

        action.keyDown(Keys.SHIFT)
                .sendKeys(firstname,"snehal milind tambe")
                .keyUp(Keys.SHIFT).build().perform();

        driver.quit();


    }
}
