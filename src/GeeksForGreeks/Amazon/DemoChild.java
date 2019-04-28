package GeeksForGreeks.Amazon;

import java.io.IOException;

public class DemoChild extends Demo{
	
	DemoChild() throws Throwable {
		
	}

	int i=0;
	
	public static void main(String args[]) throws Throwable
	{
		
		Demo obj=new Demo();
		Demo obj1=new Demo();
		
		DemoChild obj2=new DemoChild();
		
		
		
		
		System.out.println(obj.x+" "+obj.y);
		
		obj.sum(5, 2);  // x=7   y=9
		
		obj1.sum(obj.x, 2); //obj.x=7  therefore here obj1.x=9    obj1.y=11
		
		System.out.println(obj.x+" "+obj.y);
		
		System.out.println(obj1.x+" "+obj1.y);
		
		obj.i=0;
		
		obj.increment();
		obj1.increment();
		
		System.out.println(obj.i+" "+obj1.i);
		
		System.out.println(obj2.i+" "+obj1.i);

	}
}
