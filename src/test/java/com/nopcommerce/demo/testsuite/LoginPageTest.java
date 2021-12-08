package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.customlisteners.CustomListeners;
import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.pages.LoginPage;
import com.nopcommerce.demo.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(CustomListeners.class)
public class LoginPageTest extends TestBase
{
    HomePage homePage;
    LoginPage loginPage;
    RegisterPageTest registerPageTest;
    @BeforeMethod
    public  void inIt()
    {
        homePage = new HomePage();
        loginPage = new LoginPage();
        registerPageTest = new RegisterPageTest();
    }
    @Test(groups = {"smoke","regression"})
    public void userShouldNavigateToLoginPageSuccessFully()
    {
        homePage.clickOnLoginLink();
        String expectedMessage = "Welcome, Please Sign In!";
        String actualMessage = loginPage.getWelcomeText();
        Assert.assertEquals(expectedMessage, actualMessage, "Login page not displayed");
    }
    @Test(groups = {"sanity","regression"})
    public void  verifyTheErrorMessageWithInValidCredentials() throws InterruptedException
    {
        homePage.clickOnLoginLink();
        loginPage.enterEmailId("dpatel1234@yahoo.com");
        Thread.sleep(2000);
        loginPage.enterPassword("java1234");
        loginPage.clickOnLoginButton();
        String expectedErrorMessage = "Login was unsuccessful. Please correct the errors and try again.\n"
                + "No customer account found";
        String actualErrorMessage = loginPage.getErrorMessage();
        Assert.assertEquals( expectedErrorMessage, actualErrorMessage,"Error message not displayed");
    }
    @Test(groups = {"sanity","regression"})
    public void verifyThatUserShouldLogInSuccessFullyWithValidCredentials() throws InterruptedException {
        homePage.clickOnLoginLink();
        loginPage.enterEmailId("dpatel1234@yahoo.com");
        Thread.sleep(2000);
        loginPage.enterPassword("java1234");
        Thread.sleep(2000);
        loginPage.clickOnLoginButton();
        Thread.sleep(2000);
        homePage.verifyLogoutLink();
    }
    @Test(groups = {"regression"})
    public void VerifyThatUserShouldLogOutSuccessFully() throws InterruptedException
    {
        homePage.clickOnLoginLink();
        loginPage.enterEmailId("dpatel1234@yahoo.com");
        Thread.sleep(2000);
        loginPage.enterPassword("java1234");
        Thread.sleep(2000);
        loginPage.clickOnLoginButton();
        Thread.sleep(2000);
        homePage.clickOnLogOut();
        Thread.sleep(2000);
        homePage.verifyLoginLink();
    }
}
