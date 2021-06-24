package tests.base;

import constants.HomePageLocators;
import constants.LoginLocators;
import constants.driver.GetLocators;
import helpers.WaitFor;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Getaccess extends BaseTest{
    @Test(groups = {"get access"})
    public void Get(){
        driver.get(HomePageLocators.HOME_URL);
        WaitFor.WaitFori(driver, HomePageLocators.LOGIN);
        driver.findElement(By.cssSelector(HomePageLocators.LOGIN)).click();
        WaitFor.WaitFori(driver, LoginLocators.EMAIL_FIELD);
        driver.findElement(By.cssSelector(LoginLocators.EMAIL_FIELD)).sendKeys("tcohasmik+1@gmail.com");
        driver.findElement(By.cssSelector(LoginLocators.PASSWORD_FIELD)).sendKeys("654654654");
        driver.findElement(By.cssSelector(LoginLocators.NEXT)).click();
        WaitFor.WaitFori(driver, "div:nth-child(4) > div.image-container > img");
        driver.findElement(By.cssSelector("div:nth-child(4) > div > div > div.details-item:nth-child(2) > span:nth-child(2)"));
        WaitFor.WaitFori(driver, GetLocators.MARKETPLACE1);
        driver.findElement(By.cssSelector(GetLocators.MARKETPLACE1)).click();
        driver.findElement(By.cssSelector(GetLocators.CLICK)).click();
        WaitFor.WaitFori(driver,GetLocators.GETINMODAL);
        driver.findElement(By.cssSelector(GetLocators.GETINMODAL)).click();
        WaitFor.WaitFori(driver, GetLocators.CONFIRM).click();
        driver.findElement(By.cssSelector(GetLocators.CRYPTO)).click();
        WaitFor.WaitFori(driver, GetLocators.CONFIRMCHECKOUT);
        WaitFor.WaitFori(driver, GetLocators.MYINVESTMENTBUTTON);





    }
}
