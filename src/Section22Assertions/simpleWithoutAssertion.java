package Section22Assertions;

import java.util.ResourceBundle;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class simpleWithoutAssertion {
	
	WebDriver driver;
	ResourceBundle rb=ResourceBundle.getBundle("ex");
	
	
	@Test(enabled=false)
	public void propertiestest() {
		
//		ResourceBundle rb=ResourceBundle.getBundle("webdriverelements.properties");
//		System.setProperty("webdriver.gecko.driver","/Users/anoopsharma/Downloads/geckodriver");
		
		driver=new ChromeDriver();
		
		driver.get("http://www.facebook.com");
		
		driver.findElement(By.name(rb.getString("fbemail"))).sendKeys("rishabhenu@gmail.com");
		
		Actions act=new Actions(driver);
		
		act.sendKeys(Keys.TAB).sendKeys("ravidutt").perform();
		act.sendKeys(Keys.RETURN).perform();
	}
	
	@Test(enabled=true)
	public void amazonpage() throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","/Users/anoopsharma/Downloads/geckodriver");
		driver=new ChromeDriver();
		driver.get("http://www.amazon.in");
		
		Actions act=new Actions(driver);
		
		act.moveToElement(driver.findElement(By.xpath(rb.getString("amzcategory")))).perform();
		act.moveToElement(driver.findElement(By.xpath(rb.getString("amzcategorymobile")))).perform();
		Thread.sleep(1000);
		driver.findElement(By.xpath(rb.getString("amzmonitors"))).click();
		Thread.sleep(5000);
		driver.quit();
	}

}
