package fortech.exercise.aqa.tests;

import fortech.exercise.aqa.models.StudentFormModel;
import fortech.exercise.aqa.pages.HomeCategoriesPage;
import fortech.exercise.aqa.pages.ItemsFormsPage;
import fortech.exercise.aqa.pages.StudentFormPage;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestElements extends BaseTest {

    @Test
    public void testStudentForm(){

        driver.get("https://demoqa.com");

        HomeCategoriesPage homeCategoriesPage=new HomeCategoriesPage(driver);
        homeCategoriesPage.getFormsElement().click();

        ItemsFormsPage itemsFormsPage=new ItemsFormsPage(driver);
        itemsFormsPage.getPracticeFormElement().click();

        StudentFormModel studentFormModel=new StudentFormModel("ion","pop", "mail@mail.com", "X", "", "", "07431111111"
        ,"09 May 2022","blabla","X","X", "","", "astreeeeeeet", "IL","Bucharest","");

        StudentFormPage studentFormPage=new StudentFormPage(driver);
        studentFormPage.register(studentFormModel);
    }

    @Test
    public void testButtons(){

        driver.get("https://demoqa.com");
        JavascriptExecutor je = (JavascriptExecutor) driver;

        WebElement elementsButton = driver.findElement(By.xpath("//div[@class='category-cards']/*[1]"));
        je.executeScript("arguments[0].scrollIntoView(true);", elementsButton);
        elementsButton.click();

        WebElement radioButton = driver.findElement(By.xpath("//div[@class='element-list collapse show']/ul/*[5]"));
        je.executeScript("arguments[0].scrollIntoView(true);", radioButton);
        radioButton.click();

        WebElement doubleClickButton = driver.findElement(By.id("doubleClickBtn"));
        Actions actions = new Actions(driver);
        actions.doubleClick(doubleClickButton).build().perform();

        WebElement doubleClickMessage = driver.findElement(By.id("doubleClickMessage"));

        WebElement rightClickButton = driver.findElement(By.id("rightClickBtn"));
        actions.contextClick(rightClickButton).build().perform();

        WebElement rightClickMessage = driver.findElement(By.id("rightClickMessage"));

        WebElement dynamicClickButton = driver.findElement(By.xpath("//button[text()='Click Me']"));
        dynamicClickButton.click();

        WebElement dynamicClickMessage = driver.findElement(By.id("dynamicClickMessage"));

        Assert.assertEquals(doubleClickMessage.getText(), "You have done a double click", "Check doubleClick message");
        Assert.assertEquals(rightClickMessage.getText(), "You have done a right click", "Check rightClick message");
        Assert.assertEquals(dynamicClickMessage.getText(), "You have done a dynamic click", "Check dynamicClick message");
    }

    @Test
    public  void testForm(){
//        need for model and Pobj

        driver.get("https://demoqa.com");
        JavascriptExecutor je = (JavascriptExecutor) driver;

        WebElement formsButton = driver.findElement(By.xpath("//div[@class='category-cards']/*[2]"));
        je.executeScript("arguments[0].scrollIntoView(true);", formsButton);
        formsButton.click();

        WebElement pacticeFormButton = driver.findElement(By.xpath("//div[@class='element-list collapse show']/ul/li"));
        je.executeScript("arguments[0].scrollIntoView(true);", pacticeFormButton);
        pacticeFormButton.click();

        WebElement selectButton = driver.findElement(By.id("react-select-3-input"));
        selectButton.sendKeys("some text");

        WebElement submitButton = driver.findElement(By.id("submit"));
        je.executeScript("arguments[0].scrollIntoView(true);", submitButton);
        je.executeScript("arguments[0].click()", submitButton);
    }
}
