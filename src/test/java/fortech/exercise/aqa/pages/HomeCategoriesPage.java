package fortech.exercise.aqa.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomeCategoriesPage {

    private WebDriver driver;

    @FindBy(how = How.XPATH,using = "//h5[contains(text(),'Elements')]")
    private WebElement elementsElement;

    @FindBy(how = How.XPATH,using = "//h5[contains(text(),'Forms')]")
    private WebElement formsElement;

    @FindBy(how = How.XPATH,using = "//h5[contains(text(),'Alerts, Frame & Windows')]")
    private WebElement alertsFrameWindowsElement;

    @FindBy(how = How.XPATH,using = "//h5[contains(text(),'Widgets')]")
    private WebElement widgetsElement;

    @FindBy(how = How.XPATH,using = "//h5[contains(text(),'Interactions')]")
    private WebElement interactionsElement;

    @FindBy(how = How.XPATH,using = "//h5[contains(text(),'Book Store Application')]")
    private WebElement bookStoreApplicationElement;

    public HomeCategoriesPage(WebDriver driver) {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        PageFactory.initElements(driver, this);
        JavascriptExecutor je = (JavascriptExecutor) driver;

        wait.until(ExpectedConditions.visibilityOf(elementsElement));
        je.executeScript("arguments[0].scrollIntoView(true);", elementsElement);

        wait.until(ExpectedConditions.visibilityOf(formsElement));
        je.executeScript("arguments[0].scrollIntoView(true);", formsElement);

        wait.until(ExpectedConditions.visibilityOf(alertsFrameWindowsElement));
        je.executeScript("arguments[0].scrollIntoView(true);", alertsFrameWindowsElement);

        wait.until(ExpectedConditions.visibilityOf(widgetsElement));
        je.executeScript("arguments[0].scrollIntoView(true);", widgetsElement);

        wait.until(ExpectedConditions.visibilityOf(interactionsElement));
        je.executeScript("arguments[0].scrollIntoView(true);", interactionsElement);

        wait.until(ExpectedConditions.visibilityOf(bookStoreApplicationElement));
        je.executeScript("arguments[0].scrollIntoView(true);", bookStoreApplicationElement);


    }

    public WebElement getElementsElement() {
        return elementsElement;
    }

    public WebElement getFormsElement() {
        return formsElement;
    }

    public WebElement getAlertsFrameWindowsElement() {
        return alertsFrameWindowsElement;
    }

    public WebElement getWidgetsElement() {
        return widgetsElement;
    }

    public WebElement getInteractionsElement() {
        return interactionsElement;
    }

    public WebElement getBookStoreApplicationElement() {
        return bookStoreApplicationElement;
    }
}
