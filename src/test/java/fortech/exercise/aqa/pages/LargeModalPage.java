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

public class LargeModalPage extends BaseTest {

    private WebDriver driver ;

    @FindBy(how = How.ID,using = "example-modal-sizes-title-lg")
    private WebElement headerTitleWebElement;

    @FindBy(how = How.XPATH,using = "//div[contains(@class,'modal-body')]")
    private WebElement modalBodyWebElement;

    @FindBy(how = How.ID,using = "closeLargeModal")
    private WebElement closeButtonWebElement;

    public LargeModalPage(WebDriver driver) {
        this.driver = driver;

        PageFactory.initElements(driver,this);
        JavascriptExecutor je=(JavascriptExecutor) driver;
        WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(15));

        wait.until(ExpectedConditions.visibilityOf(headerTitleWebElement));
        je.executeScript("arguments[0].scrollIntoView(true);", headerTitleWebElement);

        wait.until(ExpectedConditions.visibilityOf(modalBodyWebElement));
        je.executeScript("arguments[0].scrollIntoView(true);", modalBodyWebElement);

        wait.until(ExpectedConditions.visibilityOf(closeButtonWebElement));
        je.executeScript("arguments[0].scrollIntoView(true);", closeButtonWebElement);
    }

    public WebElement getHeaderTitleWebElement() {
        return headerTitleWebElement;
    }

    public WebElement getModalBodyWebElement() {
        return modalBodyWebElement;
    }

    public WebElement getCloseButtonWebElement() {
        return closeButtonWebElement;
    }
}
