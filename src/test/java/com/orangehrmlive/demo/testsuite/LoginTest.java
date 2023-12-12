package com.orangehrmlive.demo.testsuite;

import com.orangehrmlive.demo.customlisteners.CustomListeners;
import com.orangehrmlive.demo.pages.DashboardPage;
import com.orangehrmlive.demo.pages.HomePage;
import com.orangehrmlive.demo.pages.LoginPage;
import com.orangehrmlive.demo.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import resources.testdata.TestDataForLoginTest;

@Listeners(CustomListeners.class)
public class LoginTest extends BaseTest {
    LoginPage loginPage = new LoginPage();
    DashboardPage dashboardPage = new DashboardPage();
    HomePage homePage = new HomePage();

    @BeforeMethod(alwaysRun = true)
    public void inIt() {
        dashboardPage = new DashboardPage();
        loginPage = new LoginPage();
        homePage = new HomePage();
    }

    @Test(groups = {"sanity", "smoke", "regression"})
    public void verifyUserShouldLoginSuccessFully() {
        // Enter username
        loginPage.enterUsername("Admin");
        // Enter password
        loginPage.enterPassword("admin123");
        // Click on Login Button
        loginPage.clickOnLoginButton();
        // Verify "Dashboard" Message
        Assert.assertEquals(dashboardPage.verifyTextDashboard(), "Dashboard");
    }

    @Test(groups = {"Smoke" , "Regression"})
    public void VerifyThatTheLogoDisplayOnLoginPage() {
        // Login To The application
        loginPage.loginSuccessfully("Admin", "admin123");
        // Verify Logo is Displayed
        homePage.verifyOrangeHrmLogo();
    }

    @Test(groups = {"regression"})
    public void verifyUserShouldLogOutSuccessFully() {
        // Login To The application
        loginPage.loginSuccessfully("Admin", "admin123");
        // Click on User Profile logo
        dashboardPage.clickOnUserProfileLogo();
        // Mouse hover on "Logout" and click
        dashboardPage.clickOnLogout();
        // Verify the text "Login Panel" is displayed
        Assert.assertEquals(loginPage.verifyTextLogin(),"Login");
    }

    @Test(groups = {"regression"},dataProvider = "DataSet",dataProviderClass = TestDataForLoginTest.class)
    public void verifyErrorMessageWithInvalidCredentials(String username, String password, String errorMessage) {
        //Enter username <username>
        loginPage.enterUsername(username);
        // Enter password <password>
        loginPage.enterPassword(password);
        // Click on Login Button
        loginPage.clickOnLoginButton();
        // Verify Error message <errorMessage>
        Assert.assertEquals(loginPage.verifyTextInvalidCredentials(),errorMessage);
    }

}
