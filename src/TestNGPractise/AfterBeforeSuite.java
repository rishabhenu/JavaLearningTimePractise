package TestNGPractise;
import org.testng.annotations.*;
//import org.testng.annotations.BeforeSuite;
public class AfterBeforeSuite {
	
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("this is before suite method");
		}

	@AfterSuite
	public void afterSuite() {
		System.out.println("this is after suite method");
	}
	
//	@Test
//	void temptest() {
//		System.out.println("i am afterbefore suite class method");
//	}
}
