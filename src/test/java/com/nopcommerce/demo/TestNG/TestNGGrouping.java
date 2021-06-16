package com.nopcommerce.demo.TestNG;

import org.testng.annotations.Test;

public class TestNGGrouping {
    @Test(groups = {"smoke","sanity","regression"})
    public void verifyUserShouldNavigateToComputerPage(){
        System.out.println("Computer Page");
    }
    @Test(groups = {"sanity","regression"})
    public void verifyUserShouldNavigateToElectronicsPage(){
        System.out.println("Electronic Page");
    }
    @Test(groups = "regression")
    public void verifyUserShouldNavigateToApparelPage(){
        System.out.println("Apparel Page");
    }
    @Test(groups = "regression")
    public void verifyUserShouldNavigateToDigitalDownloadsPage(){
        System.out.println("Digital Download");
    }
    @Test(groups = "regression")
    public void verifyUserShouldNavigateToBooksPage(){
        System.out.println("Books Page");
    }
    @Test(groups = "regression")
    public void verifyUserShouldNavigateToJewelrtPage(){
        System.out.println("Jewelry");
    }
    @Test(groups = "regression")
    public void verifyUserShouldNavigateToGiftCardsPage(){
        System.out.println("Gift Card Page");
    }
    @Test(groups = "regression")
    public void verifyProductArrangeInAlphaBaticalOrder(){
        System.out.println("Alphabetical Order");
    }
    @Test(groups = "regression")
    public void verifyProductAddedToShoppingCartSuccessFully(){
        System.out.println("Shopping Cart");
    }
}
