package fortech.exercise.aqa.pages;

import fortech.exercise.aqa.tests.BaseTest;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ItemsBookStorePage extends BaseTest {

    private WebDriver driver;

    @FindBy(how = How.XPATH,using = "//span[contains(text(),'Login')]")
    private WebElement loginElement;

    @FindBy(how = How.XPATH,using = "//span[contains(text(),'Book Store')]")
    private WebElement bookStoreElement;

    @FindBy(how = How.XPATH,using = "//span[contains(text(),'Profile')]")
    private WebElement profileElement;

    @FindBy(how = How.XPATH,using = "//span[contains(text(),'Book Store API')]")
    private WebElement bookStoreApiElement;

    public ItemsBookStorePage(WebDriver driver) {

        this.driver = driver;

        PageFactory.initElements(driver, this);
        JavascriptExecutor je=(JavascriptExecutor) driver;

        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(15));

        wait.until(ExpectedConditions.visibilityOf(loginElement));
        je.executeScript("arguments[0].scrollIntoView(true);", loginElement);

        wait.until(ExpectedConditions.visibilityOf(bookStoreElement));
        je.executeScript("arguments[0].scrollIntoView(true);", bookStoreElement);

        wait.until(ExpectedConditions.visibilityOf(profileElement));
        je.executeScript("arguments[0].scrollIntoView(true);", profileElement);

        wait.until(ExpectedConditions.visibilityOf(bookStoreApiElement));
        je.executeScript("arguments[0].scrollIntoView(true);", bookStoreApiElement);
    }

    public WebElement getLoginElement() {
        return loginElement;
    }

    public WebElement getBookStoreElement() {
        return bookStoreElement;
    }

    public WebElement getProfileElement() {
        return profileElement;
    }

    public WebElement getBookStoreApiElement() {
        return bookStoreApiElement;
    }
}
