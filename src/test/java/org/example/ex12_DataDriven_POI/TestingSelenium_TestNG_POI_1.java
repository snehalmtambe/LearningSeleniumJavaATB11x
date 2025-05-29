package org.example.ex12_DataDriven_POI;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestingSelenium_TestNG_POI_1 {

    @Test(dataProvider = "getData")
    public void test_tesNG_POI(String email, String Pass)
    {
        System.out.println(email +"-" +Pass);

    }
    @DataProvider
    public Object[][] getData(){
        return new Object[][]{
                new Object[]{"abc@test.com","pass@123"},
                new Object[]{"abcd@test1.com","Pass@1234"}
        };
    }

}
