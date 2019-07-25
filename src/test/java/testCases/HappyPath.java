package testCases;

import listener.Listener;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import testCaseFunction.LoginPage;
import utils.BaseTest;


@Listeners ({Listener.class})
public class HappyPath extends BaseTest {

    @Test
    public void login () throws InterruptedException {
        LoginPage login = new LoginPage(driver);
        login.login();

    }





}
