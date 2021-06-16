package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;
import org.testng.Reporter;

import java.util.List;

public class DesktopPage extends Utility {
    //Reporter.log("" + .toString() + "<br>");


    By clickOnDesktopLink = By.xpath("//a[text()=' Desktops ']");
    By selectOnZtoA = By.id("products-orderby");
    By verifyProductDescending = By.xpath("//h2[@class='product-title']");
    By getSelectOnAtoZ = By.id("products-orderby");
    By addToCart = By.xpath("//div[@class='item-box'][1]//button[text()='Add to cart']");


    public void setClickOnDesktopLink() {
        Reporter.log("Click on Desktop" + clickOnDesktopLink.toString() + "<br>");
        clickOnElement(clickOnDesktopLink);
    }

    public void setSelectOnZtoA(String value) {
        Reporter.log("Select On Alphabeticaly Reverse" + selectOnZtoA.toString() + "<br>");
        selectByValueFromDropDown(selectOnZtoA,value);
    }

    public List setVerifyProductDescending() {
        Reporter.log("Verify product Desceding Order" + verifyProductDescending.toString() + "<br>");
        return getListfromwebelements(verifyProductDescending);
    }

    public void setGetSelectOnAtoZ(String value) {
        Reporter.log("Select On Alphabeticaly" + getSelectOnAtoZ.toString() + "<br>");
        selectByValueFromDropDown(getSelectOnAtoZ,value);

    }

    public void setAddToCart() {
        Reporter.log("Add to cart" + addToCart.toString() + "<br>");
        clickOnElement(addToCart);
    }

}








