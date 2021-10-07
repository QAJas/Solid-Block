package tests.base.Buy;

import constants.BuyLoc;
import constants.HomePageLocators;
import constants.LogLocators;
import constants.NewHomeLoc;
import helpers.WaitFor;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import tests.base.BaseTest;

public class BuyLDB extends BaseTest {
    @Test
    public void BuyWithCrypto() throws InterruptedException {
        driver.get(NewHomeLoc.HOME);
         driver.findElement(By.cssSelector(HomePageLocators.LOGIN)).click();
        WaitFor.WaitFori(driver, LogLocators.EMAIL_FIELD);
        driver.findElement(By.cssSelector(LogLocators.EMAIL_FIELD)).sendKeys("tcohasmik@gmail.com");
        driver.findElement(By.cssSelector(LogLocators.PASSWORD_FIELD)).sendKeys("654654654");
        driver.findElement(By.cssSelector(LogLocators.NEXT)).click();
        Actions actions = new Actions(driver);
        WaitFor.WaitFori(driver, BuyLoc.LDB).isDisplayed();
        actions.moveToElement(driver.findElement(By.cssSelector(BuyLoc.LDB)));
        WebElement elementL = driver.findElement(By.cssSelector(BuyLoc.LDB));
        JavascriptExecutor jsL = (JavascriptExecutor) driver;
        jsL.executeScript("arguments[0].click();", elementL);

        WaitFor.WaitFori(driver, BuyLoc.BUY_BUTTON);
        actions.moveToElement(driver.findElement(By.cssSelector(BuyLoc.BUY_BUTTON)));
        WebElement elementB = driver.findElement(By.cssSelector(BuyLoc.BUY_BUTTON));
        JavascriptExecutor jsB = (JavascriptExecutor) driver;
        jsB.executeScript("arguments[0].click();", elementB);
        Thread.sleep(2000);

        WaitFor.WaitFori(driver, BuyLoc.CHECKOUT_CONFIRM).isSelected();
        actions.moveToElement(driver.findElement(By.cssSelector(BuyLoc.CHECKOUT_CONFIRM)));
        WebElement elementC = driver.findElement(By.cssSelector(BuyLoc.CHECKOUT_CONFIRM));
        JavascriptExecutor jsC = (JavascriptExecutor) driver;
        jsC.executeScript("arguments[0].click();", elementC);


        WaitFor.WaitFori(driver, BuyLoc.CHECKOUT_PAYMENT_CRYPTO).click();
        JavascriptExecutor jsP = (JavascriptExecutor) driver;
        jsP.executeScript("scroll(0, 250);");
        Thread.sleep(2000);

        WaitFor.WaitFori(driver, BuyLoc.CONFIRM_FOR_CRYPTO).isSelected();

    }

    @Test
    public void BuyShares() {
        driver.get(NewHomeLoc.HOME);
        WaitFor.WaitFori(driver, HomePageLocators.LOGIN);
        driver.findElement(By.cssSelector(HomePageLocators.LOGIN)).click();
        WaitFor.WaitFori(driver, LogLocators.EMAIL_FIELD);
        driver.findElement(By.cssSelector(LogLocators.EMAIL_FIELD)).sendKeys("tcohasmik@gmail.com");
        driver.findElement(By.cssSelector(LogLocators.PASSWORD_FIELD)).sendKeys("654654654");
        driver.findElement(By.cssSelector(LogLocators.NEXT)).click();
        Actions actions = new Actions(driver);
        WaitFor.WaitFori(driver, BuyLoc.LDB).isDisplayed();
        actions.moveToElement(driver.findElement(By.cssSelector(BuyLoc.LDB)));
        WebElement elementL = driver.findElement(By.cssSelector(BuyLoc.LDB));
        JavascriptExecutor jsL = (JavascriptExecutor) driver;
        jsL.executeScript("arguments[0].click();", elementL);

        WaitFor.WaitFori(driver, BuyLoc.BUY_BUTTON).isSelected();
        actions.moveToElement(driver.findElement(By.cssSelector(BuyLoc.BUY_BUTTON)));
        WebElement elementB = driver.findElement(By.cssSelector(BuyLoc.BUY_BUTTON));
        JavascriptExecutor jsB = (JavascriptExecutor) driver;
        jsB.executeScript("arguments[0].click();", elementB);

        WaitFor.WaitFori(driver, BuyLoc.CHECKOUT_CONFIRM).isSelected();
        actions.moveToElement(driver.findElement(By.cssSelector(BuyLoc.CHECKOUT_CONFIRM)));
        WebElement elementC = driver.findElement(By.cssSelector(BuyLoc.CHECKOUT_CONFIRM));
        JavascriptExecutor jsC = (JavascriptExecutor) driver;
        jsC.executeScript("arguments[0].click();", elementC);


        WaitFor.WaitFori(driver, BuyLoc.CHECKOUT_PAYMENT_METHOD).click();

        WaitFor.WaitFori(driver, BuyLoc.PAYMENT_CONFIRM).isSelected();


    }
    @Test
    public void BuyWithWire() throws InterruptedException {
        driver.get(NewHomeLoc.HOME);
        WaitFor.WaitFori(driver, HomePageLocators.LOGIN);
        driver.findElement(By.cssSelector(HomePageLocators.LOGIN)).click();
        WaitFor.WaitFori(driver, LogLocators.EMAIL_FIELD);
        driver.findElement(By.cssSelector(LogLocators.EMAIL_FIELD)).sendKeys("tcohasmik@gmail.com");
        driver.findElement(By.cssSelector(LogLocators.PASSWORD_FIELD)).sendKeys("654654654");
        driver.findElement(By.cssSelector(LogLocators.NEXT)).click();
        Actions actions = new Actions(driver);
        WaitFor.WaitFori(driver, BuyLoc.LDB).isDisplayed();
        actions.moveToElement(driver.findElement(By.cssSelector( BuyLoc.LDB)));
        WebElement elementL = driver.findElement(By.cssSelector(BuyLoc.LDB));
        JavascriptExecutor jsL= (JavascriptExecutor) driver;
        jsL.executeScript("arguments[0].click();", elementL);

        WaitFor.WaitFori(driver, BuyLoc.BUY_BUTTON).isSelected();
        actions.moveToElement(driver.findElement(By.cssSelector(BuyLoc.BUY_BUTTON)));
        WebElement elementB = driver.findElement(By.cssSelector(BuyLoc.BUY_BUTTON));
        JavascriptExecutor jsB= (JavascriptExecutor) driver;
        jsB.executeScript("arguments[0].click();", elementB);

        WaitFor.WaitFori(driver, BuyLoc.CHECKOUT_CONFIRM).isSelected();
        actions.moveToElement(driver.findElement(By.cssSelector(BuyLoc.CHECKOUT_CONFIRM)));
        WebElement elementC = driver.findElement(By.cssSelector(BuyLoc.CHECKOUT_CONFIRM));
        JavascriptExecutor jsC= (JavascriptExecutor) driver;
        jsC.executeScript("arguments[0].click();", elementC);


        WaitFor.WaitFori(driver, BuyLoc.CHECKOUT_PAYMENT_WIRE).click();
        JavascriptExecutor jsP= (JavascriptExecutor) driver;
        jsP.executeScript("scroll(0, 500);");
        WaitFor.WaitFori(driver,BuyLoc.CONFIRM_WIRE);

    }

}
