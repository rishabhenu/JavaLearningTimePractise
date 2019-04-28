package PractiseSeleniumWebDriver;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class OpeningTestbook {

	public static void main(String...strings)
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.tutorialspoint.com/spring/spring_bean_definition.htm");
	}
}
