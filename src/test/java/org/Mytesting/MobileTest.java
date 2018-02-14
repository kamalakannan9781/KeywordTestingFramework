package org.Mytesting;

import java.io.IOException;
import java.lang.reflect.Method;

import org.openqa.selenium.InvalidElementStateException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;

import io.appium.java_client.ios.IOSDriver;

public class MobileTest {
	
	BusinessLogic buslogic= new BusinessLogic();  
	 
	   private ThreadLocal<WebDriver> webDriver = new ThreadLocal<WebDriver>();     
	   private ThreadLocal<String> sessionId = new ThreadLocal<String>();
	   private ThreadLocal<IOSDriver> iosDriver = new ThreadLocal<IOSDriver>();
	   
	   @org.testng.annotations.Test(dataProvider = "hardCodedBrowsers6")
	   public void verifyCommentInput6Test(String platformName,
	            String deviceName,
	            String platformVersion,
	            String appiumVersion,
	            String deviceOrientation,
	            String methodName)
	           throws InvalidElementStateException, IOException, InterruptedException {
		   buslogic.createDrivermobile(platformName, deviceName, platformVersion, appiumVersion, deviceOrientation, methodName);		   
		   IOSDriver driver= buslogic.getiosDriver();    
			BeanLogic.navigateImplement(driver);	    
		    BeanLogic.ClicknameImplement(); 
		    buslogic.entername("field-keywords", "iphone 6s",driver);
		    BeanLogic.ClickclassnameImplement();
		    buslogic.clickclassname("nav-input",driver);
		    BeanLogic.ClickxpathImplement();
		    buslogic.clickxpath(".//*[@id='result_7']/div/div[2]/div/div/a/img",driver);
		    BeanLogic.swithtabImplement();
		    buslogic.swithtab(driver);
		    BeanLogic.ClickxpathImplement();
		    buslogic.clickxpath(".//*[@id='add-to-cart-button']",driver);
		    BeanLogic.closebrowserImplement();
		    buslogic.closebrowser(driver);
		    BeanLogic.swithparentImplement();
		    buslogic.swithparent(driver);
		    BeanLogic.ClicknameImplement(); 
		    buslogic.entername("field-keywords", "iphone 7s",driver);
		    BeanLogic.ClickclassnameImplement();
		    buslogic.clickclassname("nav-input",driver);
		    BeanLogic.ClickxpathImplement();
		    buslogic.clickxpath(".//*[@id='result_0']/div/div/div/div[2]/div[1]/div[1]/a/h2",driver);
		    BeanLogic.swithtabImplement();
		    buslogic.swithtab(driver);
		    BeanLogic.ClickxpathImplement();
		    buslogic.clickxpath(".//*[@id='add-to-cart-button']",driver);
		    BeanLogic.verifyImplement(driver);
		    BeanLogic.quitbrowserImplement();
		    buslogic.quitbrowser(driver);
		    
		}
	   
	   @DataProvider(name = "hardCodedBrowsers6", parallel = true)
	   public static Object[][] sauceBrowserDataProvider5(Method testMethod) {
	       return new Object[][]{	       	              
	    	   new Object[]{"iOS", "iPhone 7 Simulator", "10.0", "1.6", "portrait"},
               new Object[]{"iOS", "iPad Air Simulator", "9.3", "1.6", "portrait"}  	  
	          
	       };
	   }

}
