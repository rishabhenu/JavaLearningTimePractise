package PractiseSeleniumWebDriver;

import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class WorkingWithKeyboard {

	ChromeDriver driver;
	
	
	
	@Test(priority=1)
	public void openbrowser() {
		driver=new ChromeDriver();
		driver.get("http://www.facebook.com");
	}
	
//	@Test(priority=2)
//	public void login() {
//		driver.findElementByName("email").sendKeys("rishabhenu@gmail.com");
//		driver.findElementByName("pass").sendKeys("ravidutt");
//		Actions act=new Actions(driver);
//		act.sendKeys(Keys.RETURN).perform();
//	}
	
	@Test(priority=3)
	public void usingtabkey() {
		Actions act=new Actions(driver);
		
		driver.findElementByName("email").sendKeys("rishabhenu@gmail.com");
		
		act.sendKeys(Keys.TAB).perform();
		act.sendKeys("ravidutt").perform();
		act.sendKeys(Keys.RETURN).perform();
		
		driver.findElementByLinkText("Log Out").click();
	}
}
