package org.example.ex07_Action_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class TestSelenium_ActionClass02 {

    @Test
    public void test_Action_Class()
    {
        WebDriver driver = new EdgeDriver();
        String url = "https://www.spicejet.com/";

        driver.get(url);

        WebElement from_city = driver.findElement(By.xpath("//div[@data-testid=\"to-testID-origin\"]/div/div/input"));


        Actions action = new Actions(driver);

        action.moveToElement(from_city).click().sendKeys("BOM").build().perform();

//        action.keyDown(Keys.SHIFT)
//                .sendKeys(firstname,"snehal milind tambe")
//                .keyUp(Keys.SHIFT).build().perform();

       driver.quit();


    }
}
