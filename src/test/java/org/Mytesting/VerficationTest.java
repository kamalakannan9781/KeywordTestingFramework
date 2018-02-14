package org.Mytesting;

import java.io.IOException;
import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.rmi.UnexpectedException;

import org.openqa.selenium.By;
import org.openqa.selenium.InvalidElementStateException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.appium.java_client.ios.IOSDriver;

public class VerficationTest {
	
	BusinessLogic buslogic= new BusinessLogic();  
 
   private ThreadLocal<WebDriver> webDriver = new ThreadLocal<WebDriver>();     
   private ThreadLocal<String> sessionId = new ThreadLocal<String>();
   private ThreadLocal<IOSDriver> iosDriver = new ThreadLocal<IOSDriver>();
   
   @org.testng.annotations.Test(dataProvider = "hardCodedBrowsersFF")
   public void SaucefirefoxTest(String browser, String version, String os)
           throws InvalidElementStateException, IOException, InterruptedException {
	   buslogic.createDriver(browser, version, os);
	   WebDriver driver= buslogic.getWebDriver();      
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
   @org.testng.annotations.Test(dataProvider = "hardCodedBrowsersIE")
   public void SauceIETest(String browser, String version, String os)
           throws InvalidElementStateException, IOException, InterruptedException {
	   buslogic.createDriver(browser, version, os);
	   WebDriver driver= buslogic.getWebDriver();     
		BeanLogic.navigateImplement(driver);	    
	    BeanLogic.ClicknameImplement(); 
	    buslogic.entername("field-keywords", "iphone 6s",driver);
	    BeanLogic.ClickclassnameImplement();
	    buslogic.clickclassname("nav-input",driver);
	    BeanLogic.ClickxpathImplement();
	    buslogic.clickxpath(".//*[@id='result_0']/div/div[2]/div/div/a/img",driver);
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
	    
	
   @org.testng.annotations.Test(dataProvider = "hardCodedBrowserschrome")
   public void SauceChromeTest(String browser, String version, String os)
           throws InvalidElementStateException, IOException, InterruptedException {
	   buslogic.createDriver(browser, version, os);
	   WebDriver driver= buslogic.getWebDriver();     
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
   @org.testng.annotations.Test(dataProvider = "hardCodedBrowsersedge")
   public void SauceedgeTest(String browser, String version, String os)
           throws InvalidElementStateException, IOException, InterruptedException {
	   buslogic.createDriver(browser, version, os);
	   WebDriver driver= buslogic.getWebDriver();      
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
   @org.testng.annotations.Test(dataProvider = "hardCodedBrowserssafari")
   public void SaucesafariTest(String browser, String version, String os)
           throws InvalidElementStateException, IOException, InterruptedException {
	   buslogic.createDriver(browser, version, os);
	   WebDriver driver= buslogic.getWebDriver();      
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
   
   
  
	@DataProvider(name = "hardCodedBrowsersFF", parallel = true)
   public static Object[][] sauceBrowserDataProviderff(Method testMethod) {
       return new Object[][]{
       	new Object[]{"firefox", "58.0", "Windows 10"},
       	
          
       };
   }
	@DataProvider(name = "hardCodedBrowsersIE", parallel = true)
	   public static Object[][] sauceBrowserDataProviderIE(Method testMethod) {
	       return new Object[][]{	       	
	       	new Object[]{"internet explorer", "11.0", "Windows 10"},                
	       
	          
	       };
	   }
	@DataProvider(name = "hardCodedBrowserschrome", parallel = true)
	   public static Object[][] sauceBrowserDataProviderchrome(Method testMethod) {
	       return new Object[][]{	       	              
	        new Object[]{"chrome", "54.0", "OS X 10.10"},
	          
	       };
	   }
	@DataProvider(name = "hardCodedBrowsersedge", parallel = true)
	   public static Object[][] sauceBrowserDataProvideredge(Method testMethod) {
	       return new Object[][]{	       	              
	        new Object[]{"MicrosoftEdge", "16", "Windows 10"},
	          
	       };
	   }
	@DataProvider(name = "hardCodedBrowserssafari", parallel = true)
	   public static Object[][] sauceBrowserDataProvidersafari(Method testMethod) {
	       return new Object[][]{	       	              
	        new Object[]{"safari", "10.0", "OS X 10.11"},
	          
	       };
	   }
	
}
