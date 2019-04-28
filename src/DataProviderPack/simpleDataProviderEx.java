package DataProviderPack;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class simpleDataProviderEx {

	
	@Test(dataProvider="input to test sum of two")
	void TestSum(int a,int b) {
		System.out.println("sum of two no is "+(a+b));
	}
	
	@Test(dataProvider="input to test sum of three")
	void TestSumofThree(int a,int b,int c) {
		System.out.println("sum of three no's is "+(a+b+c));
	}
	
	@DataProvider(name = "input to test sum of two")
	public Object[][] inputforSum(){
		return new Object[][]
				{
			{22,23},
			{12,13},
			{34,6}
				};
	}
	
	@DataProvider(name="input to test sum of three")
	Object[][] inputforsumofThree(){
		return new Object[][]
				{
			{12,13,34}
				
	};
	}
}
