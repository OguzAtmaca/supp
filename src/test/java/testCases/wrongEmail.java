package testCases;

import listener.Listener;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import testCaseFunction.LoginPage;
import utils.BaseTest;

@Listeners({Listener.class})

public class wrongEmail  extends BaseTest {

    @Test
    public void wrongEmail() throws InterruptedException {

        LoginPage loginFailed = new LoginPage(driver);
        loginFailed.wrongEmail();
    }




}
