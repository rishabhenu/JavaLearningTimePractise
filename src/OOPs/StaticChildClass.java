package OOPs;

import java.io.File;
import java.io.ObjectInputStream;

public class StaticChildClass extends StaticParentClass{
	
	 public static void main(String args[]) {
		StaticChildClass obj=new StaticChildClass();
		
		obj.accessprivate();
		
		int i=1;
		i--;
		System.out.println(i);
		
		if( "Welcome".trim() == "Welcome".trim() )
			System.out.println("Equal");
			else
			System.out.println("Not Equal");
		
		int j=14^5;
		
		String s="rihsu"+null;
		
		System.out.println(s);
		
	}
}
