/*package org.Mytesting;

import java.io.IOException;
import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.net.URL;
import java.rmi.UnexpectedException;
import java.util.UUID;

import org.json.JSONException;
import org.json.JSONObject;
import org.openqa.selenium.InvalidElementStateException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.jayway.restassured.RestAssured;
import com.jayway.restassured.response.Response;
import com.jayway.restassured.specification.RequestSpecification;
//import com.yourcompany.Pages.GuineaPigPage;

public class RunnerTest {
	BusinessLogic buslogic= new BusinessLogic();
	//static WebDriver driver;
	
	public String buildTag = System.getenv("BUILD_TAG");

    //public String username = System.getenv("SAUCE_USERNAME");
    public String username="nirupama2311";
    public String accesskey="caafbb62-eb15-41e5-90d6-aa4528fe61d9";
   // public String accesskey = System.getenv("SAUCE_ACCESS_KEY");

    *//**
     * ThreadLocal variable which contains the  {@link WebDriver} instance which is used to perform browser interactions with.
     *//*
    private ThreadLocal<WebDriver> webDriver = new ThreadLocal<WebDriver>();
    

    *//**
     * ThreadLocal variable which contains the Sauce Job Id.
     *//*
    private ThreadLocal<String> sessionId = new ThreadLocal<String>();
    
	
    @org.testng.annotations.Test(dataProvider = "hardCodedBrowsers")
    public void verifyCommentInputTest(String browser, String version, String os, Method method)
            throws MalformedURLException, InvalidElementStateException, UnexpectedException {
        this.createDriver(browser, version, os, method.getName());
        WebDriver driver = this.getWebDriver();
		BeanLogic.navigateImplement();	    
	    BeanLogic.ClicknameImplement(); 
	    buslogic.entername("field-keywords", "iphone 6s");
	    BeanLogic.ClickclassnameImplement();
	    buslogic.clickclassname("nav-input");
	    BeanLogic.ClickxpathImplement();
	    buslogic.clickxpath(".//*[@id='result_7']/div/div[2]/div/div/a/img");
	    BeanLogic.swithtabImplement();
	    buslogic.swithtab();
	    BeanLogic.ClickxpathImplement();
	    buslogic.clickxpath(".//*[@id='add-to-cart-button']");
	    BeanLogic.closebrowserImplement();
	    buslogic.closebrowser();
	    BeanLogic.swithparentImplement();
	    buslogic.swithparent();
	    BeanLogic.ClicknameImplement(); 
	    buslogic.entername("field-keywords", "iphone 7s");
	    BeanLogic.ClickclassnameImplement();
	    buslogic.clickclassname("nav-input");
	    BeanLogic.ClickxpathImplement();
	    buslogic.clickxpath(".//*[@id='result_0']/div/div/div/div[2]/div[1]/div[1]/a/h2");
	    BeanLogic.swithtabImplement();
	    buslogic.swithtab();
	    BeanLogic.ClickxpathImplement();
	    buslogic.clickxpath(".//*[@id='add-to-cart-button']");
	    BeanLogic.verifyImplement();
	    BeanLogic.quitbrowserImplement();
	    buslogic.quitbrowser();
	    
	}
	
	 
	public WebDriver getWebDriver() {
        return webDriver.get();
    }
	@DataProvider(name = "hardCodedBrowsers", parallel = true)
    public static Object[][] sauceBrowserDataProvider(Method testMethod) {
        return new Object[][]{
        	new Object[]{"firefox", "49.0", "Windows 10"},
            new Object[]{"internet explorer", "11.0", "Windows 7"},                
            new Object[]{"chrome", "54.0", "OS X 10.10"},
        };
    }
	@org.testng.annotations.Test(dataProvider = "hardCodedBrowsers")
    public void verifyCommentInputTest(String browser, String version, String os)
            throws InvalidElementStateException, IOException, InterruptedException {
		this.createDriver(browser, version, os);
		WebDriver driver=this.getWebDriver();
		//driver = this.getWebDriver();
       // this.createDriver(browser, version, os);
       // WebDriver driver = this.getWebDriver();
		//buslogic.getWebDriver();
		//BeanLogic.openbrowserImplement();		
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
        //String commentInputText = UUID.randomUUID().toString();

        //this.annotate("Visiting GuineaPig page...");
        //GuineaPigPage page = GuineaPigPage.visitPage(driver);

        //this.annotate(String.format("Submitting comment: \"%s\"", commentInputText));
        //page.submitComment(commentInputText);

       // this.annotate(String.format("Asserting submitted comment is: \"%s\"", commentInputText));
       // Assert.assertTrue(page.getSubmittedCommentText().contains(commentInputText));
    }
	@org.testng.annotations.Test(dataProvider = "hardCodedBrowsers")
    public void verifyCommentInput1Test(String browser, String version, String os)
            throws InvalidElementStateException, IOException, InterruptedException {
		this.createDriver(browser, version, os);
		WebDriver driver=this.getWebDriver();
		//driver = this.getWebDriver();
       // this.createDriver(browser, version, os);
       // WebDriver driver = this.getWebDriver();
		//buslogic.getWebDriver();
		//BeanLogic.openbrowserImplement();		
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
        //String commentInputText = UUID.randomUUID().toString();

        //this.annotate("Visiting GuineaPig page...");
        //GuineaPigPage page = GuineaPigPage.visitPage(driver);

        //this.annotate(String.format("Submitting comment: \"%s\"", commentInputText));
        //page.submitComment(commentInputText);

       // this.annotate(String.format("Asserting submitted comment is: \"%s\"", commentInputText));
       // Assert.assertTrue(page.getSubmittedCommentText().contains(commentInputText));
    }
	
	public void createDriver(String browser, String version, String os)
            throws MalformedURLException, UnexpectedException {
        DesiredCapabilities capabilities = new DesiredCapabilities();

        // set desired capabilities to launch appropriate browser on Sauce
        capabilities.setCapability(CapabilityType.BROWSER_NAME, browser);
        capabilities.setCapability(CapabilityType.VERSION, version);
        capabilities.setCapability(CapabilityType.PLATFORM, os);
       // capabilities.setCapability("name", methodName);

        if (buildTag != null) {
            capabilities.setCapability("build", buildTag);
        }
        
        
        //driver.s
       //driver=new RemoteWebDriver(new URL("https://" + username + ":" + accesskey + "@ondemand.saucelabs.com:443/wd/hub"),capabilities);

        // Launch remote browser and set it as the current thread
        webDriver.set(new RemoteWebDriver(
              new URL("https://" + username + ":" + accesskey + "@ondemand.saucelabs.com:443/wd/hub"),
                capabilities));

        // set current sessionId
        String id = ((RemoteWebDriver) getWebDriver()).getSessionId().toString();
        sessionId.set(id);
    }
	
	
}


*/