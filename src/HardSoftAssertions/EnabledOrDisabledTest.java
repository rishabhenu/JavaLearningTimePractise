package HardSoftAssertions;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class EnabledOrDisabledTest {
	
	@Test
	public void test1() {
		System.out.println("i am test1 and enabled");
	}
	
	@Test(enabled =false)
	public void test2() {
		System.out.println("i am test2 and enabled");
	}
	
	@BeforeMethod
	void beforeMethod() {
		System.out.println("i am before method annotation");
	}
}
