/*import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.Assert;


public class kamalTest {
	
	@Test
	public void testing() throws InterruptedException
	{
	
		
		System. setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");		
		WebDriver driver = new ChromeDriver();		
		driver.manage().window().maximize();
		String parent= driver.getWindowHandle();
		driver.navigate().to("https://www.amazon.in");
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
		System.out.println("Test passed");
		
	}

	
	}


*/