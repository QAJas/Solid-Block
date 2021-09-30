package pages;

import constants.Frog;
import constants.NewHomeLoc;
import helpers.WaitFor;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import tests.base.BaseTest;


public class Frogi extends BaseTest {
    @Test (description = "shows element ")
    public void Element (){
        driver.get(Frog.FROG_LINK);
        driver.findElement(By.cssSelector(Frog.YOUTUBE)).isDisplayed();
        driver.findElement(By.cssSelector(Frog.BUY_ONE_SCREEN)).isDisplayed();
    }
}
