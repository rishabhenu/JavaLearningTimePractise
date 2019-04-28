package Assertions;

import static org.testng.Assert.assertNotNull;
import static org.testng.Assert.assertNull;

import org.testng.annotations.Test;

public class AssertNullNotNull {
	
	String str="13",str1;
	
	@Test
	void AssertNull() {
		assertNull(str1);
	}
	
	@Test
	void AssertNotNull() {
		assertNotNull(str);
	}

}
