package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PageBase {

    WebDriver driver;
    public static long WAIT = 60;

    public PageBase(WebDriver driver){
        this.driver = driver;
    }

    public void waitForElementToClickable(By element){
        WebDriverWait Wait;
        Wait = new WebDriverWait(driver,WAIT);
        Wait.until(ExpectedConditions.elementToBeClickable(element));
    }
    public void waitForElementToBeVisible(By element){
        WebDriverWait wait;
        wait = new WebDriverWait(driver,WAIT);
        wait.until(ExpectedConditions.visibilityOfElementLocated(element));
    }
    public void clickOnElement(By element){
        waitForElementToBeVisible(element);
        waitForElementToClickable(element);
        driver.findElement(element).click();
    }

    public void fillElement(By element,String value){
        waitForElementToBeVisible(element);
        driver.findElement(element).sendKeys(value);
    }
    public String getElementText(By element){
        return driver.findElement(element).getText();
    }
}
