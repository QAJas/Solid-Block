package tests.base;

import constants.driver.MyDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.*;

public class BaseTest {
    public static WebDriver driver;



    @BeforeSuite(alwaysRun = true)
    public static void max(){
        driver.manage().window().maximize();
    }


    @BeforeSuite(alwaysRun = true)
//   @Parameters({"browser"})
    public static void createDriver() {
        driver = MyDriver.createDriver("chrome");


    }

    @AfterSuite(alwaysRun = true)
    public static void driverQuit() {
        driver.quit();
    }
}



