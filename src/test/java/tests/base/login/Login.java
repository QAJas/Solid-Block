package tests.base.login;

import constants.HomePageLocators;
import helpers.WaitFor;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import tests.base.BaseTest;

public class Login extends BaseTest {
    @Test(description = "login with valid dat a ", groups = {"login"})
    public void logInValidData() {
        driver.get(HomePageLocators.HOME_URL);
        WaitFor.WaitFori(driver, HomePageLocators.LOGIN).isDisplayed();
        driver.findElement(By.cssSelector(HomePageLocators.LOGIN)).click();
        WaitFor.WaitFori(driver, HomePageLocators.LOGIN_BUTTON).isDisplayed();
        driver.findElement(By.cssSelector(HomePageLocators.EMAIL)).sendKeys("tatevqalashyan21+11@gmail.com");
        driver.findElement(By.cssSelector(HomePageLocators.PASSWORD)).sendKeys("111aaaAAA!!!");
        WaitFor.WaitFori(driver, HomePageLocators.LOGIN_BUTTON).isDisplayed();
        driver.findElement(By.cssSelector(HomePageLocators.LOGIN_BUTTON)).click();
        WaitFor.WaitFori(driver, HomePageLocators.AFTER_LOGIN).isDisplayed();


    }

    @Test(description = "invalid email  ", groups = {"login"})
    public void logInInValidEMAIL() {
        driver.get(HomePageLocators.HOME_URL);
        WaitFor.WaitFori(driver, HomePageLocators.LOGIN).isDisplayed();
        driver.findElement(By.cssSelector(HomePageLocators.LOGIN)).click();
        WaitFor.WaitFori(driver, HomePageLocators.LOGIN_BUTTON).isDisplayed();
        driver.findElement(By.cssSelector(HomePageLocators.EMAIL)).sendKeys("tatev@gmail.com");
        driver.findElement(By.cssSelector(HomePageLocators.PASSWORD)).sendKeys("111aaaAAA!!!");
        WaitFor.WaitFori(driver, HomePageLocators.LOGIN_BUTTON).isDisplayed();
        driver.findElement(By.cssSelector(HomePageLocators.LOGIN_BUTTON)).click();
        WaitFor.WaitFori(driver, HomePageLocators.LOG_ERROR).isDisplayed();

    }

    @Test(description = "invalid password  ", groups = {"login"})
    public void logInInValidPASS() {
        driver.get(HomePageLocators.HOME_URL);
        WaitFor.WaitFori(driver, HomePageLocators.LOGIN).isDisplayed();
        driver.findElement(By.cssSelector(HomePageLocators.LOGIN)).click();
        WaitFor.WaitFori(driver, HomePageLocators.LOGIN_BUTTON).isDisplayed();
        driver.findElement(By.cssSelector(HomePageLocators.EMAIL)).sendKeys("tatevqalashyan21+11@gmail.com");
        driver.findElement(By.cssSelector(HomePageLocators.PASSWORD)).sendKeys("111aaaAAA333");
        WaitFor.WaitFori(driver, HomePageLocators.LOGIN_BUTTON).isDisplayed();
        driver.findElement(By.cssSelector(HomePageLocators.LOGIN_BUTTON)).click();
        WaitFor.WaitFori(driver, HomePageLocators.PASS_ERROR).isDisplayed();

    }

    @Test(description = "forgot password with valid data  ", groups = {"links"})
    public void forgotPass() {
        driver.get(HomePageLocators.HOME_URL);
        WaitFor.WaitFori(driver, HomePageLocators.LOGIN).isDisplayed();
        driver.findElement(By.cssSelector(HomePageLocators.LOGIN)).click();
        WaitFor.WaitFori(driver, HomePageLocators.LOGIN_BUTTON).isDisplayed();
        driver.findElement(By.cssSelector(HomePageLocators.FORPAS)).click();
        WaitFor.WaitFori(driver, HomePageLocators.FORBANNER).isDisplayed();
        driver.findElement(By.cssSelector(HomePageLocators.FOREMAIL)).sendKeys("tcohasmik@gmail.com");


        driver.findElement(By.cssSelector(HomePageLocators.SEND_CODE_BUTTON)).click();
        WaitFor.WaitFori(driver, HomePageLocators.NEW_PASS_BUNNER).isDisplayed();

    }
}