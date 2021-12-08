package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class LoginPage extends Utility
{
    public LoginPage()
    {
        PageFactory.initElements(driver,this);
    }
    @FindBy(id="Email")
    WebElement email;
    @FindBy(id="Password")
    WebElement password;
    @FindBy(xpath="//button[@class='button-1 login-button']")
    WebElement loginBtn;
    @FindBy(xpath="//h1[contains(text(),'Welcome, Please Sign In!')]")
    WebElement welcomeText ;
    @FindBy(xpath = "//div[@class='message-error validation-summary-errors']")
    WebElement errorMessage;

    public String getWelcomeText(){
        String message = getTextFromElement(welcomeText);
        Reporter.log("Get welcome Text" + " to email field "+welcomeText.toString() + "<br>");
        return message;
    }
    public void enterEmailId(String emailId)
    {
        //randomClass(email);

        sendTextToElement(email,emailId);
        Reporter.log("Enter email" + " to email field "+email.toString() + "<br>");
    }

    public void enterPassword(String passwordField){
        sendTextToElement(password, passwordField);
        Reporter.log("Enter password " + password + " to password field " + passwordField.toString() + "<br>");
    }

    public void clickOnLoginButton(){
        Reporter.log("click On " + loginBtn.toString() + "<br>");
        clickOnElement(loginBtn);

    }

    public String getErrorMessage(){
        String message = getTextFromElement(errorMessage);
        Reporter.log("verify error msg: " + errorMessage.toString() + "<br>");
        return message;
    }
}
