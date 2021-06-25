package tests.base.profile;

import constants.driver.ProfieLocators;
import helpers.Generators;
import helpers.WaitFor;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import tests.base.BaseTest;

public class ChangeDataInProfile extends BaseTest {


    @BeforeMethod
    @Test(groups = {"profile"})
    public void ChangeData(){
        WaitFor.WaitFori(driver, ProfieLocators.USER_ICON_IN_HEADER);
        driver.findElement(By.cssSelector(ProfieLocators.USER_ICON_IN_HEADER)).click();
        driver.findElement(By.cssSelector(ProfieLocators.PROFILE_ON_HOVER)).click();
        WaitFor.WaitFori(driver,ProfieLocators.PROFILE_SAVE).isSelected();
        Actions actions = new Actions(driver);
        driver.findElement(By.cssSelector(ProfieLocators.PROFILE_NAME)).click();
        WaitFor.WaitFori(driver, ProfieLocators.PROFILE_NAME).sendKeys(Generators.Name());
        actions.moveToElement(driver.findElement(By.cssSelector(ProfieLocators.PROFILE_SAVE))).click();
                WaitFor.WaitFori(driver, ProfieLocators.PROFILE_LAST_NAME).sendKeys(Generators.Name());
        actions.moveToElement(driver.findElement(By.cssSelector(ProfieLocators.PROFILE_SAVE))).click();
        WaitFor.WaitFori(driver, ProfieLocators.COUNTRY).click();
        WaitFor.WaitFori(driver, ProfieLocators.US_DROP_DOWN).click();
        actions.moveToElement(driver.findElement(By.cssSelector(ProfieLocators.PROFILE_SAVE))).click();
        WaitFor.WaitFori(driver, ProfieLocators.ADDRESS).click();
        actions.moveToElement(driver.findElement(By.cssSelector(ProfieLocators.PROFILE_SAVE))).click();
        WaitFor.WaitFori(driver, ProfieLocators.STATE).sendKeys(Generators.Name());
        actions.moveToElement(driver.findElement(By.cssSelector(ProfieLocators.PROFILE_SAVE))).click();
        WaitFor.WaitFori(driver, ProfieLocators.CITY).sendKeys(Generators.Name());
        actions.moveToElement(driver.findElement(By.cssSelector(ProfieLocators.PROFILE_SAVE))).click();
        WaitFor.WaitFori(driver, ProfieLocators.ZIP_CODE).sendKeys(Generators.randomeNum());
        actions.moveToElement(driver.findElement(By.cssSelector(ProfieLocators.PROFILE_SAVE))).click();



    }

}
