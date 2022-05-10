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

public class ItemsFormsPage extends BaseTest {

    private WebDriver driver;

    @FindBy(how = How.XPATH,using = "//span[contains(text(),'Practice Form')]")
    private WebElement practiceFormElement;

    public ItemsFormsPage(WebDriver driver) {

        this.driver = driver;

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        PageFactory.initElements(driver, this);
        JavascriptExecutor je = (JavascriptExecutor) driver;

        wait.until(ExpectedConditions.visibilityOf(practiceFormElement));
        je.executeScript("arguments[0].scrollIntoView(true);", practiceFormElement);
    }

    public WebElement getPracticeFormElement() {
        return practiceFormElement;
    }
}
