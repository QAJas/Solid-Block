package constants;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import tests.base.BaseTest;

import static constants.driver.MyDriver.getDriver;
import static org.testng.Assert.*;

public class HomePageLocatorsTest {


    public static class Footer extends BaseTest {
        @Test(description = "click check")
        public static void FooterClick(){
            driver.get(HomePageLocators.HOME_URL);


            WebElement about = driver.findElement(By.cssSelector(HomePageLocators.ABOUT_HEADER));
            String url = driver.getCurrentUrl();
            Assert.assertEquals(HomePageLocators.HOME_URL, getDriver().getCurrentUrl());

}}}