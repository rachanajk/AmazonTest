package com.generic;
import java.util.concurrent.TimeUnit;

 

//import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
 
import org.openqa.selenium.support.ui.WebDriverWait;

import junit.framework.Assert;

//import com.google.common.util.concurrent.FluentFuture;

public class WrapperFunction {
		static WebDriverWait wait;
	 
	     Select select;
	     
	  public WrapperFunction() {
		// TODO Auto-generated constructor stub
	}

	
 	  
	 
	  public  void setThreadSleepWait(){
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			 
		  }
	  
	  public static void setImplicitWait(int intwait){
		  try {
			   
				BaseTest.getDriver().manage().timeouts().implicitlyWait(intwait, TimeUnit.SECONDS);
			
		} catch (Exception e) {
			// TODO: handle exception
		System.out.println("wail error");
		
		}
		 
		  
	  }
	  
	  public static void setPageLoadWait(WebDriver driver,int intTime){
		  driver.manage().timeouts().pageLoadTimeout(intTime, TimeUnit.SECONDS);
		  
		  
	  }
	  
	  public static void setExplicitWaitForvisibilityOfElementLocated(int intDriverWaitTime,By Locator,WebDriver driver){
		 try {
			 
			  wait=new WebDriverWait(driver,intDriverWaitTime);
			  wait.until(ExpectedConditions.visibilityOfElementLocated(Locator));
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		 
	  }
	  
	  
	  
	  public void setExplicitWaitForpresenceOfElementLocated(int intDriverWaitTime,By Locator,WebDriver driver){
		  try {
			  wait=new WebDriverWait(driver,intDriverWaitTime);
			  wait.until(ExpectedConditions.presenceOfElementLocated(Locator));
			  } catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		  
		 
	  }
	  
	  public static void setExplicitWaitForelementToBeClickable(int intDriverWaitTime,By Locator,WebDriver driver){
		
		  try {
			  wait=new WebDriverWait(driver,intDriverWaitTime);
			  wait.until(ExpectedConditions.elementToBeClickable(Locator));
			  } catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		  
		 
	  }
	  
	  
	  
	  public static void assertTrue(Boolean blnresult) {
		  Assert.assertTrue(blnresult); 
	  }
	  
	  public static void scrollToViewElement(By locator) {
          try {
              JavascriptExecutor scroll = (JavascriptExecutor)BaseTest.getDriver();
              WebElement Webelement = BaseTest.getDriver().findElement(locator);
              scroll.executeScript("arguments[0].scrollIntoView(true);",Webelement);
          }catch(Exception e) {
              e.printStackTrace();
          }}
	  
	  public static void setWaitForElementToBeClickable(int intWait,By locator) {
          try {
       WebDriverWait wait = new WebDriverWait(BaseTest.getDriver(),intWait);
       wait.until(ExpectedConditions.elementToBeClickable(locator)).click();
          }catch(Exception e) {
              e.printStackTrace();
          }}
	  
}
