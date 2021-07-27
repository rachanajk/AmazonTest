package com.pagefactory;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import com.generic.BaseTest;
import com.generic.WrapperFunction;
//import com.sun.java.util.jar.pack.Attribute.Layout.Element;


public class AmazonBasicsPage {

	By loc_hdr_AmazonBasicsResult=By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']");
	By loc_chekbx_OurBrands=By.xpath("//li[@id='p_n_feature_forty-seven_browse-bin/21180942011']//a//i");
	By loc_btn_next=By.xpath("//li[@class='a-last']//a");
	By loc_hdrProductName=By.xpath("//span[@id='productTitle']/parent::h1[@id='title' and contains(.,'Amazon Basics 8-Sheet Capacity, Cross-Cut Paper and Credit Card Shredder, 4.1 Gallon')]");
	 By loc_btnNextPage = By.xpath("//a[contains(.,'Next')]");
	    By loc_listProducts= By.xpath("//div[@class='a-section a-spacing-medium']//h2//span");
	    By loc_imgProduct= By.xpath("//img[@alt='Amazon Basics 8-Sheet Capacity, Cross-Cut Paper and Credit Card Shredder, 4.1 Gallon']");
	
	 
 
	
	public void checkHeaderForAmazonBasics(){
		WrapperFunction.setExplicitWaitForvisibilityOfElementLocated(30, loc_hdr_AmazonBasicsResult, BaseTest.driver);
	if(BaseTest.getDriver().findElement(loc_hdr_AmazonBasicsResult).isDisplayed()){
		System.out.println("verifying header");
	}
	}
	
	public void selectOurBrand(){
		
		JavascriptExecutor js = (JavascriptExecutor) BaseTest.getDriver();
		js.executeScript("window.scrollBy(0,2050)", "");
		//js.executeScript("window.scro", arg1)
		BaseTest.getDriver().findElement(loc_chekbx_OurBrands).isDisplayed();
		BaseTest.getDriver().findElement(loc_chekbx_OurBrands).click();
		
	}
	
	   public void getListOfProducts(){
           System.out.println("Enter into getproductlist");            
           do {
               List<WebElement> products = BaseTest.driver.findElements(loc_listProducts);
               int intProductSize = products.size();
               System.out.println("Product Size : "+intProductSize);
                for(WebElement product : products){
                System.out.println(product.getText());
                
                if(product.getText().equals("Amazon Basics 8-Sheet Capacity, Cross-Cut Paper and Credit Card Shredder, 4.1 Gallon")){
                    System.out.println("Enter in Got Product If Statement");
                    BaseTest.driver.findElement(loc_imgProduct).isDisplayed();
                    WrapperFunction.scrollToViewElement(loc_imgProduct);
                    WrapperFunction.setWaitForElementToBeClickable(60, loc_imgProduct);
                    break;
                }
               }
                
                if(this.isSelectedProductHeaderIsDisplayed())
                    break;
                else
                    this.clickOnNextPage();
                    
           } while (true);
           
        
}




    public void clickOnNextPage(){
    	WrapperFunction.setImplicitWait(10);
    	WrapperFunction.scrollToViewElement(loc_btnNextPage);
    BaseTest.driver.findElement(loc_btnNextPage).isDisplayed();
    BaseTest.driver.findElement(loc_btnNextPage).click();
    System.out.println("Click on next page: Next page gets loaded");
    BaseTest.driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
   
}
    



public boolean isSelectedProductHeaderIsDisplayed(){
   boolean blnFlag=false;
   try {
	   WrapperFunction.setImplicitWait(3);
       blnFlag = BaseTest.driver.findElement(loc_hdrProductName).isDisplayed();
       return blnFlag;
   } catch (Exception exception) {
       return blnFlag;
   }
   
}
	
	
}
