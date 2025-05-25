package org.example.ex01_SeleniumBasics;

import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSelenium02 {

    @Owner("Snehal")
    @Description("Testing the website url with TestNG Assertion")
    @Test
    public void test_VWO(){

        EdgeDriver edgeDriver = new EdgeDriver();

        edgeDriver.get("https://app.vwo.com/");

        System.out.println(edgeDriver.getTitle());

        Assert.assertEquals(edgeDriver.getCurrentUrl(),"https://app.vwo.com/");

        edgeDriver.quit();

    }

}
