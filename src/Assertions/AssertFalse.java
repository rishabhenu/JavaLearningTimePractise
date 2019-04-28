package Assertions;

//import static org.testng.Assert.assertTrue;
import static org.testng.Assert.assertFalse;

import org.testng.annotations.Test;

public class AssertFalse {
	
	String nameFalse;
	
	@Test
	public void myAssertionTrue(){
	assertFalse(checkgreater(10,15));
	}
	
	@Test
	public void myAssertionTest() {
		assertFalse(checkgreater(5,10),"second no is smaller");
	}

	public boolean checkgreater(int x, int y) {
		boolean temp=(x>y)?true:false;
		return temp;
	}
}


