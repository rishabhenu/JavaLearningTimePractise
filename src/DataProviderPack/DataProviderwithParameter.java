package DataProviderPack;

import java.lang.reflect.Method;

import org.testng.annotations.DataProvider;

public class DataProviderwithParameter {

	@DataProvider(name="provide data by passing parameter to method")
	public Object[][] getInput(Method m){
	if(m.getName().equalsIgnoreCase("sumInputfromParameter")) {
		return new Object[][]
				{
			{11,10}
				};
	}
	else
	{
		return new Object[][]
				{
			{15,35}
				};
	}
	}
}
	
	
	
