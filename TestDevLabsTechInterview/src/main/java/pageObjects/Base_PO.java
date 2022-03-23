package pageObjects;

import driver.Driver_Factory;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.ArrayList;

public class Base_PO {

    public Base_PO(){
        PageFactory.initElements(getDriver(), this);
    }

    public WebDriver getDriver(){
        return Driver_Factory.getDriver();
    }

    public void nagigateToURL(String url){
        getDriver().get(url);
    }

    public void sendKeys(By by, String textToType){
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds((15)));
        wait.until(ExpectedConditions.elementToBeClickable(by)).sendKeys(textToType);
    }

    public void sendKeys(WebElement element, String textToType){
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds((15)));
        wait.until(ExpectedConditions.elementToBeClickable(element)).sendKeys(textToType);
    }

    public void clickOnElement(By by){
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(15));
        wait.until(ExpectedConditions.elementToBeClickable(by)).click();
    }

    public void clickOnElement(WebElement element){
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(15));
        wait.until(ExpectedConditions.elementToBeClickable(element)).click();
    }

    public void switchToATab(int index){
        WebDriver driver = getDriver();

        ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
        driver.switchTo().window(tabs.get(index));

    }



    public void validateText(By by, String text){
        try {
            WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(15));
            wait.until(ExpectedConditions.textToBe(by, text));
        }catch(Exception e){
            System.out.println(e.toString());
        }

    }

    public void selectDropItem(WebElement element, int index){

        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(15));

        Select drpItem = new Select(wait.until(ExpectedConditions.elementToBeClickable(element)));

        drpItem.selectByIndex(index);

    }

    public String generateRandomNumber(int length){
        return RandomStringUtils.randomNumeric(length);
    }

    public String generateRandomString(int length){
        return RandomStringUtils.randomAlphabetic(length);
    }

}
