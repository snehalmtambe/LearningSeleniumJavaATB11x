package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CommonToAll {

    public EdgeDriver driver;

    public void jvm_wait(int wait) {
        try{
            Thread.sleep(wait);
        }catch (Exception e)
        {
            System.out.println(e);
        }



    }

    @BeforeTest
    public void setup(){

        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.addArguments("--guest");
        driver = new EdgeDriver();

    }

    @AfterTest
    public void tear_down() {

        try
        {
            Thread.sleep(3000);
        }catch (InterruptedException e){
            throw new RuntimeException(e);
        }
        driver.quit();

    }


}
