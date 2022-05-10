package fortech.exercise.aqa.pages;

import fortech.exercise.aqa.models.RegistrationFormModel;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class RegistrationFormPage {

    private WebDriver driver;

    @FindBy(how = How.ID,using = "firstName")
    private WebElement firstNameWebElement;

    @FindBy(how = How.ID,using = "lastName")
    private WebElement lastNameWebElement;

    @FindBy(how = How.ID,using = "userEmail")
    private WebElement userEmailWebElement;

    @FindBy(how = How.ID,using = "age")
    private WebElement ageWebElement;

    @FindBy(how = How.ID,using = "salary")
    private WebElement salaryWebElement;

    @FindBy(how = How.ID,using = "department")
    private WebElement departmentWebElement;

    @FindBy(how = How.ID,using = "submit")
    private WebElement submitButton;

    public RegistrationFormPage(WebDriver driver) {

        this.driver=driver;

        PageFactory.initElements(driver, this);
        JavascriptExecutor je = (JavascriptExecutor) driver;

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

        wait.until(ExpectedConditions.visibilityOf(firstNameWebElement));
        je.executeScript("arguments[0].scrollIntoView(true);", firstNameWebElement);

        wait.until(ExpectedConditions.visibilityOf(lastNameWebElement));
        je.executeScript("arguments[0].scrollIntoView(true);", lastNameWebElement);

        wait.until(ExpectedConditions.visibilityOf(userEmailWebElement));
        je.executeScript("arguments[0].scrollIntoView(true);", userEmailWebElement);

        wait.until(ExpectedConditions.visibilityOf(ageWebElement));
        je.executeScript("arguments[0].scrollIntoView(true);", ageWebElement);

        wait.until(ExpectedConditions.visibilityOf(salaryWebElement));
        je.executeScript("arguments[0].scrollIntoView(true);", salaryWebElement);

        wait.until(ExpectedConditions.visibilityOf(departmentWebElement));
        je.executeScript("arguments[0].scrollIntoView(true);", departmentWebElement);
    }

    public void register(String firstName, String lastName, String email, String age, String salary, String department){

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        JavascriptExecutor je = (JavascriptExecutor) driver;

        wait.until(ExpectedConditions.visibilityOf(firstNameWebElement));
        je.executeScript("arguments[0].scrollIntoView(true);", firstNameWebElement);
        firstNameWebElement.clear();
        firstNameWebElement.sendKeys(firstName);

        wait.until(ExpectedConditions.visibilityOf(lastNameWebElement));
        je.executeScript("arguments[0].scrollIntoView(true);", lastNameWebElement);
        lastNameWebElement.clear();
        lastNameWebElement.sendKeys(lastName);

        wait.until(ExpectedConditions.visibilityOf(userEmailWebElement));
        userEmailWebElement.clear();
        userEmailWebElement.sendKeys(email);

        wait.until(ExpectedConditions.visibilityOf(ageWebElement));
        ageWebElement.clear();
        ageWebElement.sendKeys(age);

        wait.until(ExpectedConditions.visibilityOf(salaryWebElement));
        salaryWebElement.clear();
        salaryWebElement.sendKeys(salary);

        wait.until(ExpectedConditions.visibilityOf(departmentWebElement));
        departmentWebElement.clear();
        departmentWebElement.sendKeys(department);

        wait.until(ExpectedConditions.visibilityOf(submitButton));
        submitButton.click();

    }

    public void register(RegistrationFormModel registrationModel){

        register(registrationModel.getFirstName(),
                 registrationModel.getLastName(),
                 registrationModel.getEmail(),
                 registrationModel.getAge(),
                 registrationModel.getSalary(),
                 registrationModel.getDepartment()  );

    }

    public WebElement getFirstNameWebElement() {
        return firstNameWebElement;
    }

    public void setFirstNameWebElement(WebElement firstNameWebElement) {
        this.firstNameWebElement = firstNameWebElement;
    }

    public WebElement getLastNameWebElement() {
        return lastNameWebElement;
    }

    public void setLastNameWebElement(WebElement lastNameWebElement) {
        this.lastNameWebElement = lastNameWebElement;
    }

    public WebElement getUserEmailWebElement() {
        return userEmailWebElement;
    }

    public void setUserEmailWebElement(WebElement userEmailWebElement) {
        this.userEmailWebElement = userEmailWebElement;
    }

    public WebElement getAgeWebElement() {
        return ageWebElement;
    }

    public void setAgeWebElement(WebElement ageWebElement) {
        this.ageWebElement = ageWebElement;
    }

    public WebElement getSalaryWebElement() {
        return salaryWebElement;
    }

    public void setSalaryWebElement(WebElement salaryWebElement) {
        this.salaryWebElement = salaryWebElement;
    }

    public WebElement getDepartmentWebElement() {
        return departmentWebElement;
    }

    public void setDepartmentWebElement(WebElement departmentWebElement) {
        this.departmentWebElement = departmentWebElement;
    }

    public WebElement getSubmitButton() {
        return submitButton;
    }

    public void setSubmitButton(WebElement submitButton) {
        this.submitButton = submitButton;
    }
}
