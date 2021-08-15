package pages.NewHome;

import constants.NewHomeLoc;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import tests.base.BaseTest;

import java.util.Locale;

public class Footer extends BaseTest {
    @Test(description = "footer links")
    public void AboutFooter (){
        driver.get(NewHomeLoc.HOME);
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(By.cssSelector( NewHomeLoc.ABOUT_FOOTER))).click();
        driver.getCurrentUrl().equals(NewHomeLoc.ABOUT_LINK);
        driver.findElement(By.cssSelector(NewHomeLoc.LOGO)).click();
        driver.getCurrentUrl().equals(NewHomeLoc.HOME);
    }
    @Test (description = "footer links")
    public void Contact (){
        driver.get(NewHomeLoc.HOME);
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(By.cssSelector(NewHomeLoc.CONTACT_FOOTER))).click();
        driver.getCurrentUrl().equals(NewHomeLoc.CONTACT_URL);
    }
    @Test (description = "footer links")
    public void BlogFooter (){
        driver.get(NewHomeLoc.HOME);
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(By.cssSelector(NewHomeLoc.BLOG_FOOTER))).click();
        driver.getCurrentUrl().equals(NewHomeLoc.BLOG_LINK);
    }
    @Test (description = "footer links ")
    public void StudyCase (){
        driver.get(NewHomeLoc.HOME);
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(By.cssSelector(NewHomeLoc.STUDY_FOOTER))).click();
        driver.getCurrentUrl().equals(NewHomeLoc.STUDY_LINK);
    }
    @Test (description = "footer links")
    public void  TermsOfUse (){
        driver.get(NewHomeLoc.HOME);
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(By.cssSelector(NewHomeLoc.TERMS_FOOTER))).click();
        driver.getCurrentUrl().equals(NewHomeLoc.TERMS_LINK);
    }
    @Test (description = "footer links")
    public void Policy(){
        driver.get(NewHomeLoc.HOME);
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(By.cssSelector(NewHomeLoc.POLICY_FOOTER))).click();
        driver.getCurrentUrl().equals(NewHomeLoc.POLICY_URL);
    }
    @Test (description = "footer links")
    public void TermsBottom (){
        driver.get(NewHomeLoc.HOME);
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(By.cssSelector(NewHomeLoc.TERMS_BOTTOM))).click();
        driver.getCurrentUrl().equals(NewHomeLoc.TERMS_LINK);
    }
    @Test (description = "footer links")
    public void PolicyBottom (){
        driver.get(NewHomeLoc.HOME);
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(By.cssSelector(NewHomeLoc.POLICY_BOTTOM))).click();
        driver.getCurrentUrl().equals(NewHomeLoc.POLICY_URL);
    }
    @Test (description = "footer links ")
    public void Linkedin (){
        driver.get(NewHomeLoc.HOME);
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(By.cssSelector(NewHomeLoc.LINKEDIN))).click();
        driver.getCurrentUrl().equals(NewHomeLoc.LINKEDIN_LINK);
    }
    @Test (description = "footer links")
    public void Facebook(){
        driver.get(NewHomeLoc.HOME);
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(By.cssSelector(NewHomeLoc.FACEBOOK))).click();
        driver.getCurrentUrl().equals(NewHomeLoc.FACEBOOK_LINK);
    }
    @Test (description = "footer links")
    public void Twitter (){
        driver.get(NewHomeLoc.HOME);
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(By.cssSelector(NewHomeLoc.TWITTER))).click();
        driver.getCurrentUrl().equals(NewHomeLoc.TWITTER_LINK);
    }
    @Test (description = "footer links ")
    public void Instagram (){
        driver.get(NewHomeLoc.HOME);
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(By.cssSelector(NewHomeLoc.INSTAGRAM))).click();
        driver.getCurrentUrl().equals(NewHomeLoc.INSTAGRAM_LINK);
    }
    @Test (description =  "footer linsk ")
    public void Youtube (){
        driver.get(NewHomeLoc.HOME);
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(By.cssSelector(NewHomeLoc.YOUTUBE))).click();
        driver.getCurrentUrl().equals(NewHomeLoc.YOUTUBE_LINK);
    }
}
