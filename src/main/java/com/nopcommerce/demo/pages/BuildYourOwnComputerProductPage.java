package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;

public class BuildYourOwnComputerProductPage extends Utility {

    By buildYourOwnComputer = By.ByCssSelector.xpath("//h1[contains(text(),'Build your own computer')]");
    By selectProcesser = By.xpath("//select[@id='product_attribute_1']");
    By selectRam = By.xpath("//select[@id='product_attribute_2']");
    By hddRadio = By.xpath("//dd[@id='product_attribute_input_3']//label[text()='400 GB [+$100.00]']");
    By osRadio = By.xpath("//input[@id='product_attribute_4_9']");
    By microSoftOffice = By.xpath("//input[@id='product_attribute_5_10']");
    By totalCammandor = By.xpath("//input[@name='product_attribute_5' and @id='product_attribute_5_12']");
    By verifyPrice = By.xpath("//span[text()='$1,475.00']");
    By addCartButton = By.xpath("//button[@id='add-to-cart-button-1']");
    By verifyMessage = By.xpath("//p[text()='The product has been added to your ']");
    By closeTab = By.xpath("//span[@class='close']");

    public String verifyBuildYourOwnComputer() {
        Reporter.log("Build Your Computer" + buildYourOwnComputer.toString() + "<br>");
        return getTextFromElement(buildYourOwnComputer);

    }
    public void selectTheProcesser(String processor) {
        Reporter.log("Select The Processer" + selectProcesser.toString() + "<br>");
        selectByValueFromDropDown(selectProcesser, processor);
    }

    public void setSelectRam(String ram) {
        Reporter.log("Set Select Ram" + selectRam.toString() + "<br>");
        selectByValueFromDropDown(selectRam, ram);
    }

    public void clickOnHdd() {
        Reporter.log("On Hdd" + hddRadio.toString() + "<br>");
        clickOnElement(hddRadio);
    }

    public void clickOnOsRadio() {
        Reporter.log("On Os Radio" + osRadio.toString() + "<br>");
        clickOnElement(osRadio);
    }

    public void clickOnMicrosoftOffice() {
        Reporter.log("Microsoft Office" + microSoftOffice.toString() + "<br>");
        clickOnElement(microSoftOffice);
    }

    public void clickOnTotalCommender() {
        Reporter.log("Total Commender" + totalCammandor.toString() + "<br>");
        clickOnElement(totalCammandor);
    }

    public String verifyThePrice() {
        Reporter.log("Verify Price" + verifyPrice.toString() + "<br>");
        return getTextFromElement(verifyPrice);

    }

    public void clickOnAddtoCartButton() {
        Reporter.log("Add to Cart" + addCartButton.toString() + "<br>");
        clickOnElement(addCartButton);
    }

    public String verifyTopGreenBarMessage() {
        Reporter.log("Verify Message" + verifyMessage.toString() + "<br>");
        return getTextFromElement(verifyMessage);

    }
    public void setCloseTab(){
        Reporter.log("Build Your Computer" + buildYourOwnComputer.toString() + "<br>");
        clickOnElement(closeTab);
    }





}
