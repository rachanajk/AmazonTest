package com.pagefactory;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.generic.BaseTest;


public class AmazonHomePage {
	
	public  void clickOnAmazonBasics(){
      By loc_lnk_SeeMore=By.xpath("//div[@class='a-cardui-footer']//a[@href='/s?k=amazonbasics']");		
	    By loc_lnk_AmazonBasics=By.xpath("//div[@id='gw-card-layout']//div[@data-ref_='pd_gw_unk']//div//div//h2[contains(text(),'AmazonBasics')]");
		 BaseTest.getDriver().findElement(loc_lnk_AmazonBasics).isDisplayed();
				WebElement seemore=BaseTest.getDriver().findElement(loc_lnk_SeeMore);
				seemore.click();
			}
			 
			
			
		
	}
	
	
		
	