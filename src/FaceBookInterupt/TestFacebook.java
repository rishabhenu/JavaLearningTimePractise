package FaceBookInterupt;



import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import java.util.*;

public class TestFacebook extends Thread {
	TestFacebook(){};
	
	Set<String> set=new HashSet();
	
	String s="";
	
	static String password=null;
	ChromeDriver driver=new ChromeDriver();
	
	public static void main(String args[]) throws InterruptedException
	{
		String s="Yaar Jigree Kasooti Degree | Episode 12 - Attainment | Punjabi Web Series 2018 | Troll Punjabi";
		System.out.println(s.length());
		System.out.println(s.substring(0, 46));
	}	

	@Override
	public void run()
	{		
			driver.get("http://fb.com");
			
			driver.findElement(By.name("email")).sendKeys("rishabhenu@gmail.com");
			
			Actions action=new Actions(driver);
			
			action.sendKeys(Keys.TAB).sendKeys(s).sendKeys(Keys.RETURN).perform();
			
			driver.findElement(By.xpath("//a[text()='Log Out']")).click();
			
			driver.quit();
			
			System.out.println(s);
	}

	
	private void permutations(String s,int a)
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
				permutations(s,a+1);
				s=swap(s,a,i);
			}
		}			
	}
	
	String swap(String s,int a,int b)
	{
		char[] c=s.toCharArray();
		char temp=c[a];
		c[a]=c[b];
		c[b]=temp;
		
		return String.valueOf(c);
	}
	

}
