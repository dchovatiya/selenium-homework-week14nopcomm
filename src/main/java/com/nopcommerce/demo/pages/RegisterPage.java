package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class RegisterPage extends Utility
{
     public RegisterPage()
     {
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//h1[text()='Register']")
    WebElement RegisterTextLink;

    @FindBy(id = "gender-female")
    WebElement female;

    @FindBy(xpath = "//input[@id='FirstName']")
    WebElement Firstname;

    @FindBy(id = "LastName")
    WebElement LastName;
    @FindBy(xpath = "//select[@name='DateOfBirthDay']")
    WebElement DateOfBirth;

    @FindBy(xpath = "//select[@name='DateOfBirthMonth']")
    WebElement MonthOfBirth;

    @FindBy(name = "DateOfBirthYear" )
    WebElement YearOfBirth;

    @FindBy(xpath ="//input[@id='Email']")
    WebElement Email;

    @FindBy(id ="Password")
    WebElement Password;

    @FindBy(id = "ConfirmPassword")
    WebElement ConfirmPassword;

    @FindBy(id = "register-button")
    WebElement RegisterButton;

    @FindBy(xpath="//span[@id='FirstName-error']")
    WebElement FirstNameIsRequiredLink;

    @FindBy(xpath = "//span[@id='LastName-error']")
    WebElement LastNameIsRequiredLink;

    @FindBy(xpath = "//span[@id='Email-error']")
    WebElement EmailIsRequiredLink;
    @FindBy(xpath = "//span[@id='Password-error']")
    WebElement PasswordISRequiredLink;

    @FindBy(xpath = "//span[@id='ConfirmPassword-error']")
    WebElement ConfirmPasswordISRequiredLink;

    @FindBy(xpath = "//div[contains(text(),'Your registration completed')]")
    WebElement YourRegisterCompleteMessageLink;

    @FindBy(xpath = "//a[contains(text(),'Continue')]")
    WebElement ContinueButtonLink;
    @FindBy(xpath = "//h1[text()='Register']")
    WebElement registerTxt;

    public String verifyRegisterLinkTxt(){
        getTextFromElement(registerTxt);
        return registerTxt.getText();
    }
    public void clickOnFemale(){
        Reporter.log("select female" +female.toString() + "<br>");
        clickOnElement(female);
    }
    public void enterFirstname(String name){
        Reporter.log("Enter firstname"+ name+"to firstname field" + Firstname.toString() + "<br>");
        sendTextToElement(Firstname,name);
    }
    public void enterLastname(String lastname){
        Reporter.log("Enter Lastname"+lastname+"to lastname field" + LastName.toString() + "<br>");
        sendTextToElement(LastName,lastname);
    }
    public void selectDateOfBirth(String dob){
        Reporter.log("select Date of Birth" +DateOfBirth.toString() + "<br>");
        selectByVisibleTextFromDropDown(DateOfBirth,dob);
    }
    public void selectMonthOfBirth(String mob){
        Reporter.log("select Date of Month" +MonthOfBirth.toString() + "<br>");
        selectByVisibleTextFromDropDown(MonthOfBirth,mob);
    }
    public void selectYearOfBirth(String yob){
        Reporter.log("select Date of Year" +YearOfBirth.toString() + "<br>");
        selectByVisibleTextFromDropDown(YearOfBirth,yob);
    }
    public void enterEmail(String s){
        Reporter.log("send email" +Email.toString() + "<br>");
        //randomClass(Email);
        sendTextToElement(Email,s);

    }
    public void enterPassword(String psw){
        Reporter.log("send Password" +Password.toString() + "<br>");
        sendTextToElement(Password,psw);
    }
    public void enterConfirmPassword(String confirmPassword1){
        Reporter.log("send Confirm Password " +ConfirmPassword.toString()+ "<br>");
        sendTextToElement(ConfirmPassword,confirmPassword1);
    }
    public void clickOnRegisterButton(){
        Reporter.log("click on register Button " +RegisterButton.toString()+ "<br>");
        clickOnElement(RegisterButton);
    }
    public void setFirstNameIsRequired()
    {
        Reporter.log("verify First name is required." +FirstNameIsRequiredLink.toString() + "<br>");
        verifyTheText("First name is required.",FirstNameIsRequiredLink);
    }
    public void setLastNameIsRequired()
    {
        Reporter.log("verify Last name is required" +LastNameIsRequiredLink.toString() + "<br>");
        verifyTheText("Last name is required.",LastNameIsRequiredLink);
    }
    public void setEmailIsRequired(){
        Reporter.log("verify Email is required" +EmailIsRequiredLink.toString() + "<br>");

        verifyTheText("Email is required.",EmailIsRequiredLink);
    }
    public void setPasswordIsRequired(){
        Reporter.log("verify Password is required." +PasswordISRequiredLink.toString() + "<br>");

        verifyTheText("Password is required.",PasswordISRequiredLink);

    }
    public void setConfirmPasswordISRequired(){
        Reporter.log("verify Confirm Password is required." + ConfirmPasswordISRequiredLink.toString() + "<br>");

        verifyTheText("Password is required.",ConfirmPasswordISRequiredLink);
    }
    public String verifyYourRegisterCompleteMessage() {
        Reporter.log("verify Your registration completed" + FirstNameIsRequiredLink.toString() + "<br>");
        getTextFromElement(FirstNameIsRequiredLink);
        return FirstNameIsRequiredLink.getText();

        //verifyThatTextIsDisplayed(FirstNameIsRequiredLink,"Your registration completed");
        //verifyTheText("Your registration completed",FirstNameIsRequiredLink);
        //
    }
    public void setContinueButtonLink()
    {
        Reporter.log("click on continue " + ContinueButtonLink.toString() + "<br>");
        clickOnElement(ContinueButtonLink);
    }







}
