package fortech.exercise.aqa.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;


public class WebBrowser {

    public static WebDriver getDriver(BrowserEnum browser) {
        WebDriver driver = null;

        switch (browser) {
            case CHROME:
//                System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
                break;

            case FIREFOX:
//                System.setProperty("webdriver.gecko.driver", "src/test/resources/drivers/geckodriver.exe");
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
                break;

            case IE:
//                System.setProperty("webdriver.ie.driver", "src/test/resources/drivers/IEDriverServer.exe");
                WebDriverManager.iedriver().setup();
                driver = new InternetExplorerDriver();
                break;

            case EDGE:
                WebDriverManager.edgedriver().setup();
                driver = new EdgeDriver();
                break;

            case OPERA:
                WebDriverManager.operadriver().setup();
                driver = new OperaDriver();
                break;

            default:
                throw new IllegalArgumentException("Unknown browser: " + browser);
        }
        return driver;
    }
}
