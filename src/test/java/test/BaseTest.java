package test;

import driver.DriverSingleton;
import org.testng.annotations.*;
import org.openqa.selenium.WebDriver;
import util.TestListener;
import util.TestListener_junit;


//@ExtendWith(TestListener.class)
@Listeners(TestListener.class)
public class BaseTest {

    protected WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = DriverSingleton.getDriver();
    }

    @AfterMethod(alwaysRun = true)
    public void stopBrowser() {
        DriverSingleton.closeDriver();
    }




}
