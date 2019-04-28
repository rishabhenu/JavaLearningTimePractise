package PractiseSeleniumWebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class WorkingwithRadioButton {
	
	ChromeDriver driver=new ChromeDriver();
	
	@Test
	public void test1() {
		driver.get("http://www.facebook.com");
		driver.findElementByXPath("//input[@value='1']").click();
	}
	
	@Test
	public void test2() {
		
		Select dobday=new Select(driver.findElementById("day"));
		dobday.selectByIndex(3);
		
		Select dobmonth=new Select(driver.findElementById("month"));
		dobmonth.selectByValue("5");
		
		Select dobyear=new Select(driver.findElementById("year"));
		dobyear.selectByVisibleText("1996");
	}
}
