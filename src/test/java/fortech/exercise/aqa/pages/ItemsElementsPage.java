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

public class ItemsElementsPage {

    private WebDriver driver;

    @FindBy(how = How.XPATH,using = "//span[contains(text(),'Text Box')]")
    private WebElement textBoxElement;

    @FindBy(how = How.XPATH,using = "//span[contains(text(),'Check Box')]")
    private WebElement checkBoxElement;

    @FindBy(how = How.XPATH,using = "//span[contains(text(),'Radio Button')]")
    private WebElement radioButtonElement;

    @FindBy(how = How.XPATH,using = "//span[contains(text(),'Web Tables')]")
    private WebElement webTablesElement;

    @FindBy(how = How.XPATH,using = "//span[contains(text(),'Buttons')]")
    private WebElement buttonsElement;

    @FindBy(how = How.XPATH,using = "//span[contains(text(),'Links')]")
    private WebElement linksElement;

    @FindBy(how = How.XPATH,using = "//span[contains(text(),'Broken')]")
    private WebElement brokenLinksElement;

    @FindBy(how = How.XPATH,using = "//span[contains(text(),'Upload and Download')]")
    private WebElement uploadDownloadElement;

    @FindBy(how = How.XPATH,using = "//span[contains(text(),'Dynamic Properties')]")
    private WebElement dynamicPropertiesElement;

    public ItemsElementsPage(WebDriver driver) {

        this.driver = driver;

        PageFactory.initElements(driver, this);
        JavascriptExecutor je=(JavascriptExecutor) driver;

        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(15));

        wait.until(ExpectedConditions.visibilityOf(textBoxElement));
        je.executeScript("arguments[0].scrollIntoView(true);", textBoxElement);

        wait.until(ExpectedConditions.visibilityOf(checkBoxElement));
        je.executeScript("arguments[0].scrollIntoView(true);", checkBoxElement);

        wait.until(ExpectedConditions.visibilityOf(radioButtonElement));
        je.executeScript("arguments[0].scrollIntoView(true);", radioButtonElement);

        wait.until(ExpectedConditions.visibilityOf(webTablesElement));
        je.executeScript("arguments[0].scrollIntoView(true);", webTablesElement);

        wait.until(ExpectedConditions.visibilityOf(buttonsElement));
        je.executeScript("arguments[0].scrollIntoView(true);", buttonsElement);

        wait.until(ExpectedConditions.visibilityOf(linksElement));
        je.executeScript("arguments[0].scrollIntoView(true);", linksElement);

        wait.until(ExpectedConditions.visibilityOf(brokenLinksElement));
        je.executeScript("arguments[0].scrollIntoView(true);", brokenLinksElement);

        wait.until(ExpectedConditions.visibilityOf(uploadDownloadElement));
        je.executeScript("arguments[0].scrollIntoView(true);", uploadDownloadElement);

        wait.until(ExpectedConditions.visibilityOf(dynamicPropertiesElement));
        je.executeScript("arguments[0].scrollIntoView(true);", dynamicPropertiesElement);
    }

    public WebElement getTextBoxElement() {
        return textBoxElement;
    }

    public WebElement getCheckBoxElement() {
        return checkBoxElement;
    }

    public WebElement getRadioButtonElement() {
        return radioButtonElement;
    }

    public WebElement getWebTablesElement() {
        return webTablesElement;
    }

    public WebElement getButtonsElement() {
        return buttonsElement;
    }

    public WebElement getLinksElement() {
        return linksElement;
    }

    public WebElement getBrokenLinksElement() {
        return brokenLinksElement;
    }

    public WebElement getUploadDownloadElement() {
        return uploadDownloadElement;
    }

    public WebElement getDynamicPropertiesElement() {
        return dynamicPropertiesElement;
    }
}
