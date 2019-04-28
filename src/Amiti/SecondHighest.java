package Amiti;

import java.util.*;
public class SecondHighest {
	
	public static void main(String[] args)
	{
		
		SecondHighest obj=new SecondHighest();
		
		int input[]= {-9,5,7,-2,4,-8};
		
		for(int i=1;i<=input.length;i++)
		{
			int result = obj.highest(input,i);
			
			System.out.print(result+" ");
		}
		System.out.println();
		obj.show(0);
	
		obj.sortArray(input);
		
		for(int i:input) {
			System.out.print(i+" ");
		}
	}
	
	private int highest(int a[],int b)
	{
		int temp=a[0],temp1=0,min=a[0];
		
		for(int i=0;i<b&&i<=a.length;i++)
		{
			if(i==0)
			{
				for(int j=0;j<a.length;j++)
				{
					if(temp<=a[j])
					{
						temp=a[j];
					}
					if(min>a[j])
					{
						min=a[j];
					}
				}
			}
			else if(i!=0)
			{
				temp1=min;
				for(int j=0;j<a.length;j++)
				{
					if(temp1<=a[j]&&a[j]<temp)
					{
						temp1=a[j];
					}
				}
				temp=temp1;
			}
		}
		return temp;
	}

	private void show(int a)
	{
		if(a<=10)
		{
			System.out.print(a+" ");
			show(++a);
		}
	}

	private void sortArray(int a[])
	{
		int temp[]=a.clone();
		Arrays.sort(temp);
		int largest=temp[0];
		int smallest=temp[0];
		for(int i=1;i<temp.length;i++)
		{
			largest=Integer.max(temp[i],largest);
			smallest=Integer.min(smallest, temp[i]);
		}
		System.out.println("\nlargest "+largest+" : smallest "+smallest);
	}

}
