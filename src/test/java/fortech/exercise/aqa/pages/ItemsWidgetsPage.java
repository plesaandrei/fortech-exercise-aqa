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

public class ItemsWidgetsPage extends BaseTest {

    private WebDriver driver;

    @FindBy(how = How.XPATH,using = "//span[contains(text(),'Accordian')]")
    private WebElement accordianElement;

    @FindBy(how = How.XPATH,using = "//span[contains(text(),'Auto Complete')]")
    private WebElement autoCompleteElement;

    @FindBy(how = How.XPATH,using = "//span[contains(text(),'Date Picker')]")
    private WebElement datePickerElement;

    @FindBy(how = How.XPATH,using = "//span[contains(text(),'Slider')]")
    private WebElement sliderElement;

    @FindBy(how = How.XPATH,using = "//span[contains(text(),'Progress Bar')]")
    private WebElement progressBarElement;

    @FindBy(how = How.XPATH,using = "//span[contains(text(),'Tabs')]")
    private WebElement tabsElement;

    @FindBy(how = How.XPATH,using = "//span[contains(text(),'Tool Tips')]")
    private WebElement toolTipsElement;

    @FindBy(how = How.XPATH,using = "//span[contains(text(),'Menu')]")
    private WebElement menuElement;

    @FindBy(how = How.XPATH,using = "//span[contains(text(),'Select Menu')]")
    private WebElement selectMenuElement;

    public ItemsWidgetsPage(WebDriver driver) {

        this.driver = driver;

        PageFactory.initElements(driver, this);
        JavascriptExecutor je=(JavascriptExecutor) driver;

        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(15));

        wait.until(ExpectedConditions.visibilityOf(accordianElement));
        je.executeScript("arguments[0].scrollIntoView(true);", accordianElement);

        wait.until(ExpectedConditions.visibilityOf(autoCompleteElement));
        je.executeScript("arguments[0].scrollIntoView(true);", autoCompleteElement);

        wait.until(ExpectedConditions.visibilityOf(datePickerElement));
        je.executeScript("arguments[0].scrollIntoView(true);", datePickerElement);

        wait.until(ExpectedConditions.visibilityOf(sliderElement));
        je.executeScript("arguments[0].scrollIntoView(true);", sliderElement);

        wait.until(ExpectedConditions.visibilityOf(progressBarElement));
        je.executeScript("arguments[0].scrollIntoView(true);", progressBarElement);

        wait.until(ExpectedConditions.visibilityOf(tabsElement));
        je.executeScript("arguments[0].scrollIntoView(true);", tabsElement);

        wait.until(ExpectedConditions.visibilityOf(toolTipsElement));
        je.executeScript("arguments[0].scrollIntoView(true);", toolTipsElement);

        wait.until(ExpectedConditions.visibilityOf(menuElement));
        je.executeScript("arguments[0].scrollIntoView(true);", menuElement);

        wait.until(ExpectedConditions.visibilityOf(selectMenuElement));
        je.executeScript("arguments[0].scrollIntoView(true);", selectMenuElement);
    }

    public WebElement getAccordianElement() {
        return accordianElement;
    }

    public WebElement getAutoCompleteElement() {
        return autoCompleteElement;
    }

    public WebElement getDatePickerElement() {
        return datePickerElement;
    }

    public WebElement getSliderElement() {
        return sliderElement;
    }

    public WebElement getProgressBarElement() {
        return progressBarElement;
    }

    public WebElement getTabsElement() {
        return tabsElement;
    }

    public WebElement getToolTipsElement() {
        return toolTipsElement;
    }

    public WebElement getMenuElement() {
        return menuElement;
    }

    public WebElement getSelectMenuElement() {
        return selectMenuElement;
    }
}
