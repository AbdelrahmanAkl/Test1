package tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.DashboardPage;
import pages.LoginPage;

public class LoginTest extends TestBase{

    LoginPage login;
    DashboardPage dashboard;

    @BeforeMethod
    public void setData(){
        login = new LoginPage(driver);
        dashboard = new DashboardPage(driver);
    }

    @Test
    public void signInWithValidData() throws InterruptedException {
        login.fillUserName("Admin");
        login.fillPassword("admin123");
        login.clickOnLoginButton();
        Thread.sleep(10000);
        Assert.assertEquals(dashboard.dashboardTextActualResult(),dashboard.getDashboardExpectedResult());
    }

}
