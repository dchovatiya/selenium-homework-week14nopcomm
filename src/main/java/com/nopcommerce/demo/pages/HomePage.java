package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class HomePage extends Utility
{
    public HomePage()
    {
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath="//a[normalize-space()='Log in']")
   // @FindBy(linkText = "Log in")
    WebElement login ;
    @FindBy(linkText = "Register")
    WebElement register;
    @FindBy(xpath ="//img[@alt='nopCommerce demo store']")
    WebElement nopcommerceLogo ;
    @FindBy(xpath ="//a[contains(text(),'Log out')]")
    WebElement logOut;
    @FindBy(xpath ="//ul[@class='list']//a[normalize-space()='My account']")
    WebElement myAccount;

    public void clickOnLoginLink(){
        //Reporter.log("click On login Link"+login.toString() + "<br>");
        clickOnElement(login);
    }

    public void clickOnRegisterLink(){
        Reporter.log("click On register Link"+register.toString() + "<br>");
        clickOnElement(register);
    }
    public void verifyLogo()
    {

    }
    public void clickOnMyAccount(){
        Reporter.log("click On myAccount "+myAccount.toString() + "<br>");
        clickOnElement(myAccount);
    }
    public void clickOnLogOut(){
        Reporter.log("click On logOut"+logOut.toString() + "<br>");
        clickOnElement(logOut);
    }
    public String verifyLogoutLink(){
        Reporter.log("verify Logout Text "+logOut.toString() + "<br>");
        getTextFromElement(logOut);
        return logOut.getText();
    }
    public String verifyLoginLink(){
        Reporter.log("verify loginLink"+login.toString() + "<br>");
        getTextFromElement(login);
        return login.getText();
    }
}
