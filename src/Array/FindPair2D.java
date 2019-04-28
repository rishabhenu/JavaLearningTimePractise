package Array;

import java.util.List;
import java.util.LinkedList;

public class FindPair2D {
	
	public static void main(String args[])
	{
		int a[][]= {{1,2,3},{4,5,6},{7,8,9}};
		List<Integer> list=new LinkedList<>();
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				for(int k=0;k<a.length;k++)
				{
					for(int l=0;l<a.length;l++)
					{
						if((i==k&&j<l)||i<k)
						{
							int temp=a[i][j]+a[k][l];
							list.add(temp);

//							Increasing Order
//===========================================================================================
//							if(a[i][j]>a[k][l])
//							{
//								int temp1=a[i][j]; 
//								a[i][j]=a[k][l];
//								a[k][l]=temp1;
//							}
//===========================================================================================
							System.out.println(i+" "+j+"    "+k+" "+l);
						}
					}
				}
			}
		}
		System.out.println(list+"\n"+"actual size of list is: "+list.size());
		
		int temp=0;
		
		for(int i=0;i<a.length*a.length;i++)
		{
			temp+=i;
		}
		System.out.println("expected size of temp "+temp);
		
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}
}
