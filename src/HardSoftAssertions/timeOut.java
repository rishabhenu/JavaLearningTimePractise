package HardSoftAssertions;

import org.testng.annotations.Test;

public class timeOut {

	
	@Test
	void timeOutTest1() throws InterruptedException {
		Thread.sleep(18000);
		System.out.println("i am timeOutTest1");
	}
	
	@Test(timeOut=1000)
	void timeOutTest2() {
		System.out.println("i am timeOuttest2");
	}
}

