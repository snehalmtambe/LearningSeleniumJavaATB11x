package org.example.ex10_Javascript_Executor;

import org.example.CommonToAll;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

public class TestSelenium_Javascript_Executor extends CommonToAll {

    @Test
    public void test_JS_Executor(){

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.location='https://www.google.com/'");
    }
}
