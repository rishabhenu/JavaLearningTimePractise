package OverloadingOverriding;

public class A {
	
	int i=10;
	public void dummy()
	{
		System.out.println("dummy method");
	}
	
	public static void mainstatic()
	{
		System.out.println("parent static");
	}
	
	public void main()
	{
		System.out.println("parent simple");
		
		System.out.println(this.i);
	}
	
	public static void main(String args[])
	{
		A obj=new A();
		int i;
		i=10;
		i=20;
		System.out.println(i);
	}
}
