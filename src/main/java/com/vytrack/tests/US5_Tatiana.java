package com.vytrack.tests;

import com.vytrack.tests.base.TestBase;
import com.vytrack.utils.BrowserUtils;
import com.vytrack.utils.Driver;
import com.vytrack.utils.VytrackUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class US5_Tatiana extends TestBase {
    @Test
    public void verify_columns_as_sales_manager(){
        //login as sales manager
        VytrackUtils.loginAsSalesManager();

        //go to Fleet tab
        //Locate web element
        WebElement fleetBtn = Driver.getDriver().findElement(By.xpath("(//span[contains(text(),'Fleet')])[1]"));
        //span[contains(.,'Fleet') and contains (@class, 'title title-level-1')]
        //span[normalize-space()='Fleet' and contains(@class, 'title title-level-1')]
        //=> normalize-space trims the space between web element

        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(fleetBtn).perform();

        //Locate vehicles model
        WebElement vehiclesModelBtn = Driver.getDriver().findElement
                (By.xpath("//span[normalize-space()='Vehicles Model' and contains(@class, 'title title-level-2')]"));




    }

}
