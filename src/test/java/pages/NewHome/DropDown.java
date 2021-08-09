package pages.NewHome;

import constants.NewHomeLoc;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import tests.base.BaseTest;

public class DropDown extends BaseTest {
    @Test(description = "learn dropdown ")
    public void NewHome() {
        driver.get(NewHomeLoc.HOME);
        driver.findElement(By.cssSelector(NewHomeLoc.LEARN)).click();
        driver.findElement(By.cssSelector(NewHomeLoc.TOK_DROPDOWN)).click();
        driver.getCurrentUrl().equals(NewHomeLoc.TOK_LINK);
    }

    @Test(description = "learn dropdown ")
    public void TokCourse() {
        driver.get(NewHomeLoc.HOME);
        driver.findElement(By.cssSelector(NewHomeLoc.LEARN)).click();
        driver.findElement(By.cssSelector(NewHomeLoc.TOK_COURSE)).click();
        driver.getCurrentUrl().equals(NewHomeLoc.TOC_COURSE_LINK);
    }
    @Test (description = "learn dropdown ")
    public void Blog(){
        driver.get(NewHomeLoc.HOME);
        driver.findElement(By.cssSelector(NewHomeLoc.LEARN)).click();
        driver.findElement(By.cssSelector(NewHomeLoc.BLOG_DROP)).click();
        driver.getCurrentUrl().equals(NewHomeLoc.BLOG_LINK);
    }
    @Test (description = "learn dropdown ")
    public void Podcast (){
        driver.get(NewHomeLoc.HOME);
        driver.findElement(By.cssSelector(NewHomeLoc.LEARN)).click();
        driver.findElement(By.cssSelector(NewHomeLoc.PODCAST)).click();
        driver.getCurrentUrl().equals(NewHomeLoc.POdCAST_LINK);
    }
    @Test (description = "learn dropdown ")
    public void About (){
        driver.get(NewHomeLoc.HOME);
        driver.findElement(By.cssSelector(NewHomeLoc.LEARN)).click();
        driver.findElement(By.cssSelector(NewHomeLoc.ABOUT)).click();
        driver.getCurrentUrl().equals(NewHomeLoc.ABOUT_LINK);
        driver.findElement(By.cssSelector(NewHomeLoc.LOGO)).click();
        driver.getCurrentUrl().equals(NewHomeLoc.HOME);
    }
}
