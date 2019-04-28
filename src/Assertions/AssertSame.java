package Assertions;

import static org.testng.Assert.assertNotSame;
import static org.testng.Assert.assertSame;

import org.testng.annotations.Test;

public class AssertSame {

	String obj="rishu";
	String obj1=null;
	String obj2=obj;
	
	
	@Test
	void AssertSameTest() {
		assertSame(obj,obj2);
	}
	
	@Test
	void AssertSameTest1() {
		assertSame(obj1,obj2);
	}
	
	@Test
	void AssertNotSameTest() {
	assertNotSame(obj,obj1);	
	}
}

