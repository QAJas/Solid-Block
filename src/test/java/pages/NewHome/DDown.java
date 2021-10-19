package pages.NewHome;

import constants.HomePageLocators;
import constants.NewHomeLoc;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import tests.base.BaseTest;

public class DDown extends BaseTest {
    @Test (description = "new design for drop down menu")
    public void Downdesign(){
        driver.get(NewHomeLoc.HOME);
        driver.findElement(By.cssSelector(NewHomeLoc.LEARN)).click();
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(By.cssSelector(NewHomeLoc.TOK_DROPDOWN))).click();
        driver.getCurrentUrl().equals(NewHomeLoc.TOK_LINK);
    }
}
