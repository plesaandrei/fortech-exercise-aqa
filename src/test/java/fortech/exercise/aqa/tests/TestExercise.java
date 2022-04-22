package fortech.exercise.aqa.tests;

import fortech.exercise.aqa.models.RegistrationFormModel;
import fortech.exercise.aqa.pages.RegistrationFormPage;
import fortech.exercise.aqa.util.Utils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TestExercise extends BaseTest {

    @Test
    public void testTextBox() {

        driver.get("https://demoqa.com");

        WebElement elementsButton = driver.findElement(By.xpath("//div[@class='category-cards']/*[1]/div"));
        elementsButton.click();

        WebElement textBoxButton = driver.findElement(By.id("item-0"));
        textBoxButton.click();

        WebElement userNameElement = driver.findElement(By.id("userName"));
        userNameElement.sendKeys(Utils.getRandomAlphaNumericString(Utils.getRandomNumber(1, 10)));

        WebElement userEmailElement = driver.findElement(By.id("userEmail"));
        userEmailElement.sendKeys(Utils.getRandomAlphaNumericString(Utils.getRandomNumber(1, 10)) + "@" +
                Utils.getRandomAlphaNumericString(Utils.getRandomNumber(1, 10)) + "." +
                Utils.getRandomAlphaNumericString(3));

        WebElement userCurrentAddressElement = driver.findElement(By.id("currentAddress"));
        userCurrentAddressElement.sendKeys(Utils.getRandomAlphaNumericString(Utils.getRandomNumber(1, 20)));

        WebElement userPermanentAddressElement = driver.findElement(By.id("permanentAddress"));
        userPermanentAddressElement.sendKeys(Utils.getRandomAlphaNumericString(Utils.getRandomNumber(1, 20)));

        WebElement submitButton = driver.findElement(By.id("submit"));
        submitButton.click();

//        WebElement userNameConfirmationElement=driver.findElement(By.id("name"));
//        System.out.println(userNameConfirmationElement.getText());//
//        WebElement EmailConfirmationElement=driver.findElement(By.id("email"));
//        System.out.println(EmailConfirmationElement.getText());
//
//        WebElement currentAddressConfirmationElement=driver.findElement(By.id("currentAddress"));
//        System.out.println(currentAddressConfirmationElement.getText());
//
//        WebElement permanentAddressConfirmationElement=driver.findElement(By.id("permanentAddress"));
//        System.out.println(permanentAddressConfirmationElement.getText());

    }

    @Test
    public void testCheckBox() {

        driver.get("https://demoqa.com");

        WebElement elementsButton = driver.findElement(By.xpath("//div[@class='category-cards']/*[1]/div"));
        elementsButton.click();

        WebElement textBoxButton = driver.findElement(By.id("item-1"));
        textBoxButton.click();

        WebElement homeCheckBox = driver.findElement(By.xpath("//span[@class='rct-text']/*[1]"));
        homeCheckBox.click();

        WebElement desktopCheckBox = driver.findElement(By.xpath("//label[@for='tree-node-desktop']/span[1]"));
        desktopCheckBox.click();

        WebElement textResultElement = driver.findElement(By.id("result"));
        String textGenerated = textResultElement.getText().replace("\n", " ");
        System.out.println(textGenerated);

    }

    @Test
    public void testWebTableWithPageObject(){

        driver.get("https://demoqa.com");

        WebElement elementsButton = driver.findElement(By.xpath("//div[@class='category-cards']/*[1]/div"));
        elementsButton.click();

        WebElement textBoxButton = driver.findElement(By.id("item-3"));
        textBoxButton.click();

        WebElement editButton = driver.findElement(By.id("edit-record-2"));
        editButton.click();

        RegistrationFormModel registrationModel=new RegistrationFormModel("Ion","Pop","test@automation.com","40","15000","Local");

        registrationPage = PageFactory.initElements(driver, RegistrationFormPage.class);

        registrationPage.register(registrationModel);

        WebElement deleteButton = driver.findElement(By.id("delete-record-3"));
        deleteButton.click();

        WebElement addButton = driver.findElement(By.id("addNewRecordButton"));
        addButton.click();

        registrationPage = PageFactory.initElements(driver, RegistrationFormPage.class);

        registrationPage.register(Utils.getRandomRegistrationModel());

    }


    @Test
    public void testWebTables(){

        driver.get("https://demoqa.com");

        WebElement elementsButton = driver.findElement(By.xpath("//div[@class='category-cards']/*[1]/div"));
        elementsButton.click();

        WebElement textBoxButton = driver.findElement(By.id("item-3"));
        textBoxButton.click();

        WebElement editButton = driver.findElement(By.id("edit-record-2"));
        editButton.click();

        WebElement userFirstName = driver.findElement(By.id("firstName"));
        userFirstName.clear();
        userFirstName.sendKeys("Ion");

        WebElement userLastName = driver.findElement(By.id("lastName"));
        userLastName.clear();
        userLastName.sendKeys("Pop");

        WebElement userEmail = driver.findElement(By.id("userEmail"));
        userEmail.clear();
        userEmail.sendKeys("test@automation.com");

        WebElement userAge = driver.findElement(By.id("age"));
        userAge.clear();
        userAge.sendKeys("40");

        WebElement userSalary = driver.findElement(By.id("salary"));
        userSalary.clear();
        userSalary.sendKeys("15000");

        WebElement userDepartment = driver.findElement(By.id("department"));
        userDepartment.clear();
        userDepartment.sendKeys("Legal");

        WebElement submitButton = driver.findElement(By.id("submit"));
        submitButton.click();

        WebElement deleteButton = driver.findElement(By.id("delete-record-3"));
        deleteButton.click();

        WebElement addButton = driver.findElement(By.id("addNewRecordButton"));
        addButton.click();


        WebElement userFirstName2 = driver.findElement(By.id("firstName"));
        userFirstName2.clear();
        userFirstName2.sendKeys("xcsas");

    }


}
