package org.example.ex07_Action_Class;

import org.example.CommonToAll;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class TestSelenium_File_Upload extends CommonToAll {

    @Test
    public void test_File_upload(){
        String url = "https://awesomeqa.com/selenium/upload.html";
        driver.get(url);

        WebElement chooseFile = driver.findElement(By.xpath("//input[@id=\"fileToUpload\"]"));

        String base_path = System.getProperty("user.dir");
        String file_path = base_path+"\\src\\test\\java\\org\\example\\ex07_Action_Class\\Data.txt";

//        Actions actions = new Actions(driver);
//
//        actions.click().sendKeys(file_path).build().perform();

        chooseFile.sendKeys(file_path);

        jvm_wait(3000);

        WebElement upload_file = driver.findElement(By.xpath("//input[@name=\"submit\"]"));

        upload_file.click();

    }
}
