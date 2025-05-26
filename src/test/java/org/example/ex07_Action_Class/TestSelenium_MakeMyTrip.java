package org.example.ex07_Action_Class;

import org.example.CommonToAll;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class TestSelenium_MakeMyTrip extends CommonToAll {

    @Test
    public void test_Make_My_Trip()
    {
        String url = "https://www.makemytrip.com/";
        driver.get(url);
        driver.manage().window().maximize();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class=\"commonModal__close\"]")));

        WebElement model = driver.findElement(By.xpath("//span[@class=\"commonModal__close\"]"));
        model.click();

        WebElement from_city = driver.findElement(By.id("fromCity"));

        Actions actions = new Actions(driver);

        actions.moveToElement(from_city).click().sendKeys("IXC").build().perform();

        List<WebElement> from = driver.findElements(By.xpath("//ul[@class=\"react-autosuggest__suggestions-list\"]/li"));

       // WebElement from = driver.findElements(By.xpath("//ul[@class=\"react-autosuggest__suggestions-list\"]/li"));

        for(WebElement e: from){
            if(e.getText().contains("Chandigarh")){
                e.click();
            }
        }





    }

}
