package fortech.exercise.aqa.tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import java.util.concurrent.TimeUnit;

public class BaseTest {
    public WebDriver driver;

    @BeforeTest
    public void setUp() {

        driver = WebBrowser.getDriver(BrowserEnum.CHROME);
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

    @AfterTest
    public void quitDriver() {
//        driver.quit();
    }


}
