package fortech.exercise.aqa.tests;

import fortech.exercise.aqa.models.RegistrationFormModel;
import fortech.exercise.aqa.reader.ExcelReader;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;

import java.io.File;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.time.Duration;

public class BaseTest {
    public WebDriver driver;

    @BeforeTest
    public void setUp() {

        driver = WebBrowser.getDriver(BrowserEnum.CHROME);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
        driver.manage().window().maximize();
    }

    @AfterTest
    public void quitDriver() {
//        driver.quit();
    }

    public File getFileFromResources(String fileName) throws UnsupportedEncodingException {
        ClassLoader classLoader = getClass().getClassLoader();
        File file = new File(URLDecoder.decode(classLoader.getResource(fileName).getFile(), "UTF-8"));
        System.out.println(String.format("Found file %s", file.getName()));
        return file;
    }

    public boolean isElementDisplayed(WebElement element) {
        try {
            return element.isDisplayed();
        } catch (NoSuchElementException e) {
            return false;
        }
    }




}
