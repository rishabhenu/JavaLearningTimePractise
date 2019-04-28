package Section8AdvanceFeatureofTestNG;

import org.testng.annotations.Test;

public class testNGPriority {

	@Test(priority = 0)
	void firstPriority() {
		System.out.println("method with first priority");
	}
	
	@Test(priority =2)
	void thirdPriority() {
		System.out.println("method with third priority");
	}
	
	@Test(priority=1,groups ="breakfast")
	void secondPriority() {
		System.out.println("method with second priority");
	}
	
}
