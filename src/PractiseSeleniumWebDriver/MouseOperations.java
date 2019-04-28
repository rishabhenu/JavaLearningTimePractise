package PractiseSeleniumWebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class MouseOperations {
	
	ChromeDriver driver;
	
	@Test
	public void mousepointer() throws InterruptedException {
		
		driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
//		driver.findElementByXPath("//span[text()='Category']").click();
		
		Actions act=new Actions(driver);
		
		act.moveToElement(driver.findElementByXPath("//span[text()='Category']")).perform();
		
		act.moveToElement(driver.findElementByXPath("//span[text()='Mobiles, Computers']")).perform();
		
		Thread.sleep(2000);
		
		act.moveToElement(driver.findElement(By.xpath("//span[text()='Monitors']"))).click().perform();
		
//		driver.findElementByXPath("//span[text()='Monitors']").click();
		
		act.sendKeys(Keys.RETURN);
		
		Thread.sleep(5000);
		driver.quit();
	}
}
