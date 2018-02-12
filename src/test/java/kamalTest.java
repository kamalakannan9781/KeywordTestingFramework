/*import java.net.MalformedURLException;
import java.net.URL;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import junit.framework.Assert;


public class kamalTest {
	
	@Test
	public void myTest() throws MalformedURLException, InterruptedException
	{
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
		RemoteWebDriver driver=new RemoteWebDriver(new URL(url),caps);
		//System. setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");		
		//WebDriver driver = new ChromeDriver();		
		//driver.manage().window().maximize();
		//String parent= driver.getWindowHandle();
		driver.navigate().to("https://www.amazon.in");
		String parent= driver.getWindowHandle();
		driver.findElement(By.name("field-keywords")).sendKeys("iphone 6s");
		driver.findElement(By.className("nav-input")).sendKeys(Keys.RETURN);
		//driver.findElement(By.xpath(".//*[@id='nav-search']/form/div[2]/div/input")).sendKeys(Keys.RETURN);
		driver.findElement(By.xpath(".//*[@id='result_7']/div/div[2]/div/div/a/img")).click();
		//driver.findElement(By.xpath(".//*[@id='result_0']/div/div/div/div[2]/div[1]/div[1]/a/h2")).click();
		for(String window : driver.getWindowHandles())
		{
			driver.switchTo().window(window);
		}
		Thread.sleep(3000);
		driver.findElement(By.xpath(".//*[@id='add-to-cart-button']")).isDisplayed();
		driver.findElement(By.xpath(".//*[@id='add-to-cart-button']")).click();
		Thread.sleep(3000);
		driver.close();
		driver.switchTo().window(parent);
		System.out.println("finished");
		driver.findElement(By.name("field-keywords")).clear();
		driver.findElement(By.name("field-keywords")).sendKeys("iphone 7s");		
		//driver.findElement(By.xpath(".//*[@id='nav-search']/form/div[2]/div/input")).click();
		Thread.sleep(3000);
		driver.findElement(By.className("nav-input")).sendKeys(Keys.RETURN);		
		driver.findElement(By.xpath(".//*[@id='result_0']/div/div/div/div[2]/div[1]/div[1]/a/h2")).click();
		Thread.sleep(3000);
		for(String window : driver.getWindowHandles())
		{
			driver.switchTo().window(window);
		}
		driver.findElement(By.xpath(".//*[@id='add-to-cart-button']")).isDisplayed();
		driver.findElement(By.xpath(".//*[@id='add-to-cart-button']")).click();
		Thread.sleep(3000);
		String result=driver.findElement(By.id("hlb-ptc-btn-native")).getText();		
		Assert.assertEquals(result, "Proceed to checkout (2 items)");
		driver.quit();
		System.out.println("Test passed");
	}
	
	}


*/