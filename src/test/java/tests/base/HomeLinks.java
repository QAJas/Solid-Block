package tests.base;

import constants.HomePageLocators;
import constants.LogLocators;
import constants.NewHomeLoc;
import helpers.WaitFor;
import org.checkerframework.checker.units.qual.A;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import tests.base.BaseTest;

public class HomeLinks extends BaseTest {
    @Test(description = "tok 101 ")
    public void HomeLinks() {
        driver.get(HomePageLocators.HOME_URL);
        driver.findElement(By.cssSelector(NewHomeLoc.LEARN)).click();
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(By.cssSelector(NewHomeLoc.TOK_DROPDOWN))).click();
        driver.getCurrentUrl().equals(NewHomeLoc.TOK_LINK);
    }
    @Test (description = "tok course")
    public void TokLinks (){
        driver.get(HomePageLocators.HOME_URL);
        driver.findElement(By.cssSelector(NewHomeLoc.LEARN)).click();
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(By.cssSelector(NewHomeLoc.TOK_COURSE))).click();
        driver.getCurrentUrl().equals(NewHomeLoc.TOC_COURSE_LINK);
    }
    @Test (description = "Blog ")
    public void BlogLink (){
        driver.get(HomePageLocators.HOME_URL);
        driver.findElement(By.cssSelector(NewHomeLoc.LEARN)).click();
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(By.cssSelector(NewHomeLoc.BLOG_DROP))).click();
        driver.getCurrentUrl().equals(NewHomeLoc.BLOG_LINK);
    }
    @Test (description = "podcast")
    public void PodLink (){
        driver.get(HomePageLocators.HOME_URL);
        driver.findElement(By.cssSelector(NewHomeLoc.LEARN)).click();
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(By.cssSelector(NewHomeLoc.PODCAST))).click();
        driver.getCurrentUrl().equals(NewHomeLoc.POdCAST_LINK);
    }
    @Test (description = "about")
    public void AboutLink (){
        driver.get(NewHomeLoc.HOME);
        driver.findElement(By.cssSelector(NewHomeLoc.LEARN)).click();
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(By.cssSelector(NewHomeLoc.ABOUT))).click();
        driver.getCurrentUrl().equals(NewHomeLoc.ABOUT_LINK);
    }
}
