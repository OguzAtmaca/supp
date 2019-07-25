package listener;


import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import utils.BaseTest;



public class Listener extends BaseTest implements ITestListener {
    public void onTestStart(ITestResult iTestResult) {
        driver.get(baseUrl);
    }

    public void onTestSuccess(ITestResult iTestResult) {
        System.out.println("Test Başarılı");

    }

    public void onTestFailure(ITestResult iTestResult) {
        System.out.println("Test Fail");

    }

    public void onTestSkipped(ITestResult iTestResult) {

    }

    public void onTestFailedButWithinSuccessPercentage(ITestResult iTestResult) {

    }

    public void onStart(ITestContext iTestContext) {
         driver = new FirefoxDriver();
         driver.manage().window().maximize();


    }

    public void onFinish(ITestContext iTestContext) {
        driver.close();

    }
}
