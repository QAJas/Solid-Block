package tests.base.Buy;

import constants.BuyLoc;
import constants.HomePageLocators;
import constants.LoginLocators;
import constants.NewHomeLoc;
import helpers.WaitFor;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import tests.base.BaseTest;

public class BuyRed extends BaseTest {
    @Test
    public void AspenF() {
        driver.get(NewHomeLoc.HOME);
        driver.findElement(By.cssSelector(HomePageLocators.LOGIN)).click();
        WaitFor.WaitFori(driver, LoginLocators.EMAIL_FIELD);
        driver.findElement(By.cssSelector(LoginLocators.EMAIL_FIELD)).sendKeys("tcohasmik@gmail.com");
        driver.findElement(By.cssSelector(LoginLocators.PASSWORD_FIELD)).sendKeys("654654654");
        driver.findElement(By.cssSelector(LoginLocators.NEXT)).click();
        Actions actions = new Actions(driver);
        WaitFor.WaitFori(driver, BuyLoc.RED).isDisplayed();
        actions.moveToElement(driver.findElement(By.cssSelector(BuyLoc.RED)));
        WebElement elementL = driver.findElement(By.cssSelector(BuyLoc.RED));
        JavascriptExecutor jsL = (JavascriptExecutor) driver;
        jsL.executeScript("arguments[0].click();", elementL);

        WaitFor.WaitFori(driver, BuyLoc.BUY_BUTTON).isSelected();
        actions.moveToElement(driver.findElement(By.cssSelector(BuyLoc.BUY_BUTTON)));
        WebElement elementB = driver.findElement(By.cssSelector(BuyLoc.BUY_BUTTON));
        JavascriptExecutor jsB= (JavascriptExecutor) driver;
        jsB.executeScript("arguments[0].click();", elementB);
        WaitFor.WaitFori(driver, ".close-desktop").click();

    }
}
