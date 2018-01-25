import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

import junit.framework.Assert;

public class ActionsKeywords {

	static WebDriver driver;
	static String parent;
	

	public static void openbrowser() {
		System. setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");		
		driver = new ChromeDriver();		
		driver.manage().window().maximize();
		parent= driver.getWindowHandle();
	}
	
	
	public static void navigate(String data) {
		driver.navigate().to(data);
	}

	public static void click_df(String data) throws InterruptedException {
		driver.findElement(By.name("field-keywords")).clear();
		driver.findElement(By.name("field-keywords")).sendKeys(data);
		Thread.sleep(3000);
	}
	public static void click_df1(String data) throws InterruptedException {
		driver.findElement(By.name("field-keywords")).clear();
		driver.findElement(By.name("field-keywords")).sendKeys(data);
		Thread.sleep(3000);
	}
	
	public static void click_search() {
		//driver.findElement(By.xpath(".//*[@id='nav-search']/form/div[2]/div/input")).click();
		//System.out.println("Test complete by click");
		driver.findElement(By.className("nav-input")).sendKeys(Keys.RETURN);
	}
	public static void select_product1() {
		driver.findElement(By.xpath(".//*[@id='result_6']/div/div[2]/div/div/a/img")).click();
		System.out.println("Test complete by click");
	}
	
	public static void select_product2() {
		driver.findElement(By.xpath(".//*[@id='result_7']/div/div[2]/div/div/a/img")).click();
		System.out.println("Test complete by click");
	}
	public static void select_product3() throws InterruptedException {
		
		driver.findElement(By.xpath(".//*[@id='result_0']/div/div/div/div[2]/div[1]/div[1]/a/h2")).click();
		Thread.sleep(3000);
	}
	public static void swith_tab() {
			
		for(String window : driver.getWindowHandles())
		{
			driver.switchTo().window(window);
		}
		driver.findElement(By.xpath(".//*[@id='add-to-cart-button']")).isDisplayed();
		System.out.println("The add to cart button is enabled");
	}
	public static void clickAddTocart() throws InterruptedException {
		
		driver.findElement(By.xpath(".//*[@id='add-to-cart-button']")).isDisplayed();
		driver.findElement(By.xpath(".//*[@id='add-to-cart-button']")).click();
		Thread.sleep(3000);
	}
public static void closeBrowser() throws InterruptedException {
		
		driver.close();
		Thread.sleep(2000);
	}
public static void swithParent() {
	
	driver.switchTo().window(parent);
}

public static void validate() {
	
	String result=driver.findElement(By.id("hlb-ptc-btn-native")).getText();	
	System.out.println("Result value is :"+result);
	Assert.assertEquals(result, "Proceed to checkout (2 items)");
	System.out.println("Test passed");
}
	
}
