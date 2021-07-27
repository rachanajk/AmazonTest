package com.generic;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {
	public static WebDriver driver=null;
	 
	public  static Properties objConfig ;
	 
	 
			 
    		public static void initializeWebBrowser()  {
    			 
    			if(driver==null){
            System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/src/main/resource/ExternalResource/chromedriver.exe");
    		driver=new ChromeDriver();
    		setDriver(driver);
    			}
    			 loadConfig();
     	        driver.get(objConfig.getProperty("AUT_URL"));
     	       
     	        
     	       
    			driver.manage().window().maximize();
    			// WrapperFunction.setPageLoadWait();
      	        
    			//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    			//return driver;
    		}
    
    		 
    	   
    	    //load config file
    	    public static  void loadConfig() {
    	          objConfig = new Properties();
    	        
    	            try {
    	    InputStream input= new FileInputStream(System.getProperty("user.dir")+"/src/test/resource/TestData/Config.properties");
    	                objConfig.load(input);
    	               
    	            } catch (IOException e) {
    	                System.out.println(e);
    	            }
    	  }
    		
    		
    		public static WebDriver getDriver() {
    			return driver;
    		}
		
      		public static void setDriver(WebDriver driver1) {
			 driver = driver1;
    		}

    		public static void tearDown(){
    			// WrapperFunction.setImplicitWait(4, driver);
    			driver.close();
    		}
 
    		
    
}
