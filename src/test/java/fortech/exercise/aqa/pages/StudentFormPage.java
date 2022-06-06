package fortech.exercise.aqa.pages;

import fortech.exercise.aqa.models.StudentFormModel;
import fortech.exercise.aqa.tests.BaseTest;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class StudentFormPage extends BaseTest {

    private WebDriver driver;

    @FindBy(how = How.ID,using = "firstName")
    private WebElement firstNameWebElement;

    @FindBy(how = How.ID,using = "lastName")
    private WebElement lastNameWebElement;

    @FindBy(how = How.ID,using = "userEmail")
    private WebElement userEmailWebElement;

    @FindBy(how = How.XPATH,using = "//label[contains(text(),'Male')]")
    private WebElement genderMaleWebElement;

    @FindBy(how = How.XPATH,using = "//label[contains(text(),'Female')]")
    private WebElement genderFemaleWebElement;

    @FindBy(how = How.XPATH,using = "//label[contains(text(),'Other')]")
    private WebElement genderOtherWebElement;

    @FindBy(how = How.ID,using = "userNumber")
    private WebElement mobilePhoneWebElement;

    @FindBy(how = How.ID,using = "dateOfBirthInput")
    private WebElement dateOfBirthWebElement;

    @FindBy(how = How.ID,using = "subjectsContainer")
    private WebElement subjectsWebElement;

    @FindBy(how = How.XPATH,using = "//label[contains(text(),'Sports')]")
    private WebElement hobbiesSportsWebElement;

    @FindBy(how = How.XPATH,using = "//label[contains(text(),'Reading')]")
    private WebElement hobbiesReadingWebElement;

    @FindBy(how = How.XPATH,using = "//label[contains(text(),'Music')]")
    private WebElement hobbiesMusicWebElement;

    @FindBy(how = How.ID,using = "uploadPicture")
    private WebElement uploadPictureWebElement;

    @FindBy(how = How.ID,using = "currentAddress")
    private WebElement currentAddressWebElement;

    @FindBy(how = How.XPATH,using = "//div[contains(text(),'Select State')]")
    private WebElement stateWebElement;

    @FindBy(how = How.XPATH,using = "//div[contains(text(),'Select City')]")
    private WebElement cityWebElement;

    @FindBy(how = How.ID,using = "submit")
    private WebElement submitWebElement;

    public StudentFormPage(WebDriver driver)  {
        this.driver=driver;

        PageFactory.initElements(driver,this);
        JavascriptExecutor je=(JavascriptExecutor) driver;
        WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(15));

        wait.until(ExpectedConditions.visibilityOf(firstNameWebElement));
        je.executeScript("arguments[0].scrollIntoView(true);", firstNameWebElement);

        wait.until(ExpectedConditions.visibilityOf(lastNameWebElement));
        je.executeScript("arguments[0].scrollIntoView(true);", lastNameWebElement);

        wait.until(ExpectedConditions.visibilityOf(userEmailWebElement));
        je.executeScript("arguments[0].scrollIntoView(true);", userEmailWebElement);

        wait.until(ExpectedConditions.visibilityOf(genderMaleWebElement));
        je.executeScript("arguments[0].scrollIntoView(true);", genderMaleWebElement);

        wait.until(ExpectedConditions.visibilityOf(genderFemaleWebElement));
        je.executeScript("arguments[0].scrollIntoView(true);", genderFemaleWebElement);

        wait.until(ExpectedConditions.visibilityOf(genderOtherWebElement));
        je.executeScript("arguments[0].scrollIntoView(true);", genderOtherWebElement);

        wait.until(ExpectedConditions.visibilityOf(mobilePhoneWebElement));
        je.executeScript("arguments[0].scrollIntoView(true);", mobilePhoneWebElement);

        wait.until(ExpectedConditions.visibilityOf(dateOfBirthWebElement));
        je.executeScript("arguments[0].scrollIntoView(true);", dateOfBirthWebElement);

        wait.until(ExpectedConditions.visibilityOf(subjectsWebElement));
        je.executeScript("arguments[0].scrollIntoView(true);", subjectsWebElement);

        wait.until(ExpectedConditions.visibilityOf(hobbiesSportsWebElement));
        je.executeScript("arguments[0].scrollIntoView(true);", hobbiesSportsWebElement);

        wait.until(ExpectedConditions.visibilityOf(hobbiesReadingWebElement));
        je.executeScript("arguments[0].scrollIntoView(true);", hobbiesReadingWebElement);

        wait.until(ExpectedConditions.visibilityOf(hobbiesMusicWebElement));
        je.executeScript("arguments[0].scrollIntoView(true);", hobbiesMusicWebElement);

        wait.until(ExpectedConditions.visibilityOf(uploadPictureWebElement));
        je.executeScript("arguments[0].scrollIntoView(true);", uploadPictureWebElement);

        wait.until(ExpectedConditions.visibilityOf(currentAddressWebElement));
        je.executeScript("arguments[0].scrollIntoView(true);", currentAddressWebElement);

        wait.until(ExpectedConditions.visibilityOf(stateWebElement));
        je.executeScript("arguments[0].scrollIntoView(true);", stateWebElement);

        wait.until(ExpectedConditions.visibilityOf(cityWebElement));
        je.executeScript("arguments[0].scrollIntoView(true);", cityWebElement);

        wait.until(ExpectedConditions.visibilityOf(submitWebElement));
        je.executeScript("arguments[0].scrollIntoView(true);", submitWebElement);
    }

    public void register(String firstName,String lastName, String userEmail,
                         String genderMale, String genderFemale, String genderOther,
                         String mobilePhone, String dateOfBirth, String subjects, String hobbiesSports,
                         String hobbiesReading, String hobbiesMusic, String uploadPicture, String currentAddress,
                         String state, String city, String submit){


        StudentFormPage studentFormPage=new StudentFormPage(driver);
        JavascriptExecutor je=(JavascriptExecutor) driver;


        studentFormPage.firstNameWebElement.clear();
        studentFormPage.firstNameWebElement.sendKeys(firstName);

        studentFormPage.lastNameWebElement.clear();
        studentFormPage.lastNameWebElement.sendKeys(lastName);

        studentFormPage.userEmailWebElement.clear();
        studentFormPage.firstNameWebElement.sendKeys(userEmail);


        if(!genderMale.equals("")){
            studentFormPage.genderMaleWebElement.click();
        } else if (!genderFemale.equals("")) {
            studentFormPage.genderFemaleWebElement.click();
        }else if (!genderOther.equals("")){
            studentFormPage.genderFemaleWebElement.click();
        }

        studentFormPage.mobilePhoneWebElement.clear();
        studentFormPage.mobilePhoneWebElement.sendKeys(mobilePhone);

        studentFormPage.dateOfBirthWebElement.clear();
        studentFormPage.dateOfBirthWebElement.sendKeys(Keys.CONTROL, "a");
        studentFormPage.dateOfBirthWebElement.sendKeys(dateOfBirth, Keys.ENTER);

        studentFormPage.subjectsWebElement.clear();
        studentFormPage.subjectsWebElement.sendKeys(subjects);

        if(!hobbiesSports.equals("")){
            studentFormPage.hobbiesSportsWebElement.click();
        }
        if (!hobbiesReading.equals("")) {
            studentFormPage.hobbiesReadingWebElement.click();
        }
        if (!hobbiesMusic.equals("")){
            studentFormPage.hobbiesMusicWebElement.click();
        }

        studentFormPage.uploadPictureWebElement.clear();
        studentFormPage.uploadPictureWebElement.sendKeys(uploadPicture);

        studentFormPage.currentAddressWebElement.clear();
        studentFormPage.currentAddressWebElement.sendKeys(currentAddress);

        studentFormPage.stateWebElement.click();
        studentFormPage.stateWebElement.sendKeys(state);

        studentFormPage.cityWebElement.click();
        studentFormPage.cityWebElement.sendKeys(city);


        studentFormPage.subjectsWebElement.click();
        studentFormPage.subjectsWebElement.sendKeys(subjects);

        studentFormPage.submitWebElement.click();

    }

    public void register(StudentFormModel studentFormModel) {

        register(studentFormModel.getName(),studentFormModel.getLastName(),studentFormModel.getUserEmail(),studentFormModel.getGenderMale(),studentFormModel.getGenderFemale(),
                 studentFormModel.getGenderOther(),studentFormModel.getMobilePhone(),studentFormModel.getDateOfBirth(),studentFormModel.getSubjects(),
                 studentFormModel.getHobbiesSports(),studentFormModel.getHobbiesReading(),studentFormModel.getHobbiesMusic(),studentFormModel.getUploadPicture(),
                 studentFormModel.getCurrentAddress(),studentFormModel.getState(),studentFormModel.getCity(),studentFormModel.getSubmit());
    }


    public WebElement getFirstNameWebElement() {
        return firstNameWebElement;
    }

    public WebElement getLastNameWebElement() {
        return lastNameWebElement;
    }

    public WebElement getUserEmailWebElement() {
        return userEmailWebElement;
    }

    public WebElement getGenderMaleWebElement() {
        return genderMaleWebElement;
    }

    public WebElement getGenderFemaleWebElement() {
        return genderFemaleWebElement;
    }

    public WebElement getGenderOtherWebElement() {
        return genderOtherWebElement;
    }

    public WebElement getMobilePhoneWebElement() {
        return mobilePhoneWebElement;
    }

    public WebElement getDateOfBirthWebElement() {
        return dateOfBirthWebElement;
    }

    public WebElement getSubjectsWebElement() {
        return subjectsWebElement;
    }

    public WebElement getHobbiesSportsWebElement() {
        return hobbiesSportsWebElement;
    }

    public WebElement getHobbiesReadingWebElement() {
        return hobbiesReadingWebElement;
    }

    public WebElement getHobbiesMusicWebElement() {
        return hobbiesMusicWebElement;
    }

    public WebElement getUploadPictureWebElement() {
        return uploadPictureWebElement;
    }

    public WebElement getCurrentAddressWebElement() {
        return currentAddressWebElement;
    }

    public WebElement getStateWebElement() {
        return stateWebElement;
    }

    public WebElement getCityWebElement() {
        return cityWebElement;
    }

    public WebElement getSubmitWebElement() {
        return submitWebElement;
    }
}
