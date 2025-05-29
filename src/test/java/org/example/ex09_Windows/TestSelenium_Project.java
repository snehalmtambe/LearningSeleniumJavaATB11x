package org.example.ex09_Windows;

import io.qameta.allure.Description;
import org.example.CommonToAll;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.util.*;

public class TestSelenium_Project extends CommonToAll {

    @Description("Testing eBay scennario")
   @Test
    public void test_eBbay()
   {
       String url = "https://www.ebay.com/";
       driver.get(url);
       driver.manage().window().maximize();

       WebElement search_box = driver.findElement(By.xpath("//input[@id=\"gh-ac\"]"));

       Actions actions = new Actions(driver);

       actions.moveToElement(search_box).click().sendKeys("mac mini").build().perform();

       WebElement search_button = driver.findElement(By.xpath("//span[@class=\"gh-search-button__label\"]"));

       actions.moveToElement(search_button).click().build().perform();

       jvm_wait(3000);

       List<WebElement> mac_price = driver.findElements(By.xpath("//span[@class=\"s-item__price\"]"));

       for (WebElement price : mac_price)
       {
           //System.out.println(price.getText());
           if(!price.getText().contains("to"))
           {
               List<String> price_list = new ArrayList<>(Collections.singletonList(price.getText()));

               System.out.println(price_list);

           }



       }



   }


}
