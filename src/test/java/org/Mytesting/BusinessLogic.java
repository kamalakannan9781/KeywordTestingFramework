package org.Mytesting;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.rmi.UnexpectedException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;



import io.appium.java_client.ios.IOSDriver;
import junit.framework.Assert;

public class BusinessLogic {
	//static WebDriver driver1;
	//static RemoteWebDriver driver;
	static String parent;
	
	public String message;
	public String verifydata;
	public String path;
	public String exepath;
	public String url;
	public String locator;
	public String product;
	//PropertiesUtility oPropertiesUtility= new PropertiesUtility();
	
	
	 public String buildTag = System.getenv("BUILD_TAG");

	    //public String username = System.getenv("SAUCE_USERNAME");
	 
	    
	  //  public String accesskey="e1888c22-59f5-42d9-8ae6-39e83bd2c15f";
	   // public String accesskey = System.getenv("SAUCE_ACCESS_KEY");

	    /**
	     * ThreadLocal variable which contains the  {@link WebDriver} instance which is used to perform browser interactions with.
	     */
	    private ThreadLocal<WebDriver> webDriver = new ThreadLocal<WebDriver>();
	    
	    private ThreadLocal<IOSDriver> iosDriver = new ThreadLocal<IOSDriver>();
	    /**
	     * ThreadLocal variable which contains the Sauce Job Id.
	     */
	    private ThreadLocal<String> sessionId = new ThreadLocal<String>();
	    
	    public WebDriver getWebDriver() {
	        return webDriver.get();
	    }

	    /**
	     *
	     * @return the Sauce Job id for the current thread
	     */
	    public String getSessionId() {
	        return sessionId.get();
	    }
	    
	    /**
	     * @return the {@link iosDriver} for the current thread
	     */
	    public IOSDriver getiosDriver() {
	        return iosDriver.get();
	    }
	   
	
	
	
	public void setLocator(String locator)
	{
		this.locator=locator;
	}
	public String showLocator()
	{
		System.out.println(locator);
		return locator;
	}
	public void setverifydata(String verifydata)
	{
		this.verifydata=verifydata;
	}
	public String showverifydata()
	{
		System.out.println(verifydata);
		return verifydata;
	}
	public void setproduct(String product)
	{
		this.product=product;
	}
	public String showProduct()
	{
		System.out.println(product);
		return product;
	}
	public void seturl(String url)
	{
		this.url=url;
	}
	public String showurl()
	{
		System.out.println(url);
		return url;
	}
	public void setMessage(String message)
	{
		this.message=message;
	}
	public void setpath(String path)
	{
		this.path=path;
	}
	public void setexepath(String exepath)
	{
		this.exepath=exepath;
	}
	public void show()
	{
		System.out.println(message);
	}
	public String showpath()
	{
		System.out.println(path);
		return path;
	}
	public String showexepath()
	{
		System.out.println(exepath);
		return exepath;
	}
	/*public static void openbrowser() throws MalformedURLException {
		String browser="chrome-win-saucelabs";
	    String url="https://kamalakannan2311:daac9220-cc28-48fd-97d4-062481cca7e0@ondemand.saucelabs.com:443/wd/hub";
		DesiredCapabilities caps = null;
		switch(browser.toLowerCase())
		{
		case "chrome-win-saucelabs":
			caps=DesiredCapabilities.chrome();	
			caps.setCapability("platform", "Windows 7");
			caps.setCapability("version", "52.0");			
		}		
		driver=new RemoteWebDriver(new URL(url),caps);
		System. setProperty(path, exepath);		
		driver = new ChromeDriver();		
		driver.manage().window().maximize();
		parent= driver.getWindowHandle();
	}*/
	public static void navigate(String url,WebDriver driver) {	
		
		driver.navigate().to(url);
		parent= driver.getWindowHandle();
		
	}
	public static void verifydata(String verifydata,WebDriver driver) {	
		driver.findElement(By.id("hlb-ptc-btn-native")).isEnabled();
		String result=driver.findElement(By.id("hlb-ptc-btn-native")).getText().trim();
		System.out.println("result value is :"+result);
		Assert.assertEquals(result, verifydata);
	}
	public static void verifydata1(String verifydata,WebDriver driver) {	
		driver.findElement(By.xpath(".//*[@id='hlb-subcart']/div[1]/span/span[1]")).isEnabled();
		String result=driver.findElement(By.id(".//*[@id='hlb-subcart']/div[1]/span/span[1]")).getText();
		System.out.println("result value is :"+result);
		Assert.assertEquals(result, verifydata);
	}
	
	public void entername(String locator,String product,WebDriver driver) throws InterruptedException {		
		driver.findElement(By.name(locator)).isDisplayed();
		driver.findElement(By.name(locator)).isEnabled();
		driver.findElement(By.name(locator)).clear();
		driver.findElement(By.name(locator)).sendKeys(product);
		Thread.sleep(3000);
	}
	public void clickclassname(String locator,WebDriver driver) throws InterruptedException {
		driver.findElement(By.className(locator)).isEnabled();
		driver.findElement(By.className(locator)).sendKeys(Keys.RETURN);
		Thread.sleep(1000);
	}
	public void clickxpath(String locator,WebDriver driver) throws InterruptedException {		
		driver.findElement(By.xpath(locator)).isDisplayed();
		driver.findElement(By.xpath(locator)).isEnabled();
		driver.findElement(By.xpath(locator)).click();
		Thread.sleep(1000);
	}
	public void swithtab(WebDriver driver) throws InterruptedException {
		for(String window : driver.getWindowHandles())
		{
			driver.switchTo().window(window);
		}
		Thread.sleep(1000);
	}
	public void closebrowser(WebDriver driver) throws InterruptedException {
		driver.close();
		Thread.sleep(1000);
	}
	public void quitbrowser(WebDriver driver) throws InterruptedException {
		driver.quit();
		Thread.sleep(1000);
	}
	public void swithparent(WebDriver driver) throws InterruptedException {
		driver.switchTo().window(parent);
		Thread.sleep(1000);
	}
	
	public void createDriver(String browser, String version, String os)
            throws IOException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        PropertiesUtility oPropertiesUtility= new PropertiesUtility();
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
              new URL("https://" + oPropertiesUtility.getUsername() + ":" + oPropertiesUtility.getAccesskey() + "@ondemand.saucelabs.com:443/wd/hub"),
                capabilities));

        // set current sessionId
        String id = ((RemoteWebDriver) getWebDriver()).getSessionId().toString();
        sessionId.set(id);
    }
	protected void createDrivermobile(
            String platformName,
            String deviceName,
            String platformVersion,
            String appiumVersion,
            String deviceOrientation,
            String methodName)
            throws MalformedURLException, UnexpectedException {
        DesiredCapabilities capabilities = new DesiredCapabilities();

        capabilities.setCapability("platformName", platformName);
        capabilities.setCapability("platformVersion", platformVersion);
        capabilities.setCapability("deviceName", deviceName);
        capabilities.setCapability("deviceOrientation", deviceOrientation);
        capabilities.setCapability("appiumVersion", appiumVersion);
        capabilities.setCapability("name", methodName);

        String app = "https://github.com/saucelabs-sample-test-frameworks/Java-Junit-Appium-iOS/blob/master/resources/SauceGuineaPig-sim-debug.app.zip?raw=true";

        capabilities.setCapability("app", app);

        if (buildTag != null) {
            capabilities.setCapability("build", buildTag);
        }

        // Launch remote browser and set it as the current thread
        
        
       // iosDriver.set(new IOSDriver(new URL("https://" + PropertiesUtility.getUsername() + ":" + PropertiesUtility.getAccesskey() + "@ondemand.saucelabs.com:443/wd/hub"),capabilities));
       // iosDriver.set(new IOSDriver(
      //          new URL("https://" + PropertiesUtility.getUsername() + ":" + PropertiesUtility.getAccesskey() + "@ondemand.saucelabs.com:443/wd/hub"),
      //            capabilities));

        String id = ((RemoteWebDriver) getiosDriver()).getSessionId().toString();
        sessionId.set(id);
    }

}
