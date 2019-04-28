package InterfaceAbstract;
import Basic_Prog.A;

import java.security.*;
public class Abstraction implements Interface {

	
	 public synchronized void sum() {
		System.out.println("sum method implemented");
		
	}

	
	public void multiply() {
		System.out.println("multiplication method implemented");
		
	}
	
	public static void main(String args[])
	{
		java.util.List list=new java.util.ArrayList<>();
		list.add(new A());
		
		System.out.println(list);
		A a=new A();
		Thread t=new Thread();
		
		new Thread().start();
		
		int f[]=new int[10];
		int f1[]=f;
		
		System.out.println(f1[0]);
		String s="go";
		Object o=(Object)s;
		
		double d=Math.random();
		System.out.println(d);
		
		
	}
	
	
	
	
	

}
