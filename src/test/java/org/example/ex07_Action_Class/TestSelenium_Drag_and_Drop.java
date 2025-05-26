package org.example.ex07_Action_Class;

import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import org.example.CommonToAll;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class TestSelenium_Drag_and_Drop extends CommonToAll {

    @Description("Testing drag and drop functionality")
    @Owner("Snehal")
    @Test

    public void test_drag_and_drop(){

        String url = "https://the-internet.herokuapp.com/drag_and_drop";
        driver.get(url);

        WebElement from = driver.findElement(By.xpath("//div[@id=\"column-a\"]"));
        WebElement to = driver.findElement(By.xpath("//div[@id=\"column-b\"]"));

        Actions actions = new Actions(driver);
        actions.dragAndDrop(from, to).build().perform();



    }
}
