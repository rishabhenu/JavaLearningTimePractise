package Assertions;

import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

//import org.testng.Assert.*;
public class AssertTrueExample {

	@Test
	public void myAssertionTrue(){
	assertTrue(checkgreater(10,5));
	}
	
	@Test
	public void myAssertionTest() {
		assertTrue(checkgreater(5,10),"second no is smaller");
	}

	public boolean checkgreater(int x, int y) {
		boolean temp=(x>y)?true:false;
		return temp;
	}
}

