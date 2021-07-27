package com.pagefactory;

import org.openqa.selenium.By;

import com.generic.BaseTest;
import com.generic.WrapperFunction;

public class CreditCardShrederProductPage {
	By loc_hdr_ProductTitlePage=By.xpath("//span[@id='productTitle']");
	By loc_lnk_8SheetSelected=By.xpath("//li[@title='Click to select 8 Sheet']");
	By loc_btn_addToCart=By.xpath("//input[@id='add-to-cart-button']");
	
	
	public void verifyProductPage(){
		WrapperFunction.assertTrue(BaseTest.getDriver().findElement(loc_hdr_ProductTitlePage).getText().equals("Amazon Basics 8-Sheet Capacity, Cross-Cut Paper and Credit Card Shredder, 4.1 Gallon"));
	}
	
	public void Check8SheetIsSelected(){
		WrapperFunction.assertTrue(BaseTest.getDriver().findElement(loc_lnk_8SheetSelected).isEnabled());
	}
	
	public void clickOnAddToCartButton(){
		WrapperFunction.assertTrue(BaseTest.getDriver().findElement(loc_btn_addToCart).isDisplayed());
		BaseTest.getDriver().findElement(loc_btn_addToCart).click();
	
	}
}
