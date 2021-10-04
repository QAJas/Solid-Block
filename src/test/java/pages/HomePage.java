package pages;


import constants.HomePageLocators;
import constants.driver.MyDriveri;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;



public class HomePage {
        public HomePage() {
                MyDriveri.getDriver().get(HomePageLocators.HOME_URL);
        }

        public WebElement log() {
                WebElement log = MyDriveri.getDriver().findElement(
                        By.cssSelector(HomePageLocators.LOGIN));
                return log;
        }
}











//
//        MyDriver.getDriver().get(HomePageLocators.HOME_URL);
//    }
//
//    public static WebElement login() {
//        WebElement login = MyDriver.getDriver().findElement(
//                By.cssSelector(HomePageLocators.LOGIN));
//        return login;
//    }
//
//    public WebElement getStarted() {
//        WebElement getStarted  = MyDriver.getDriver().findElement(
//                By.cssSelector(HomePageLocators.GET_STARTED));
//        return getStarted;
//            }
//    public WebElement aboutHeader() {
//        WebElement aboutHeader = MyDriver.getDriver().findElement(
//                By.cssSelector(HomePageLocators.ABOUT_HEADER));
//        return aboutHeader;
//    }







