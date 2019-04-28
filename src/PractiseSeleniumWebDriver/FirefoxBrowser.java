package PractiseSeleniumWebDriver;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class FirefoxBrowser {

	WebDriver driver;

	@Test(priority=1)
	public void test1() throws Exception{
	System.setProperty("webdriver.gecko.driver", "/Users/anoopsharma/Downloads/geckodriver");
	driver = new FirefoxDriver();
	driver.navigate().to("http://www.shop.theTestingWorld.com");
	 
	}
	
	
	@Test(priority=2)
	public void test2() {
		driver.findElement(By.name("search")).sendKeys("iphone");
		driver.findElement(By.xpath("//div[@id='search']/span/button")).click();
	 }
	
	@Test(priority=3)
	public void test3() {
		driver.findElement(By.xpath("//span[text()='Add to Cart']/parent::button")).click();
	 }
	
	@Test(priority=4)
	public void checkout() throws InterruptedException {
		driver.findElement(By.xpath("//span[text()='Checkout']")).click();
	}
	
	@AfterSuite
	public void aftersuite() {
		
	}
}
