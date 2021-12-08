package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class ComputerPage extends Utility
{
    public ComputerPage()
    {
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//h1[text()='Computers']")
    WebElement computerTxt;
    @FindBy(xpath = "//ul[@class='top-menu notmobile']//a[contains(text(),'Computers')]")
    WebElement computerLink;
    @FindBy(xpath = "//li[@class='active last']//a[normalize-space()='Desktops']")
    WebElement desktopLink;
    @FindBy(xpath = "//ul[@class='top-menu notmobile']//a[contains(text(),'Notebooks')]")
    WebElement notebookLink;

    @FindBy(xpath = "//ul[@class='top-menu notmobile']//a[contains(text(),'Software')]")
    WebElement softwareLink;


    public String getComputerTxt()
    {
        getTextFromElement(computerTxt);
        return computerTxt.getText();
    }
    public void clickOnComputer()
    {
        Reporter.log("click on Computer:" + computerLink.toString() + "<br>");
        clickOnElement(computerLink);
    }
    public void clickOnDesktopLink()
    {
        Reporter.log("click on Desktop:" + desktopLink.toString() + "<br>");
        mouseHoverToElementAndClick(desktopLink);
        //clickOnElement(desktopLink);
    }
    public void clickOnNoteBookLink()
    {
        Reporter.log("click on NoteBook:" + notebookLink.toString() + "<br>");

        clickOnElement(notebookLink);
    }
    public void ClickOnSoftwareLink()
    {
        Reporter.log("click on Software:" + softwareLink.toString() + "<br>");

        clickOnElement(softwareLink);
    }





}
