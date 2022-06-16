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

public class ItemsElementsWebTablePage {
    private WebDriver driver;

    @FindBy(how = How.ID,using = "addNewRecordButton")
    private WebElement addButtonElement;

    public ItemsElementsWebTablePage(WebDriver driver) {
        this.driver = driver;

        PageFactory.initElements(driver, this);
        JavascriptExecutor je=(JavascriptExecutor) driver;

        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(15));

        wait.until(ExpectedConditions.visibilityOf(addButtonElement));
        je.executeScript("arguments[0].scrollIntoView(true);", addButtonElement);
    }

    public WebElement getAddButtonElement() {
        return addButtonElement;
    }
}
