package com.nopcommerce.demo.pages;


import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;
import org.testng.Reporter;

public class HomePage extends Utility {

    By computersLink = By.linkText("Computers");

    By electronicsLink = By.linkText("Electronics");

    By apparelLink = By.linkText("Apparel");

    By digitaldownloadsLink = By.linkText("Digital downloads");

    By booksLink = By.linkText("Books");

    By jewelryLink = By.linkText("Jewelry");

    By giftcardLink = By.linkText("Gift Cards");

    public void clickOnCompterLink() {
        Reporter.log("Clicking on computer link" + computersLink.toString() + "<br>");
        clickOnElement(computersLink);
    }

    public void clickOnElectronicsLink() {
        Reporter.log("Clicking on electronics link " + electronicsLink.toString() + "<br>");
        clickOnElement(electronicsLink);
    }

    public void clickOnApparelLink() {
        Reporter.log("Clicking on apparel link" + apparelLink.toString() + "<br>");
        clickOnElement(apparelLink);
    }

    public void clickOnDigitalDownloadsLink() {
        Reporter.log("Clicking on digital downloads link" + digitaldownloadsLink.toString() + "<br>");
        clickOnElement(digitaldownloadsLink);
    }

    public void clickOnBooksLink() {
        Reporter.log("Clicking books link" + booksLink.toString() + "<br>");
        clickOnElement(booksLink);
    }

    public void clickOnJewelryLink() {
        Reporter.log("Clicking on jewelry link" + jewelryLink.toString() + "<br>");
        clickOnElement(jewelryLink);
    }

    public void clickOnGiftCardsLink() {
        Reporter.log("Clicking on giftcards link" + giftcardLink.toString() + "<br>");
        clickOnElement(giftcardLink);

    }


}