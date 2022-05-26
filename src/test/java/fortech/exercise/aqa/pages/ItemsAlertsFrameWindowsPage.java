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

public class ItemsAlertsFrameWindowsPage {

    private WebDriver driver;

    @FindBy(how = How.XPATH,using = "//span[contains(text(),'Browser Windows')]")
    private WebElement browserWindowElement;

    @FindBy(how = How.XPATH,using = "//span[contains(text(),'Alerts')]")
    private WebElement alertsElement;

    @FindBy(how = How.XPATH,using = "//span[contains(text(),'Frames')]")
    private WebElement framesElement;

    @FindBy(how = How.XPATH,using = "//span[contains(text(),'Nested Frames')]")
    private WebElement nestedFramesElement;

    @FindBy(how = How.XPATH,using = "//span[contains(text(),'Modal Dialogs')]")
    private WebElement modalDialogsElement;


    public ItemsAlertsFrameWindowsPage(WebDriver driver) {

        this.driver = driver;

        PageFactory.initElements(driver, this);
        JavascriptExecutor je=(JavascriptExecutor) driver;

        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(15));

        wait.until(ExpectedConditions.visibilityOf(browserWindowElement));
        je.executeScript("arguments[0].scrollIntoView(true);", browserWindowElement);

        wait.until(ExpectedConditions.visibilityOf(alertsElement));
        je.executeScript("arguments[0].scrollIntoView(true);", alertsElement);

        wait.until(ExpectedConditions.visibilityOf(framesElement));
        je.executeScript("arguments[0].scrollIntoView(true);", framesElement);

        wait.until(ExpectedConditions.visibilityOf(nestedFramesElement));
        je.executeScript("arguments[0].scrollIntoView(true);", nestedFramesElement);

        wait.until(ExpectedConditions.visibilityOf(modalDialogsElement));
        je.executeScript("arguments[0].scrollIntoView(true);", modalDialogsElement);
    }

    public WebElement getBrowserWindowElement() {
        return browserWindowElement;
    }

    public WebElement getAlertsElement() {
        return alertsElement;
    }

    public WebElement getFramesElement() {
        return framesElement;
    }

    public WebElement getNestedFramesElement() {
        return nestedFramesElement;
    }

    public WebElement getModalDialogsElement() {
        return modalDialogsElement;
    }
}
