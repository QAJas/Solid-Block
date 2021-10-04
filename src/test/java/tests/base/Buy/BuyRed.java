package tests.base.Buy;

import constants.*;
import helpers.WaitFor;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import tests.base.BaseTest;

public class BuyRed extends BaseTest {
    private Object element;

    @Test
    public void RedNew() {
        driver.get(NewHomeLoc.HOME);
        driver.findElement(By.cssSelector(HomePageLocators.LOGIN)).click();
        WaitFor.WaitFori(driver, LogLocators.EMAIL_FIELD);
        driver.findElement(By.cssSelector(LogLocators.EMAIL_FIELD)).sendKeys("tcohasmik@gmail.com");
        driver.findElement(By.cssSelector(LogLocators.PASSWORD_FIELD)).sendKeys("654654654");
        driver.findElement(By.cssSelector(LogLocators.NEXT)).click();
        driver.getCurrentUrl().equals(NewHomeLoc.HOME);
        Actions actions = new Actions(driver);
//        WaitFor.WaitFori(driver, Frogi.FROG_BLOCK).isSelected();
//        actions.moveToElement(driver.findElement(By.cssSelector(Frogi.FROG_BLOCK)));
//        WebElement element = driver.findElement(By.cssSelector(Frogi.FROG_BLOCK));
//        JavascriptExecutor jsC= (JavascriptExecutor) driver;
//        jsC.executeScript("arguments[0].click();", element);
//        driver.findElement(By.cssSelector(":nth-child(6) .card-title")).click();



}}
