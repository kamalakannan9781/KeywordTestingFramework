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

public class VerficationTest {
	
	BusinessLogic buslogic= new BusinessLogic();  
 
   private ThreadLocal<WebDriver> webDriver = new ThreadLocal<WebDriver>();     
   private ThreadLocal<String> sessionId = new ThreadLocal<String>();
   
   @org.testng.annotations.Test(dataProvider = "hardCodedBrowsers1")
   public void verifyCommentInput1Test(String browser, String version, String os)
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
   @org.testng.annotations.Test(dataProvider = "hardCodedBrowsers2")
   public void verifyCommentInput2Test(String browser, String version, String os)
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
   @org.testng.annotations.Test(dataProvider = "hardCodedBrowsers3")
   public void verifyCommentInput3Test(String browser, String version, String os)
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
   @org.testng.annotations.Test(dataProvider = "hardCodedBrowsers4")
   public void verifyCommentInput4Test(String browser, String version, String os)
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
   @org.testng.annotations.Test(dataProvider = "hardCodedBrowsers5")
   public void verifyCommentInput5Test(String browser, String version, String os)
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
   
   
  
	@DataProvider(name = "hardCodedBrowsers1", parallel = true)
   public static Object[][] sauceBrowserDataProvider1(Method testMethod) {
       return new Object[][]{
       	new Object[]{"firefox", "49.0", "Windows 10"},
       	
          
       };
   }
	@DataProvider(name = "hardCodedBrowsers2", parallel = true)
	   public static Object[][] sauceBrowserDataProvider2(Method testMethod) {
	       return new Object[][]{	       	
	       	new Object[]{"internet explorer", "11.0", "Windows 7"},                
	       
	          
	       };
	   }
	@DataProvider(name = "hardCodedBrowsers3", parallel = true)
	   public static Object[][] sauceBrowserDataProvider3(Method testMethod) {
	       return new Object[][]{	       	              
	        new Object[]{"chrome", "54.0", "OS X 10.10"},
	          
	       };
	   }
	@DataProvider(name = "hardCodedBrowsers4", parallel = true)
	   public static Object[][] sauceBrowserDataProvider4(Method testMethod) {
	       return new Object[][]{	       	              
	        new Object[]{"MicrosoftEdge", "14.14393", "Windows 10"},
	          
	       };
	   }
	@DataProvider(name = "hardCodedBrowsers5", parallel = true)
	   public static Object[][] sauceBrowserDataProvider5(Method testMethod) {
	       return new Object[][]{	       	              
	        new Object[]{"safari", "10.0", "OS X 10.11"},
	          
	       };
	   }
	
}
