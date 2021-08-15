package pages.NewHome;

import constants.HomePageLocators;
import constants.LoginLocators;
import constants.NewHomeLoc;
import helpers.WaitFor;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import tests.base.BaseTest;

public class Header extends BaseTest {
    @Test (description = "explore marketplace with logout user")
    public void ExploreLogOut (){
        driver.get(NewHomeLoc.HOME);
        driver.findElement(By.cssSelector(NewHomeLoc.EXPLORE_MARKETPLACE)).click();
        driver.getCurrentUrl().equals(NewHomeLoc.LOGIN_PAGE);

    }
    @Test (description = "tokenize an asset")
    public void TokAnAsset (){
        driver.get(NewHomeLoc.HOME);
        driver.findElement(By.cssSelector(NewHomeLoc.TOKENIZE_AN_ASSET)).click();
        driver.getCurrentUrl().equals(NewHomeLoc.TOKENIZE_LINK);

    }
    @Test (description = "explore with login user")
    public void ExploreLoginUser (){
        driver.get(NewHomeLoc.HOME);
        driver.findElement(By.cssSelector(HomePageLocators.LOGIN)).click();
        driver.findElement(By.cssSelector(LoginLocators.EMAIL_FIELD)).sendKeys("tcohasmik@gmail.com");
        driver.findElement(By.cssSelector(LoginLocators.PASSWORD_FIELD)).sendKeys("654654654");
        driver.findElement(By.cssSelector(LoginLocators.NEXT)).click();
        driver.getCurrentUrl().equals(NewHomeLoc.MARKETPLACE);
    }

}
