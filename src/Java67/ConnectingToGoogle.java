package Java67;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ConnectingToGoogle {

	public static void main(String args[]) throws InterruptedException
	{
		ChromeDriver driver=new ChromeDriver();
		
		driver.navigate().to("http://www.youtube.com");
		Thread.sleep(1000);
		driver.findElement(By.name("search_query")).sendKeys("jatti thodi shy sohneya punjabi song");
		Actions act =new Actions(driver);
		act.moveToElement(driver.findElement(By.id("search-icon-legacy"))).perform();
		driver.findElement(By.id("search-icon-legacy")).click();
	}
}
