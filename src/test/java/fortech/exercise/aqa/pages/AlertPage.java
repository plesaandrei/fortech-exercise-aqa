package fortech.exercise.aqa.pages;

import org.openqa.selenium.WebDriver;

public  class AlertPage {

    private WebDriver driver ;

    public void AlertPage(WebDriver driver) {
        this.driver = driver;
    }

    public void dismiss() {
        driver.switchTo().alert().dismiss();
    }

    public void accept() {
        driver.switchTo().alert().accept();
    }

    public void sendKeys(String stringKey) {
        driver.switchTo().alert().sendKeys(stringKey);
    }


}
