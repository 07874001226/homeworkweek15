package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.Reporter;

import java.util.concurrent.TimeUnit;

public class TopMenuPage extends Utility {

    HomePage homePage = new HomePage();

    By verifyComputerPageNavigation = By.partialLinkText("Computers");
    By verifyElectronicsPageNavigation = By.partialLinkText("Electronics");
    By verifyApparelPageNavigation = By.partialLinkText("Apparel");
    By verifyDigitalDownloadsPageNavigation = By.partialLinkText("Digital downloads");
    By verifyBooksPageNavigation = By.partialLinkText("Books");
    By verifyJewelryPageNavigation = By.partialLinkText("Jewelry");
    By verifyGiftCardsPageNavigation = By.partialLinkText("Gift Cards");


    public void selectMenu(String menu) throws InterruptedException {
        // Thread.sleep(1000);
        if (menu == "Computers") {
            homePage.clickOnCompterLink();
        } else if (menu == "Electronics") {
            homePage.clickOnElectronicsLink();
        } else if (menu == "Apparel") {
            homePage.clickOnApparelLink();
        } else if (menu == "Digital downloads") {
            homePage.clickOnDigitalDownloadsLink();
        } else if (menu == "Books") {
            homePage.clickOnBooksLink();
        } else if (menu == "Jewelry") {
           homePage.clickOnJewelryLink();
        } else if (menu == "Gift Cards") {
         homePage.clickOnGiftCardsLink();
        }
    }
    public String verifyComputerPageNavigation() {
        Reporter.log("Verify user navigate to computer page successfully" + verifyComputerPageNavigation.toString()+ "<br>");
        return getTextFromElement(verifyComputerPageNavigation);
    }

    public String verifyElectronicsPageNavigation() {
        Reporter.log("Verify user navigate to electronic page successfully" + verifyElectronicsPageNavigation.toString()+ "<br>");
        return getTextFromElement(verifyElectronicsPageNavigation);
    }

    public String verifyApparelPageNavigation() {
        Reporter.log("Verify user navigate to apparel page successfully" + verifyApparelPageNavigation.toString()+ "<br>");
        return getTextFromElement(verifyApparelPageNavigation);
    }

    public String verifyDigitalDownloadsPageNavigation() {
        Reporter.log("Verify user navigate to digitaldownloads page successfully" + verifyDigitalDownloadsPageNavigation.toString()+ "<br>");
        return getTextFromElement(verifyDigitalDownloadsPageNavigation);
    }

    public String verifyBooksPageNavigation() {
        Reporter.log("Verify user navigate to books page successfully" + verifyBooksPageNavigation.toString()+ "<br>");
        return getTextFromElement(verifyBooksPageNavigation);
    }

    public String verifyJewelryPageNavigation() {
        Reporter.log("Verify user navigate to jewelry page successfully" + verifyJewelryPageNavigation.toString()+ "<br>");
        return getTextFromElement(verifyJewelryPageNavigation);
    }

    public String verifyGiftCardsPageNavigation() {
        Reporter.log("Verify user navigate to giftcards page successfully" + verifyGiftCardsPageNavigation.toString()+ "<br>");
        return getTextFromElement(verifyGiftCardsPageNavigation);
    }


}
