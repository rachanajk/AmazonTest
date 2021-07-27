package com.script;


import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.generic.BaseTest;
import com.pagefactory.AmazonBasicsPage;
import com.pagefactory.AmazonHomePage;
import com.pagefactory.CartPage;
import com.pagefactory.CreditCardShrederProductPage;

public class AmazonFlowTest extends BaseTest {
	AmazonHomePage objAmazonHomePage=new AmazonHomePage();
	AmazonBasicsPage objAmazonBasicsPage=new AmazonBasicsPage();
	CreditCardShrederProductPage objCreditCardShrederProductPage=new CreditCardShrederProductPage();
	CartPage objCartPage=new CartPage();
	
  @BeforeClass
  public void IntializeEncirinment() {
	  
	  initializeWebBrowser();
	 
  }
  @Test
  public void validateProductFlow(){
	  objAmazonHomePage.clickOnAmazonBasics();
	  objAmazonBasicsPage.checkHeaderForAmazonBasics();
	  objAmazonBasicsPage.selectOurBrand();
	  objAmazonBasicsPage.getListOfProducts();
	  objCreditCardShrederProductPage.verifyProductPage();
	  objCreditCardShrederProductPage.Check8SheetIsSelected();
	  objCreditCardShrederProductPage.clickOnAddToCartButton();
	  objCartPage.clickOnCart();
	  objCartPage.verifyProductDispalyedInCart();
	  objCartPage.verifyCartQuantity();
  }
   @AfterClass(enabled=false)
   public void tearDownEnvironment(){
	   
	   tearDown();
   }
}
