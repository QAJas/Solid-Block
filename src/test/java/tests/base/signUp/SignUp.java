package tests.base.signUp;

import constants.HomePageLocators;
import constants.LogLocators;
import constants.NewHomeLoc;
import constants.driver.MyDriveri;
import helpers.Generators;
import helpers.WaitFor;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Action;
import org.testng.annotations.Test;
import tests.base.BaseTest;

public class SignUp extends BaseTest {
//    @Test(groups = {"sign up"})
//    public void sign() {
//        driver.get(HomePageLocators.HOME_URL);
//        WaitFor.WaitFori(driver, HomePageLocators.GET_STARTED).click();
//        WaitFor.WaitFori(driver, LogLocators.EMAIL_FIELD).sendKeys(Generators.generateMail());
//        driver.findElement(By.cssSelector(LogLocators.PASSWORD_FIELD)).sendKeys(Generators.randomeNum());
//        WaitFor.WaitFori(driver, LogLocators.NEXT).isSelected();
//        driver.findElement(By.cssSelector(LogLocators.NEXT)).click();
//        WaitFor.WaitFori(driver, LogLocators.FIRSTNAME).sendKeys(Generators.getUniqueId());
//        driver.findElement(By.cssSelector(LogLocators.LASTNAME)).sendKeys(Generators.getUniqueId());
//        driver.findElement(By.cssSelector(LogLocators.COUNTRY)).click();
//        WaitFor.WaitFori(driver, LogLocators.USA);
//        driver.findElement(By.cssSelector(LogLocators.USA)).click();
//        WaitFor.WaitFori(driver, LogLocators.PHONE).sendKeys(Generators.phonenumer());
//        WaitFor.WaitFori(driver, LogLocators.CONFIRM);
//        driver.findElement(By.cssSelector(LogLocators.CONFIRM)).click();
//        WaitFor.WaitFori(driver, LogLocators.NEXT_FINISH).click();
//        driver.findElement(By.cssSelector(LogLocators.EXIT)).click();
//
//
//    }

    @Test(groups = {"sign up"})
    public void invalidEmail() {
        driver.get(HomePageLocators.HOME_URL);
       driver.findElement(By.cssSelector( HomePageLocators.SIGNUP)).click();
        driver.findElement(By.cssSelector( LogLocators.EMAIL_FIELD)).sendKeys("kms");
        driver.findElement(By.cssSelector(LogLocators.PASSWORD_FIELD)).sendKeys(Generators.randomeNum());
        driver.findElement(By.cssSelector(LogLocators.NEXT)).isEnabled();

    }

    @Test(groups = {"sign up"})
    public void invalidPass() {
        driver.get(HomePageLocators.HOME_URL);
        WaitFor.WaitFori(driver, HomePageLocators.SIGNUP).click();
        WaitFor.WaitFori(driver, LogLocators.EMAIL_FIELD).sendKeys(Generators.generateMail());
        driver.findElement(By.cssSelector(LogLocators.PASSWORD_FIELD)).sendKeys("1");
        driver.findElement(By.cssSelector(LogLocators.NEXT)).isEnabled();

    }

    @Test(groups = {"sign up"})
    public void emptyName() {
        driver.get(HomePageLocators.HOME_URL);
        WaitFor.WaitFori(driver, HomePageLocators.SIGNUP).click();
        WaitFor.WaitFori(driver, LogLocators.EMAIL_FIELD).sendKeys(Generators.generateMail());
        driver.findElement(By.cssSelector(LogLocators.PASSWORD_FIELD)).sendKeys(Generators.randomeNum());
        driver.findElement(By.cssSelector(LogLocators.NEXT)).isEnabled();



    }

//    @Test(groups = {"sign up"})
//    public void emptyLastName() {
//        driver.get(HomePageLocators.HOME_URL);
//        WaitFor.WaitFori(driver, HomePageLocators.GET_STARTED).click();
//        WaitFor.WaitFori(driver, LoginLocators.EMAIL_FIELD).sendKeys(Generators.generateMail());
//        driver.findElement(By.cssSelector(LoginLocators.PASSWORD_FIELD)).sendKeys(Generators.randomeNum());
//        WaitFor.WaitFori(driver, LoginLocators.NEXT).isSelected();
//        driver.findElement(By.cssSelector(LoginLocators.NEXT)).click();
//        WaitFor.WaitFori(driver, LoginLocators.FIRSTNAME).sendKeys(Generators.getUniqueId());
//        driver.findElement(By.cssSelector(LoginLocators.COUNTRY)).click();
//        WaitFor.WaitFori(driver, LoginLocators.USA);
//        driver.findElement(By.cssSelector(LoginLocators.USA)).click();
//        WaitFor.WaitFori(driver, LoginLocators.PHONE).sendKeys(Generators.phonenumer());
//        WaitFor.WaitFori(driver, LoginLocators.CONFIRM);
//        driver.findElement(By.cssSelector(LoginLocators.CONFIRM)).isEnabled();

//    }
//
//    @Test(groups = {"sign up"})
//    public void withoutCountry() {
//        driver.get(HomePageLocators.HOME_URL);
//        WaitFor.WaitFori(driver, HomePageLocators.GET_STARTED).click();
//        WaitFor.WaitFori(driver, LoginLocators.EMAIL_FIELD).sendKeys(Generators.generateMail());
//        driver.findElement(By.cssSelector(LoginLocators.PASSWORD_FIELD)).sendKeys(Generators.randomeNum());
//        driver.findElement(By.cssSelector(LoginLocators.NEXT)).click();
//        WaitFor.WaitFori(driver, LoginLocators.FIRSTNAME).sendKeys(Generators.getUniqueId());
//        driver.findElement(By.cssSelector(LoginLocators.LASTNAME)).sendKeys(Generators.getUniqueId());
//        WaitFor.WaitFori(driver, LoginLocators.PHONE).sendKeys(Generators.phonenumer());
//        WaitFor.WaitFori(driver, LoginLocators.CONFIRM);
//        driver.findElement(By.cssSelector(LoginLocators.CONFIRM)).isEnabled();
//    }

//    @Test(groups = {"sign up"})
//    public void withoutPhone() {
//        driver.get(HomePageLocators.HOME_URL);
//        WaitFor.WaitFori(driver, HomePageLocators.GET_STARTED).click();
//        WaitFor.WaitFori(driver, LoginLocators.EMAIL_FIELD).sendKeys(Generators.generateMail());
//        driver.findElement(By.cssSelector(LoginLocators.PASSWORD_FIELD)).sendKeys(Generators.randomeNum());
//        driver.findElement(By.cssSelector(LoginLocators.NEXT)).click();
//        WaitFor.WaitFori(driver, LoginLocators.FIRSTNAME).sendKeys(Generators.getUniqueId());
//        driver.findElement(By.cssSelector(LoginLocators.LASTNAME)).sendKeys(Generators.getUniqueId());
//        driver.findElement(By.cssSelector(LoginLocators.COUNTRY)).click();
//        WaitFor.WaitFori(driver, LoginLocators.USA);
//        driver.findElement(By.cssSelector(LoginLocators.USA)).click();
//        WaitFor.WaitFori(driver, LoginLocators.CONFIRM);
//        driver.findElement(By.cssSelector(LoginLocators.CONFIRM)).isEnabled();
//
//    }

//    @Test(groups = {"sign up"})
//    public void nextSelected() {
//        driver.get(HomePageLocators.HOME_URL);
//        WaitFor.WaitFori(driver, HomePageLocators.GET_STARTED).click();
//        WaitFor.WaitFori(driver, LoginLocators.EMAIL_FIELD).sendKeys(Generators.generateMail());
//        driver.findElement(By.cssSelector(LoginLocators.PASSWORD_FIELD)).sendKeys(Generators.randomeNum());
//        WaitFor.WaitFori(driver, LoginLocators.NEXT);
//        driver.findElement(By.cssSelector(LoginLocators.NEXT)).click();
//        WaitFor.WaitFori(driver, LoginLocators.FIRSTNAME).sendKeys(Generators.getUniqueId());
//        driver.findElement(By.cssSelector(LoginLocators.LASTNAME)).sendKeys(Generators.getUniqueId());
//        driver.findElement(By.cssSelector(LoginLocators.COUNTRY)).click();
//        WaitFor.WaitFori(driver, LoginLocators.USA);
//        driver.findElement(By.cssSelector(LoginLocators.USA)).click();
//        WaitFor.WaitFori(driver, LoginLocators.PHONE).sendKeys(Generators.phonenumer());
//        WaitFor.WaitFori(driver, LoginLocators.CONFIRM);
//        driver.findElement(By.cssSelector(LoginLocators.CONFIRM)).click();
//        WaitFor.WaitFori(driver, LoginLocators.NEXT_FINISH).isSelected();
//        driver.findElement(By.cssSelector(LoginLocators.EXIT));
//
//
//        }
    }
