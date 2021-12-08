package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class DesktopsPage extends Utility
{

    public DesktopsPage(){
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//h1[normalize-space()='Desktops']")
    WebElement desktopTxt;
    @FindBy(xpath = "//span[contains(text(),'Sort by')]")
    WebElement sortBy;
    @FindBy(xpath = "//span[contains(text(),'Display')]")
    WebElement display;
    @FindBy(xpath = "//a[contains(text(),'List')]")
    WebElement productList;
    @FindBy(linkText = "Build your own computer")
    WebElement BldComputerLnk;

    public String getDesktopText()
    {
        getTextFromElement(desktopTxt);
        return desktopTxt.getText();
    }
    public void clickOnBuildYourOwnCom()
    {
         clickOnElement(BldComputerLnk);
    }
    public void clickOnSortBy(){
        Reporter.log("click on sortBy" +sortBy.toString() + "<br>");

        clickOnElement(sortBy);
    }
    public void clickOnDisplay(){
        Reporter.log("click on display" +display.toString() + "<br>");

        clickOnElement(display);
    }
    public void setProductList(){
        Reporter.log("click on productList" +productList.toString() + "<br>");

        clickOnElement(productList);
    }
}

