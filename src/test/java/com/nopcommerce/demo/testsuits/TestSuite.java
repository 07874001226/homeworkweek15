package com.nopcommerce.demo.testsuits;

import com.nopcommerce.demo.pages.BuildYourOwnComputerProductPage;
import com.nopcommerce.demo.pages.DesktopPage;
import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.testbase.TestBase;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestSuite extends TestBase {
    DesktopPage desktopPage = new DesktopPage();
    HomePage homePage = new HomePage();
    BuildYourOwnComputerProductPage buildYourOwnComputerProductPage = new BuildYourOwnComputerProductPage();

    @Test
    public void verifyProductArrangeInAlphaBaticalOrder() throws InterruptedException {
        homePage.clickOnCompterLink();
        Thread.sleep(1000);
        desktopPage.setClickOnDesktopLink();
        desktopPage.setSelectOnZtoA("6");
        Thread.sleep(2000);
        List<WebElement> desktop;
        desktop = desktopPage.setVerifyProductDescending();
        List<String> desktopList = new ArrayList<>();
        for (WebElement productname : desktop) {

            desktopList.add(productname.getText());
        }
        List<String> tempList = new ArrayList<>();
        tempList.addAll(desktopList);
        Collections.sort(tempList, Collections.reverseOrder());
        System.out.println(desktopList);
        System.out.println(tempList);
        Assert.assertEquals(desktopList, tempList);
    }

    @Test
    public void verifyProductAddedToShoppingCartSuccessFully() throws InterruptedException {

        homePage.clickOnCompterLink();
        Thread.sleep(1000);
        desktopPage.setClickOnDesktopLink();
        desktopPage.setGetSelectOnAtoZ("5");
        Thread.sleep(2000);
        desktopPage.setAddToCart();
        String expectedmessage = "Build your own computer";
        String actualmessage = buildYourOwnComputerProductPage.verifyBuildYourOwnComputer();
        Assert.assertEquals(expectedmessage, actualmessage);
        Thread.sleep(1000);
        buildYourOwnComputerProductPage.selectTheProcesser("1");
        buildYourOwnComputerProductPage.setSelectRam("5");
        Thread.sleep(1000);
        buildYourOwnComputerProductPage.clickOnHdd();
        Thread.sleep(1000);
        buildYourOwnComputerProductPage.clickOnOsRadio();
        buildYourOwnComputerProductPage.clickOnMicrosoftOffice();
        Thread.sleep(2000);
        buildYourOwnComputerProductPage.clickOnMicrosoftOffice();
        buildYourOwnComputerProductPage.clickOnTotalCommender();
        Thread.sleep(2000);
        String expectedPrice = "$1,475.00";
        String actualPrice = buildYourOwnComputerProductPage.verifyThePrice();
        Assert.assertEquals(expectedPrice, actualPrice);
        Thread.sleep(1000);
        buildYourOwnComputerProductPage.clickOnAddtoCartButton();
        String expectedMessage = "The product has been added to your shopping cart";
        String actualMessage = buildYourOwnComputerProductPage.verifyTopGreenBarMessage();
        Assert.assertEquals(expectedMessage, actualMessage);
        Thread.sleep(1000);
        buildYourOwnComputerProductPage.setCloseTab();
    }

}
