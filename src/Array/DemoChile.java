package Array;

import java.io.IOException;

public class DemoChile extends DemoParent{
	
//	DemoChile() throws Exception
//	{
//		System.out.println("child class constructor");
//	}
	
	static String s;
	
	public static void main(String... args) throws Exception
	{
		
		DemoParent obj= new DemoChile();
		
		obj.method();
		
	}
	
	void method()
	{
		System.out.println("overriden");
	}
	
	int value(Object o)
	{
		return 0;
	}
}
