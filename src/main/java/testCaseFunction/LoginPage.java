package testCaseFunction;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;

import java.io.File;
import java.io.IOException;


public class LoginPage extends utils.BasePage {


    public LoginPage(WebDriver driver) {
        super(driver);
    }
    public String actualMessage,expectedMassage;


    public void login() throws InterruptedException {
        element(By.cssSelector("#cookie_container > div > div")).click();
        Thread.sleep(2000);
        element(By.cssSelector("#UserHeaderInfo > div > a.customer-login")).click();
        Thread.sleep(2000);
        element(By.id("Email")).sendKeys("oguzatmaca@supplementler.com");
        Thread.sleep(2000);
        element(By.id("Password")).sendKeys("028510Ao");
        Thread.sleep(2000);
        element(By.cssSelector("#address-form > div:nth-child(6) > input")).click();
        Thread.sleep(2000);
        element(By.cssSelector("#UserHeaderInfo > div.links-wrapper > div > button > span")).click();
        Thread.sleep(2000);
        element(By.cssSelector("#UserHeaderInfo > div.links-wrapper > div > ul > li:nth-child(4) > a")).click();
        Thread.sleep(2000);


    }

    public void wrongEmail() throws InterruptedException, AssertionError {
        element(By.cssSelector("#cookie_container > div > div")).click();
        Thread.sleep(1000);
        element(By.cssSelector("#UserHeaderInfo > div > a.customer-login")).click();
        Thread.sleep(1000);
        element(By.id("Email")).sendKeys("oguzatmaca@suplementler.com");
        Thread.sleep(1000);
        element(By.id("Password")).sendKeys("028510Ao");
        Thread.sleep(1000);
        element(By.cssSelector("#address-form > div:nth-child(6) > input")).click();
        Thread.sleep(2000);
        actualMessage = element(By.cssSelector("#address-form > div.message-error > div > span")).getText();
        expectedMassage = "Giriş başarısız oldu. Lütfen bilgilerinizi kontrol edip tekrar deneyiniz.";




        if(actualMessage.equals(expectedMassage)){
            System.out.println("Gosterilen mesaj dogru");
        }
        else{
            System.out.println("Gosterilen Mesaj Yanlıs");
        }

    }

    public void wrongPassword() throws InterruptedException {

        element(By.cssSelector("#cookie_container > div > div")).click();
        Thread.sleep(1000);
        element(By.cssSelector("#UserHeaderInfo > div > a.customer-login")).click();
        Thread.sleep(1000);
        element(By.id("Email")).sendKeys("oguzatmaca@supplementler.com");
        Thread.sleep(1000);
        element(By.id("Password")).sendKeys("028510A");
        Thread.sleep(1000);
        element(By.cssSelector("#address-form > div:nth-child(6) > input")).click();
        if(actualMessage.equals(expectedMassage)){
            System.out.println("Gosterilen mesaj dogru");
        }
        else{
            System.out.println("Gosterilen Mesaj Yanlıs");
        }



    }

}


