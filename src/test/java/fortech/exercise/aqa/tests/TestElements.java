package fortech.exercise.aqa.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestElements extends BaseTest {

    @Test
    public void testRadioButton() {

        driver.get("https://demoqa.com");
        JavascriptExecutor je = (JavascriptExecutor) driver;

        WebElement elementsButton = driver.findElement(By.xpath("//div[@class='category-cards']/*[1]"));
        je.executeScript("arguments[0].scrollIntoView(true);", elementsButton);
        elementsButton.click();

        WebElement radioButton = driver.findElement(By.xpath("//div[@class='element-list collapse show']/ul/*[3]"));
        je.executeScript("arguments[0].scrollIntoView(true);", radioButton);
        radioButton.click();

        WebElement yesRadioButton = driver.findElement(By.xpath("//input[@id='yesRadio']/following-sibling::label"));
        yesRadioButton.click();

        WebElement messageElement = driver.findElement(By.xpath("//p[@class='mt-3']/span"));
        System.out.println(messageElement.getText());

        Assert.assertEquals(messageElement.getText(), "Yes", "Check if the message is Yes");


    }

}
