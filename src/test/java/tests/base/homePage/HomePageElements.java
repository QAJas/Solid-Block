package tests.base.homePage;

import constants.HomePageLocators;
import helpers.WaitFor;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;
import tests.base.BaseTest;

public class HomePageElements extends BaseTest {
    @Test(description = "shows login",groups = {"el"})
       public void LoginEl(){
        driver.get(HomePageLocators.HOME_URL);
        WaitFor.WaitFori(driver, HomePageLocators.LOGIN).isDisplayed();

    }
    @Test (description = "shows sign up", groups = {"el"})
    public void SignUpEl(){
        driver.get(HomePageLocators.HOME_URL);
        WaitFor.WaitFori(driver, HomePageLocators.SIGNUP).isDisplayed();
    }
    @Test (description = "shows tokenize", groups = {"el"})
    public void TokEl(){
        driver.get(HomePageLocators.HOME_URL);
        WaitFor.WaitFori(driver, HomePageLocators.TOKENIZE).isDisplayed();
    }
    @Test (description = "shows about", groups = {"el"})
    public void AboutEl(){
        driver.get(HomePageLocators.HOME_URL);
        WaitFor.WaitFori(driver, HomePageLocators.ABOUT).isDisplayed();
    }
    @Test (description = "shows tokenization", groups = {"el"})
    public void TokenizationEl(){
        driver.get(HomePageLocators.HOME_URL);
        WaitFor.WaitFori(driver, HomePageLocators.TOKENIZATION).isDisplayed();
    }
    @Test (description = "shows SOLID SPACES", groups = {"el"})
    public void SolidSpacesEl(){
        driver.get(HomePageLocators.HOME_URL);
        WaitFor.WaitFori(driver, HomePageLocators.SOLIDSPACES).isDisplayed();
    }
    @Test (description = "shows learn", groups = {"el"})
    public void LearnEl(){
        driver.get(HomePageLocators.HOME_URL);
        WaitFor.WaitFori(driver, HomePageLocators.LEARN).isDisplayed();
    }
    @Test (description = "shows EXPLORE MARKETPLACE", groups = {"el"})
    public void ExploreMarketplaceEl(){
        driver.get(HomePageLocators.HOME_URL);
        WaitFor.WaitFori(driver, HomePageLocators.EXPMARKETPLACE).isDisplayed();
    }
    @Test (description = "shows tokenize an asset", groups = {"el"})
    public void TokaAnAssetEl(){
        driver.get(HomePageLocators.HOME_URL);
        WaitFor.WaitFori(driver, HomePageLocators.TOKENIZEANASSET).isDisplayed();
    }
    @Test (description = "shows LDB", groups = {"el"})
    public void LDBEl(){
        driver.get(HomePageLocators.HOME_URL);
        WaitFor.WaitFori(driver, HomePageLocators.LDB).isDisplayed();
    }
    @Test (description = "shows DETOX", groups = {"el"})
    public void DETOXEl(){
        driver.get(HomePageLocators.HOME_URL);
        WaitFor.WaitFori(driver, HomePageLocators.DETOX).isDisplayed();
    }
    @Test (description = "shows RED FROG", groups = {"el"})
    public void FROGEl(){
        driver.get(HomePageLocators.HOME_URL);
        WaitFor.WaitFori(driver, HomePageLocators.RED_FROG).isDisplayed();
    }
    @Test (description = "shows ALL PROJECTS", groups = {"el"})
    public void ALLPROJECTSEl(){
        driver.get(HomePageLocators.HOME_URL);
        WaitFor.WaitFori(driver, HomePageLocators.ALL_PROJECTS).isDisplayed();
    }
    @Test (description = "shows OPPORTUNITY", groups = {"el"})
    public void OPPORTUNITYEl(){
        driver.get(HomePageLocators.HOME_URL);
        WaitFor.WaitFori(driver, HomePageLocators.OPPORTUNITY).isDisplayed();
    }
    @Test (description = "shows TOK BANNER", groups = {"el"})
    public void TOKBANNEREl(){
        driver.get(HomePageLocators.HOME_URL);
        WaitFor.WaitFori(driver, HomePageLocators.TOK_BANNER).isDisplayed();
    }
    @Test (description = "shows TRADE BANNER", groups = {"el"})
    public void TRADEEl(){
        driver.get(HomePageLocators.HOME_URL);
        WaitFor.WaitFori(driver, HomePageLocators.TRADE_BANNER).isDisplayed();
    }
    @Test (description = "shows BUZZ TEXT", groups = {"el"})
    public void BUZZEl(){
        driver.get(HomePageLocators.HOME_URL);
        WaitFor.WaitFori(driver, HomePageLocators.BUZZ).isDisplayed();
    }
    @Test (description = "shows APPLY FOR TOK", groups = {"el"})
    public void APPLY_FOR_TOKEl(){
        driver.get(HomePageLocators.HOME_URL);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,2000)", "");
        WaitFor.WaitFori(driver, HomePageLocators.GLOBALLOGO).isDisplayed();
    }
}
