package pages;

import constants.Frogi;
import constants.NewHomeLoc;
import helpers.WaitFor;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import tests.base.BaseTest;


public class Frogin extends BaseTest {
    @Test (description = "shows element ")
    public void Element (){
        driver.get(constants.Frogi.FROG_LINK);
        driver.findElement(By.cssSelector(constants.Frogi.YOUTUBE)).isDisplayed();
        driver.findElement(By.cssSelector(constants.Frogi.BUY_ONE_SCREEN)).isDisplayed();
    }
}
