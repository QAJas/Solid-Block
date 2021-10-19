package pages.NewHome;

import constants.NewHomeLoc;
import org.checkerframework.checker.units.qual.A;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import tests.base.BaseTest;

public class DropDown extends BaseTest {
    @Test(description = "learn dropdown ")
    public void TokCourse() {
        driver.get(NewHomeLoc.HOME);
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(By.cssSelector(NewHomeLoc.LEARN))).perform();
        actions.moveToElement(driver.findElement(By.cssSelector(NewHomeLoc.TOK_COURSE))).click();
        driver.getCurrentUrl().equals(NewHomeLoc.TOC_COURSE_LINK);
    }
    @Test (description = "learn dropdown ")
    public void Blog(){
        driver.get(NewHomeLoc.HOME);
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(By.cssSelector(NewHomeLoc.LEARN))).perform();

        actions.moveToElement(driver.findElement(By.cssSelector(NewHomeLoc.BLOG_DROP))).click();
        driver.getCurrentUrl().equals(NewHomeLoc.BLOG_LINK);
    }
    @Test (description = "learn dropdown ")
    public void Podcast (){
        driver.get(NewHomeLoc.HOME);
        Actions actions = new Actions(driver);
       actions.moveToElement(driver.findElement(By.cssSelector(NewHomeLoc.LEARN))).perform();
        driver.findElement(By.cssSelector(NewHomeLoc.PODCAST)).click();
        driver.getCurrentUrl().equals(NewHomeLoc.PODCAST_LINK);
    }
    @Test (description = "learn dropdown ")
    public void About (){
        driver.get(NewHomeLoc.HOME);
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(By.cssSelector(NewHomeLoc.LEARN))).perform();
        actions.moveToElement(driver.findElement(By.cssSelector(NewHomeLoc.ABOUT))).click();

        driver.getCurrentUrl().equals(NewHomeLoc.ABOUT_LINK);
    }
}
