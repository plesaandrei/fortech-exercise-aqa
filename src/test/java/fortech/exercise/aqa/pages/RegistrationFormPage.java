package fortech.exercise.aqa.pages;

import fortech.exercise.aqa.models.RegistrationFormModel;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class RegistrationFormPage {

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

    public void register(String firstName,String lastName,String email,String age,String salary,String department){

        firstNameWebElement.clear();
        firstNameWebElement.sendKeys(firstName);

        lastNameWebElement.clear();
        lastNameWebElement.sendKeys(lastName);

        userEmailWebElement.clear();
        userEmailWebElement.sendKeys(email);

        ageWebElement.clear();
        ageWebElement.sendKeys(age);

        salaryWebElement.clear();
        salaryWebElement.sendKeys(salary);

        departmentWebElement.clear();
        departmentWebElement.sendKeys(department);

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
