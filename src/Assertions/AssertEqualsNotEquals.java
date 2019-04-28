package Assertions;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotEquals;

import org.testng.annotations.Test;

public class AssertEqualsNotEquals {
	
	AssertFalse obj=new AssertFalse();
	
	@Test
	void AssertEqualwithInteger() {
		assertEquals(10,10);
	}

	@Test
	void AssertEqualwithBoolean() {
		assertEquals((obj.checkgreater(15, 10)),true);
	}
	
	@Test
	void AssertEqualwithBooleanCondition() {
		assertEquals((obj.checkgreater(15, 10)),true,"condtion not sasisfied i.e. first no is less than second no");
	}
	
	@Test
	void AssertNotEqualsIntegerArgs() {
		assertNotEquals(15.2,10);
	}
	
	@Test
	void AssertNotEqualsMethodArgs() {
		assertNotEquals((obj.checkgreater(15, 10)),false);
	}
	
	@Test
	void AssertNotEqualsArgsStatement() {
		assertNotEquals((obj.checkgreater(15, 10)),false,"first no is less than second helce result false ie not equal to true");
	}
}
