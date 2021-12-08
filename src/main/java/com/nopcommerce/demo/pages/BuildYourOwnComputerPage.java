package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class BuildYourOwnComputerPage extends Utility
{
    public BuildYourOwnComputerPage()
    {
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//h1[contains(text(),'Build your own computer')]")
    WebElement bldComTxt;
    @FindBy( xpath ="//select[@name='product_attribute_1']")
    WebElement processor;
    @FindBy(id = "product_attribute_2")
    WebElement ram;
    @FindBy(id ="product_attribute_3_7")
    WebElement HDD;
    @FindBy(id = "product_attribute_4_9")
    WebElement Os;
    @FindBy(id ="product_attribute_5_12")
    WebElement softwareCheckBox;
    @FindBy(id ="add-to-cart-button-1")
    WebElement cartBtn;
    @FindBy(xpath = "//p[contains(text(),'The product has been added to your')]")
    WebElement textMsg;
    public void clickOnBuildComTxt(){
        clickOnElement(bldComTxt);
    }

    public void clickOnProcessor(String processors){
        Reporter.log("set Processor" + processor.toString() + "<br>");
        clickOnElement(processor);

    }
    public void clickOnRam(String rams)
    {
        Reporter.log("set Ram" + ram.toString() + "<br>");
        selectByVisibleTextFromDropDown(ram,rams);
    }
    public void clickOnHDD(String hdd){
        Reporter.log("set HDD" + HDD.toString() + "<br>");
        clickOnElement(HDD);
    }
    public void clickOnOs(String os){
        Reporter.log("set Processor" + processor.toString() + "<br>");
        clickOnElement(Os);
    }
    public void clickOnSoftwareCheckBox(String software) {
        Reporter.log("set Software checkBox :" + softwareCheckBox.toString() + "<br>");
        clickOnElement(softwareCheckBox);
    }
    public void clickOnCartBtn()
    {
        Reporter.log("click on cartButton " + cartBtn.toString() + "<br>");
        clickOnElement(cartBtn);

    }
    public void verifyTextMsg()
    {
        Reporter.log("verify the message The product has been added to your shopping cart " + textMsg.toString() + "<br>");
        verifyThatTextIsDisplayed(textMsg,"Product is added to your shopping cart");

    }
    public void setDesktopFeatures(String processor,String ram, String HDD, String Os, String softwareCheckBox )
    {
        clickOnProcessor(processor);
        clickOnRam(ram);
        clickOnHDD(HDD);
        clickOnOs(Os);
        clickOnSoftwareCheckBox(softwareCheckBox);
    }
}
