package com.vytrack.tests.base;

import com.vytrack.utils.ConfigurationReader;
import com.vytrack.utils.Driver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public abstract class TestBase {
    @BeforeMethod
    public void setupMethod(){
        //Driver.getDriver().get(ConfigurationReader.getProperty("env"));
        System.out.println("Test has started");
    }

    @AfterMethod
    public void teardownMethod(){
        Driver.closeDriver();
    }
}
