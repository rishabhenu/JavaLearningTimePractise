package A1SimplePrograms;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class WorkingWithWebDrivers{
	
	WebDriver driver;

	@Test
	public void passkeys() throws InterruptedException {
		driver=new ChromeDriver();
		driver.get("http://www.fb.com");
		Actions act=new Actions(driver);
		driver.findElement(By.id("email")).sendKeys("rishabhenu@gmail.com");
		act.sendKeys(Keys.TAB).perform();
		act.sendKeys("ljfdllsdfj").perform();
		act.sendKeys(Keys.RETURN).perform();
		act.moveToElement(driver.findElement(By.id("reg-link"))).perform();	
	}
}
