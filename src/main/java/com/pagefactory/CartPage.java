package com.pagefactory;

import org.openqa.selenium.By;

import com.generic.BaseTest;
import com.generic.WrapperFunction;

public class CartPage {
	
	By loc_btn_ClickOnCart=By.xpath("//span[@id='attach-sidesheet-view-cart-button']");
	By loc_btn_verifyProductInCart=By.xpath("//span[contains(text(),'Amazon Basics 8-Sheet Capacity, Cross-Cut Paper and Credit Card Sh…')]");
	By loc_lnk_CartQuantity=By.xpath("//span[@id='nav-cart-count']");
	public void clickOnCart(){
		WrapperFunction.setExplicitWaitForelementToBeClickable(20, loc_btn_ClickOnCart, BaseTest.getDriver());
		BaseTest.getDriver().findElement(loc_btn_ClickOnCart).click();
	}
	
	public void verifyProductDispalyedInCart(){
		WrapperFunction.setExplicitWaitForvisibilityOfElementLocated(20, loc_btn_verifyProductInCart, BaseTest.getDriver());
		WrapperFunction.assertTrue(BaseTest.getDriver().findElement(loc_btn_verifyProductInCart).isDisplayed());
		
	}
	
	public void verifyCartQuantity(){
		WrapperFunction.setExplicitWaitForvisibilityOfElementLocated(20, loc_lnk_CartQuantity, BaseTest.getDriver());
		WrapperFunction.assertTrue(BaseTest.getDriver().findElement(loc_lnk_CartQuantity).isDisplayed());
	}
}
