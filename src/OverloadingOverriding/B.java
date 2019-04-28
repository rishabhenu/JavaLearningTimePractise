package OverloadingOverriding;

public class B extends A{
	
	int i=15;
	
	
	public static void mainstatic()
	{
		System.out.println("child static");
	}
	
	@Override
	public void main()
	{
		System.out.println("child simple");
	}
	
	public void childdummy()
	{
		System.out.println("child dummy method called");
	}
	
	public static void main(String args[])
	{
		
		
		
		
	}
	
}
