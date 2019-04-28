package Trancxn;

public class HighestAndLowestInArray {

	public static void main(String args[])
	{
		HighestAndLowestInArray obj=new HighestAndLowestInArray();
		
		int a[]= {13,12,6,3,10,23};
		
		int highest=obj.highest(a);
		
		int lowest=obj.lowest(a);
		
		System.out.println("highest is "+highest+"\nlowest is "+lowest);
	}

	private int lowest(int[] a) {
		for(int i=0;i<a.length;i++)
		{
			if(a[0]>a[i])
			{
				a[0]=a[i];
			}
		}
		return a[0];
	}

	private int highest(int a[]) {
		// TODO Auto-generated method stub
		for(int i=0;i<a.length;i++)
		{
			if(a[0]<a[i])
			{
				a[0]=a[i];
			}
		}
		return a[0];
	}
}
