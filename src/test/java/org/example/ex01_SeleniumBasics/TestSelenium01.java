package org.example.ex01_SeleniumBasics;

import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class TestSelenium01 {

    @Test
    public void test_VWO(){

        EdgeDriver edgeDriver = new EdgeDriver();
        edgeDriver.get("https://app.vwo.com/");
        System.out.println(edgeDriver.getTitle());
        edgeDriver.quit();

//        ChromeDriver chromeDriver = new ChromeDriver();
//        chromeDriver.get("https://app.vwo.com/");
//        System.out.println(chromeDriver.getTitle());
    }
}
