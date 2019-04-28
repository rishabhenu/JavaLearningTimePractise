package GeeksForGreeks.Amazon;

import GuviWebsite.FloydTriangle;

public class Demo
{
	int x;
	int y;
	 int i;
	static int stat;
	
	Demo() throws Exception{}
	
	Demo(int a,int b)
	{
		this.x=a;
		this.y=b;
	}
	
	public void sum(int a,int b) throws Exception
	{
		this.x=a+b;
		this.y=x+b;
	}
	
	public void sum()
	{
		x=x+y;
		y=x+y;
	}
	
	public void increment()
	{
		i++;
	}
}
