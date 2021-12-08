package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.customlisteners.CustomListeners;
import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.pages.RegisterPage;
import com.nopcommerce.demo.testbase.TestBase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(CustomListeners.class)
public class RegisterPageTest extends TestBase
{
    RegisterPage registerPage;
    HomePage homePage;

    @BeforeMethod
    public void inIt() {
        homePage = new HomePage();
        registerPage = new RegisterPage();

    }
    @Test(priority = 1)
    public void verifyUserShouldNavigateToRegisterPageSuccessfully() throws InterruptedException {
        homePage.clickOnRegisterLink();
        Thread.sleep(2000);
        registerPage.verifyRegisterLinkTxt();
    }
    @Test(priority = 2)
    public void verifyThatFirstNameLastNameEmailPasswordAndConfirmPasswordFieldsAreMandatory() throws InterruptedException {
        homePage.clickOnRegisterLink();
        Thread.sleep(2000);
        registerPage.clickOnRegisterButton();
        Thread.sleep(2000);
        registerPage.setFirstNameIsRequired();
        Thread.sleep(2000);
        registerPage.setLastNameIsRequired();
        Thread.sleep(2000);
        registerPage.setEmailIsRequired();
        registerPage.setPasswordIsRequired();
        Thread.sleep(2000);
        registerPage.setConfirmPasswordISRequired();
    }
    @Test(priority = 3)
    public void VerifyThatUserShouldCreateAccountSuccessfully() throws InterruptedException
    {
        homePage.clickOnRegisterLink();
        registerPage.clickOnFemale();
        Thread.sleep(2000);
        registerPage.enterFirstname("Mira");
        Thread.sleep(2000);
        registerPage.enterLastname("patel");
        registerPage.selectDateOfBirth("5");
        Thread.sleep(2000);
        registerPage.selectMonthOfBirth("July");
        Thread.sleep(2000);
        registerPage.selectYearOfBirth("1985");
        Thread.sleep(2000);
        registerPage.enterEmail("dpatel567@yahoo.com");
        Thread.sleep(2000);
        registerPage.enterPassword("abcd123");
        Thread.sleep(3000);
        registerPage.enterConfirmPassword("abcd123");
        Thread.sleep(2000);
        registerPage.clickOnRegisterButton();
        Thread.sleep(2000);
        //registerPage.verifyYourRegisterCompleteMessage();
    }
}
