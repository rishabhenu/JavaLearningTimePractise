package FinalizeMethod;

import java.io.IOException;

public class Finalize{
	
	int length,width,height;
	int volume;
	
	public void finalize() throws Throwable
	{
		volume=length*width*height;
		System.out.println("finalize method: "+volume);
		
		System.out.println("code after exception");
	}
	
	void volume()
	{
		volume=length*width*height;
		System.out.println(volume);
		
		try {
			new Exception();
		}
		finally
		{
			System.out.println("finally method");
		}
		
		System.out.println("next statement ot finally");
	}
	
	public static void main(String args[]) throws Throwable
	{
		Finalize obj=new Finalize();
		
		obj.length=5;
		obj.width=2;
		obj.height=4;
		
		obj=null;
		System.gc();
		
		obj=new Finalize();
		
		System.out.println("resuming next code.....");
		
		obj.volume();
//		obj.finalize();
//		
//		System.out.println(obj.volume);
//		obj.finalize();
	}

}

