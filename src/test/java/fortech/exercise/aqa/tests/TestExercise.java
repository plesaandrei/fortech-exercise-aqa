package fortech.exercise.aqa.tests;

import fortech.exercise.aqa.models.RegistrationFormModel;
import fortech.exercise.aqa.pages.RegistrationFormPage;
import fortech.exercise.aqa.util.Utils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

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
    public void testWebTableWithPageObject() {

        driver.get("https://demoqa.com");

        WebElement elementsButton = driver.findElement(By.xpath("//div[@class='category-cards']/*[1]/div"));
        elementsButton.click();

        WebElement textBoxButton = driver.findElement(By.id("item-3"));
        textBoxButton.click();

        WebElement editButton = driver.findElement(By.id("edit-record-2"));
        editButton.click();

        RegistrationFormModel registrationModel = new RegistrationFormModel("Ion", "Pop", "test@automation.com", "40", "15000", "Legal");

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
    public void testWebTables() {

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

        RegistrationFormModel randomModel = Utils.getRandomRegistrationModel();

        WebElement newUserFirstName = driver.findElement(By.id("firstName"));
        newUserFirstName.clear();
        newUserFirstName.sendKeys(randomModel.getFirstName());

        WebElement newUserLastName = driver.findElement(By.id("lastName"));
        newUserLastName.clear();
        newUserLastName.sendKeys(randomModel.getLastName());

        WebElement newUserEmail = driver.findElement(By.id("userEmail"));
        newUserEmail.clear();
        newUserEmail.sendKeys(randomModel.getEmail());

        WebElement newUserAge = driver.findElement(By.id("age"));
        newUserAge.clear();
        newUserAge.sendKeys(randomModel.getAge());

        WebElement newUserSalary = driver.findElement(By.id("salary"));
        newUserSalary.clear();
        newUserSalary.sendKeys(randomModel.getSalary());

        WebElement newUserDepartment = driver.findElement(By.id("department"));
        newUserDepartment.clear();
        newUserDepartment.sendKeys(randomModel.getDepartment());

        WebElement newSubmitButton = driver.findElement(By.id("submit"));
        newSubmitButton.click();
    }

    @Test
    public void testFileUpload() {

        driver.get("https://demoqa.com");

        WebElement elementsButton = driver.findElement(By.xpath("//div[@class='category-cards']/*[1]/div"));
        elementsButton.click();

        WebElement uploadDownloadButton = driver.findElement(By.id("item-7"));

        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.PAGE_DOWN);
        actions.moveToElement(uploadDownloadButton).build().perform();

        uploadDownloadButton.click();

        WebElement uploadFileButton = driver.findElement(By.xpath("//label[@for='uploadFile']/following-sibling::input"));
        uploadFileButton.sendKeys("C:\\ProjectsAQA\\exerciseAQA\\src\\test\\resources\\test.zip");
    }

    @Test
    public void testAlertsFrameWindows() {

        driver.get("https://demoqa.com");

        WebElement alertsButton = driver.findElement(By.xpath("//div[@class='category-cards']/*[3]"));
        alertsButton.click();

        WebElement framesButton = driver.findElement(By.xpath("//div[@class='element-list collapse show']/ul/*[3]"));
        framesButton.click();

        driver.switchTo().frame("frame1");

        WebElement frame = driver.findElement(By.id("sampleHeading"));
        String textIFrame = frame.getText();
        System.out.println(textIFrame);
    }

    @Test
    public void testWidget() {

        driver.get("https://demoqa.com");

        WebElement widgetButton = driver.findElement(By.xpath("//div[@class='category-cards']/*[4]"));
        widgetButton.click();

        WebElement datePickerButton = driver.findElement(By.xpath("//div[@class='element-list collapse show']/ul/*[3]"));
        datePickerButton.click();

        WebElement selectDate = driver.findElement(By.id("datePickerMonthYearInput"));

        String oldDate = selectDate.getAttribute("value");
        System.out.println("Date before Addition: " + oldDate);
        //Specifying date format that matches the given date
        SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");

        Calendar c = Calendar.getInstance();

        try {
            //Setting the date to the given date
            c.setTime(sdf.parse(oldDate));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        //Number of Days to add
        c.add(Calendar.DAY_OF_MONTH, 30);
        //Date after adding the days to the given date
        String newDate = sdf.format(c.getTime());
        //Displaying the new Date after addition of Days
        System.out.println("Date after Addition: " + newDate);

        selectDate.sendKeys(Keys.CONTROL, "a", Keys.DELETE);
        selectDate.sendKeys(newDate, Keys.ENTER);

        WebElement selectDateTime = driver.findElement(By.id("dateAndTimePickerInput"));

        String oldDateTime = selectDateTime.getAttribute("value");
        //Specifying date format that matches the given date
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MMMMM dd, yyyy hh:mm a");

        try {
            //Setting the date to the given date
            c.setTime(simpleDateFormat.parse(oldDateTime));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        //Number of Days to add
        c.add(Calendar.DAY_OF_MONTH, 30);
        //Date after adding the days to the given date
        String newDateTime = simpleDateFormat.format(c.getTime());

        selectDateTime.sendKeys(Keys.CONTROL, "a", Keys.DELETE);
        selectDateTime.sendKeys(newDateTime, Keys.ENTER);
    }

}
