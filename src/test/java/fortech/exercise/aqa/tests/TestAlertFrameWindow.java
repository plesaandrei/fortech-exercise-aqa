package fortech.exercise.aqa.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.time.Duration;
import java.util.ArrayList;

public class TestAlertFrameWindow extends BaseTest {

    @Test
    public void testNewTabBrowser() {

        driver.get("https://demoqa.com");
        JavascriptExecutor je = (JavascriptExecutor) driver;

        WebElement alertsButton = driver.findElement(By.xpath("//div[@class='category-cards']/*[3]"));
        je.executeScript("arguments[0].scrollIntoView(true);", alertsButton);
        alertsButton.click();

        WebElement browserButton = driver.findElement(By.xpath("//div[@class='element-list collapse show']/ul/*[1]"));
        je.executeScript("arguments[0].scrollIntoView(true);", browserButton);
        browserButton.click();

        WebElement newTabButton = driver.findElement(By.id("tabButton"));
        newTabButton.click();

        String oldTab = driver.getWindowHandle();
        ArrayList<String> newTab = new ArrayList<>(driver.getWindowHandles());
        newTab.remove(oldTab);
        // change focus to new tab
        driver.switchTo().window(newTab.get(0));

        Assert.assertEquals(driver.findElement(By.id("sampleHeading")).getText(), "This is a sample page", "Check message in the new tab ");
    }

    @Test
    public void testNewWindowBrowser(){

        driver.get("https://demoqa.com");
        JavascriptExecutor je = (JavascriptExecutor) driver;

        WebElement alertsButton = driver.findElement(By.xpath("//div[@class='category-cards']/*[3]"));
        je.executeScript("arguments[0].scrollIntoView(true);", alertsButton);
        alertsButton.click();

        WebElement browserButton = driver.findElement(By.xpath("//div[@class='element-list collapse show']/ul/*[1]"));
        je.executeScript("arguments[0].scrollIntoView(true);", browserButton);
        browserButton.click();

        WebElement newWindowButton = driver.findElement(By.id("windowButton"));
        je.executeScript("arguments[0].scrollIntoView(true);", newWindowButton);
        newWindowButton.click();

        String oldWindow = driver.getWindowHandle();
        ArrayList<String> newWindow = new ArrayList<>(driver.getWindowHandles());
        System.out.println(newWindow.size());
        newWindow.remove(oldWindow);
        // change focus to new window
        driver.switchTo().window(newWindow.get(0));
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1[contains(text(),'This is a sample page')]")));

        WebElement newWindowText=driver.findElement(By.id("sampleHeading"));

        Assert.assertEquals(driver.findElement(By.id("sampleHeading")).getText(), "This is a sample page", "Check message in the new window ");
    }

    @Test
    public void testNewWindowMessageBrowser(){

        driver.get("https://demoqa.com");
        JavascriptExecutor je = (JavascriptExecutor) driver;

        WebElement alertsButton = driver.findElement(By.xpath("//div[@class='category-cards']/*[3]"));
        je.executeScript("arguments[0].scrollIntoView(true);", alertsButton);
        alertsButton.click();

        WebElement browserButton = driver.findElement(By.xpath("//div[@class='element-list collapse show']/ul/*[1]"));
        je.executeScript("arguments[0].scrollIntoView(true);", browserButton);
        browserButton.click();

        WebElement newWindowButton = driver.findElement(By.id("messageWindowButton"));
        newWindowButton.click();

        ArrayList<String> windowsList = new ArrayList<>(driver.getWindowHandles());

        Assert.assertEquals(windowsList.size(), 2, "Check if second window appears ");
    }

    @Test
    public void testAlerts(){

        driver.get("https://demoqa.com");
        JavascriptExecutor je = (JavascriptExecutor) driver;

        WebElement alertsButton = driver.findElement(By.xpath("//div[@class='category-cards']/*[3]"));
        je.executeScript("arguments[0].scrollIntoView(true);", alertsButton);
        alertsButton.click();

        WebElement alertsElement = driver.findElement(By.xpath("//div[@class='element-list collapse show']/ul/*[2]"));
        je.executeScript("arguments[0].scrollIntoView(true);", alertsElement);
        alertsElement.click();

        WebElement alertButton = driver.findElement(By.id("alertButton"));
        alertButton.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        driver.switchTo().alert().dismiss();

        WebElement timerAlertButton = driver.findElement(By.id("timerAlertButton"));
        timerAlertButton.click();

        wait.until(ExpectedConditions.alertIsPresent());

        driver.switchTo().alert().dismiss();

        WebElement thirdAlertAccepted = driver.findElement(By.id("confirmButton"));
        thirdAlertAccepted.click();
        driver.switchTo().alert().accept();

        Assert.assertTrue(driver.findElement(By.id("confirmResult")).getText().toLowerCase().contains("ok"), "check if alarm is accepted");

        WebElement thirdAlertDismiss = driver.findElement(By.id("confirmButton"));
        thirdAlertDismiss.click();
        driver.switchTo().alert().dismiss();

        Assert.assertTrue(driver.findElement(By.id("confirmResult")).getText().toLowerCase().contains("cancel"), "check if alarm is dismissed");

        WebElement forthAlertAccepted = driver.findElement(By.id("promtButton"));
        forthAlertAccepted.click();
        driver.switchTo().alert().sendKeys("dsdds");
        driver.switchTo().alert().accept();

        Assert.assertTrue(driver.findElement(By.id("promptResult")).getText().toLowerCase().contains("dsdds"), "check if alarm text is displayed");

        WebElement forthAlertDismiss = driver.findElement(By.id("promtButton"));
        forthAlertDismiss.click();
        driver.switchTo().alert().dismiss();

        boolean isPromptTextDisplayed;
        try {
            driver.findElement(By.id("promptResult"));
            isPromptTextDisplayed = driver.findElement(By.id("promptResult")).isDisplayed();
        } catch (NoSuchElementException e) {
            isPromptTextDisplayed = false;
        }

        Assert.assertFalse(isPromptTextDisplayed, "check that no text is displayed");
    }
}


