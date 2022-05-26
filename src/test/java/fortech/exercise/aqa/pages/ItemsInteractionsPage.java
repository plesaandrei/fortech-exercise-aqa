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

public class ItemsInteractionsPage extends BaseTest {

    private WebDriver driver;


    @FindBy(how = How.XPATH,using = "//span[contains(text(),'Sortable')]")
    private WebElement sortableElement;

    @FindBy(how = How.XPATH,using = "//span[contains(text(),'Selectable')]")
    private WebElement selectableElement;

    @FindBy(how = How.XPATH,using = "//span[contains(text(),'Resizable')]")
    private WebElement resizableElement;

    @FindBy(how = How.XPATH,using = "//span[contains(text(),'Droppable')]")
    private WebElement droppableElement;

    @FindBy(how = How.XPATH,using = "//span[contains(text(),'Dragabble')]")
    private WebElement dragabbleElement;

    public ItemsInteractionsPage(WebDriver driver) {

        this.driver = driver;

        PageFactory.initElements(driver, this);
        JavascriptExecutor je=(JavascriptExecutor) driver;

        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(15));

        wait.until(ExpectedConditions.visibilityOf(sortableElement));
        je.executeScript("arguments[0].scrollIntoView(true);", sortableElement);

        wait.until(ExpectedConditions.visibilityOf(selectableElement));
        je.executeScript("arguments[0].scrollIntoView(true);", selectableElement);

        wait.until(ExpectedConditions.visibilityOf(resizableElement));
        je.executeScript("arguments[0].scrollIntoView(true);", resizableElement);

        wait.until(ExpectedConditions.visibilityOf(droppableElement));
        je.executeScript("arguments[0].scrollIntoView(true);", droppableElement);

        wait.until(ExpectedConditions.visibilityOf(dragabbleElement));
        je.executeScript("arguments[0].scrollIntoView(true);", dragabbleElement);
    }

    public WebElement getSortableElement() {
        return sortableElement;
    }

    public WebElement getSelectableElement() {
        return selectableElement;
    }

    public WebElement getResizableElement() {
        return resizableElement;
    }

    public WebElement getDroppableElement() {
        return droppableElement;
    }

    public WebElement getDragabbleElement() {
        return dragabbleElement;
    }
}
