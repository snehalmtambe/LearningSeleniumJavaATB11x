package org.example.ex07_Action_Class;

import org.example.CommonToAll;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class TestSelenium_PageUp_PageDown extends CommonToAll {

    @Test
    public void test_PageUP_Pagedown()
    {
        String url = "https://www.makemytrip.com/";
        driver.get(url);

        driver.manage().window().maximize();



        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class=\"commonModal__close\"]")));

        WebElement model = driver.findElement(By.xpath("//span[@class=\"commonModal__close\"]"));
        model.click();

        Actions actions = new Actions(driver);

        actions.sendKeys(Keys.PAGE_DOWN).click().sendKeys(Keys.PAGE_UP).build().perform();


    }
}
