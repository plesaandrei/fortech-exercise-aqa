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

public class ModalsButtonsPage extends BaseTest {

    private WebDriver driver;

    @FindBy(how = How.ID,using = "showSmallModal")
    private WebElement smallModalButtonWebElement;

    @FindBy(how = How.ID,using = "showLargeModal")
    private WebElement largeModalButtonWebElement;

    public ModalsButtonsPage(WebDriver driver) {
        this.driver = driver;

        PageFactory.initElements(driver,this);
        JavascriptExecutor je=(JavascriptExecutor) driver;
        WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(15));

        wait.until(ExpectedConditions.visibilityOf(smallModalButtonWebElement));
        je.executeScript("arguments[0].scrollIntoView(true);", smallModalButtonWebElement);

        wait.until(ExpectedConditions.visibilityOf(largeModalButtonWebElement));
        je.executeScript("arguments[0].scrollIntoView(true);", largeModalButtonWebElement);

    }

    public WebElement getSmallModalButtonWebElement() {
        return smallModalButtonWebElement;
    }

    public WebElement getLargeModalButtonWebElement() {
        return largeModalButtonWebElement;
    }
}
