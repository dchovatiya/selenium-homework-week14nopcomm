package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.customlisteners.CustomListeners;
import com.nopcommerce.demo.pages.BuildYourOwnComputerPage;
import com.nopcommerce.demo.pages.ComputerPage;
import com.nopcommerce.demo.pages.DesktopsPage;
import com.nopcommerce.demo.testbase.TestBase;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import resources.testdata.TestData;

@Listeners(CustomListeners.class)
public class ComputerPageTest extends TestBase
{
    ComputerPage computerPage;
    DesktopsPage desktopsPage;
    BuildYourOwnComputerPage buildYourOwnComputerPage;
    @BeforeMethod
    public void inIt()
    {
        computerPage=new ComputerPage();
        desktopsPage=new DesktopsPage();
        buildYourOwnComputerPage=new BuildYourOwnComputerPage();
    }
    @Test
    public void verifyUserShouldNavigateToComputerPageSuccessfully()
    {
        computerPage.clickOnComputer();
        computerPage.getComputerTxt();
    }
    @Test
    public void verifyUserShouldNavigateToDesktopsPageSuccessfully()
    {
        computerPage.clickOnComputer();
        computerPage.clickOnDesktopLink();
        desktopsPage.getDesktopText();
    }
    @Test(dataProvider = "Desktop Features", dataProviderClass = TestData.class)
    public void VerifyThatUserShouldBuildYouOwnComputerAndAddThemToCartSuccessfully(String processor, String ram, String hdd,
                                                                                    String os, String software) throws InterruptedException
    {
        computerPage.clickOnComputer();
        Thread.sleep(2000);
        computerPage.clickOnDesktopLink();
        Thread.sleep(2000);
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollBy(0,500)");
        desktopsPage.clickOnBuildYourOwnCom();
        Thread.sleep(2000);
        buildYourOwnComputerPage.setDesktopFeatures(processor,ram,hdd,os,software);
        Thread.sleep(2000);
        buildYourOwnComputerPage.clickOnCartBtn();
        buildYourOwnComputerPage.verifyTextMsg();
        Thread.sleep(2000);
    }
}
