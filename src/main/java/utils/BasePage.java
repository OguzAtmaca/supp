package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



public class BasePage {

    public BasePage (WebDriver driver){
        this.driver = driver;
    }

    public WebDriver driver;

    public WebElement element (By locator){
        return driver.findElement(locator);
    }



}
