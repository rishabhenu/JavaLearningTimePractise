package DataProviderPack;

import org.testng.annotations.Test;

public class simpleSumTest {

	@Test(dataProvider="input in data provider class",dataProviderClass=DataProviderClass.class)
	void sum(int a, int b) {
	System.out.println("sum of two numbers is "+(a+b));
}
	
	
	@Test(dataProvider="provide data by passing parameter to method",dataProviderClass=DataProviderwithParameter.class)
	void sumInputfromParameter(int a, int b) {
		System.out.println("sum is "+(a+b));
	}
}
