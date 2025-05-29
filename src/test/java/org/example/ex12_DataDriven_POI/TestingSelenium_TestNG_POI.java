package org.example.ex12_DataDriven_POI;

import org.example.CommonToAll;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestingSelenium_TestNG_POI {

    @Test(dataProvider="getData")
    public void test_POI(String email, String pass){
        System.out.println(email +"-"+ pass);

    }

    @DataProvider
    public Object[][] getData()

    {
        return new Object[][]
                {
                new Object[]{"abc@test.com", "Pass123"},
                new Object[]{"abc1@test.com", "Pass12334"},
                };
    }



    }


