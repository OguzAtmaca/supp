package testCases;

import java.io.File;
import java.io.IOException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import listener.Listener;
import org.testng.annotations.Listeners;
import testCaseFunction.LoginPage;
import utils.BaseTest;


@Listeners({Listener.class})

public class wrongPassword extends BaseTest {

    @Test
    public void wrongPassword () throws  InterruptedException{
        LoginPage wp = new LoginPage(driver);
        wp.wrongPassword();
    }



}