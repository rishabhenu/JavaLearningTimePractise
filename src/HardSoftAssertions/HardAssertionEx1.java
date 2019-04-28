package HardSoftAssertions;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class HardAssertionEx1 {
	boolean b=true;
	boolean c=(!b);
	@Test
public void test1() {
		try
		{
			assertTrue(b);
			System.out.println("no Exception occured and test1 is passed successfully");
		}
		
		catch(Throwable th)
		
		{
		System.out.println("i am catch statement bcs hard exception occured in test1");
		}
	}
	
	@Test(enabled=true)
	void test2() throws ArithmeticException {
		SoftAssert as=new SoftAssert();
		
		as.assertTrue(c);
		System.out.println(" soft assertion added so further code executed even if above code throw any exception");
		
	}
}
