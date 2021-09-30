package tests.base.Home;

import constants.HomePageLocators;
import constants.LoginLocators;
import constants.NewHomeLoc;
import helpers.WaitFor;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import tests.base.BaseTest;

public class HomeLinks extends BaseTest {
    @Test (description = "home links ")
    public void HomeLinks (){
    driver.get(HomePageLocators.HOME_URL);
    driver.findElement(By.cssSelector(constants.HomeLinks.LEARN)).click();
    driver.getCurrentUrl().equals(constants.HomeLinks.LEARN_LINKS);
    }
    @Test (description = "home links ")
    public void Email (){
        driver.get(HomePageLocators.HOME_URL);
        driver.findElement(By.cssSelector(constants.HomeLinks.EMAIL_INPUT)).sendKeys("test@gmail.com");
        driver.findElement(By.cssSelector(constants.HomeLinks.MARK_BUTTON)).click();
        driver.getCurrentUrl().equals("https://demo.solidblock.net/sign-up/auth?email=test@gmail.com&invest=true");
    }
    @Test
    public void LoginEmail (){
        driver.get(HomePageLocators.HOME_URL);
        WaitFor.WaitFori(driver, HomePageLocators.LOGIN);
        driver.findElement(By.cssSelector(HomePageLocators.LOGIN)).click();
        WaitFor.WaitFori(driver, LoginLocators.EMAIL_FIELD);
        driver.findElement(By.cssSelector(LoginLocators.EMAIL_FIELD)).sendKeys("tcohasmik+1@gmail.com");
        driver.findElement(By.cssSelector(LoginLocators.PASSWORD_FIELD)).sendKeys("654654654");
        driver.findElement(By.cssSelector(LoginLocators.NEXT)).click();
        driver.get(HomePageLocators.HOME_URL);
        driver.findElement(By.cssSelector("#root > main > div > section.hero > div.main > div > div > div.form.aos-init.aos-animate > span")).click();
        driver.getCurrentUrl().equals("https://demo.solidblock.net/marketplace");
    }
    @Test
    public void Tok(){
        driver.get(HomePageLocators.HOME_URL);
        driver.findElement(By.cssSelector(constants.HomeLinks.TOK_LINK)).click();
        driver.getCurrentUrl().equals(constants.HomeLinks.TOK_LINK_URL);
    }
    @Test
    public void First (){
        driver.get(HomePageLocators.HOME_URL);
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(By.cssSelector(constants.HomeLinks.FIRST_EXPLORE))).click();
        driver.getCurrentUrl().equals(constants.HomeLinks.FIRST_LINK);
    }
    @Test
    public void Second (){
        driver.get(HomePageLocators.HOME_URL);
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(By.cssSelector(constants.HomeLinks.SECOND_EXPLORE))).click();
        driver.getCurrentUrl().equals(constants.HomeLinks.SECOND_EXPLORE);
    }
    @Test
    public void Third (){
        driver.get(HomePageLocators.HOME_URL);
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(By.cssSelector(constants.HomeLinks.THIRD_EXPLORE))).click();
        driver.getCurrentUrl().equals(constants.HomeLinks.THIRD_LINK);
    }
    @Test
    public void SeeAll(){
        driver.get(HomePageLocators.HOME_URL);
        WaitFor.WaitFori(driver, HomePageLocators.LOGIN);
        driver.findElement(By.cssSelector(HomePageLocators.LOGIN)).click();
        WaitFor.WaitFori(driver, LoginLocators.EMAIL_FIELD);
        driver.findElement(By.cssSelector(LoginLocators.EMAIL_FIELD)).sendKeys("tcohasmik+1@gmail.com");
        driver.findElement(By.cssSelector(LoginLocators.PASSWORD_FIELD)).sendKeys("654654654");
        driver.findElement(By.cssSelector(LoginLocators.NEXT)).click();
        driver.get(HomePageLocators.HOME_URL);
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(By.cssSelector(constants.HomeLinks.SEE_ALL))).click();
        driver.getCurrentUrl().equals(constants.HomeLinks.SEE_ALL_LINK_LOGIN);
    }
    @Test
    public void SeeAllOutLogin () {
        driver.get(HomePageLocators.HOME_URL);
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(By.cssSelector(constants.HomeLinks.SEE_ALL))).click();
        driver.getCurrentUrl().equals(constants.HomeLinks.SEE_ALL_LINK_OUTLINK);

    }
}
