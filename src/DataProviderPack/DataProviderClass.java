package DataProviderPack;

import org.testng.annotations.DataProvider;

public class DataProviderClass {

	
	@DataProvider(name="input in data provider class")
	Object[][] methodtogiveInput(){
		return new Object[][]
				{
			{12,15}
				};
	}
}
