package PractiseSeleniumWebDriver;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class takeScrenshot {
	
	ChromeDriver driver;
//	FirefoxDriver driver;
	@Test()
	public void takeScreenshot() throws IOException {
//		System.setProperty("webdriver.gecko.driver","/Users/anoopsharma/Downloads/geckodriver");
//		driver=new FirefoxDriver();
		
		driver=new ChromeDriver();
		
		driver.get("https://www.google.com");
		
		driver.findElementByName("q").sendKeys("sara gurpal photos hd");
		
		Actions act=new Actions(driver);
		
		act.sendKeys(Keys.RETURN).perform();
		
		driver.findElementById("dimg_26").click();
		
//		driver.findElementByXPath("//img[@id='dimg_24']");
		
		File f=driver.getScreenshotAs(OutputType.FILE);
		
		File fout=new File("/Users/anoopsharma/eclipse-workspace/SeleniumWebDriverPractise/sara gurpal.png");
		
		FileUtils.copyFile(f, fout);
	}

}
