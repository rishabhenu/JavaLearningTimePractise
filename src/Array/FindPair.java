package Array;

public class FindPair {
	int a[]= {2,3,0,1,6,4,-3,-4};
	
	public int[] asc(int[] a)
	{
		int temp;
		for(int i=0;i<a.length;i++)
		{
			for(int j=i;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
			System.out.print(a[i]+" ");
		}
		return a;
	}
	
	public static void main(String args[])
	{
		FindPair obj=new FindPair();
		
		int b[]=obj.asc(obj.a);
		int index=b.length-1;
		for(int i=0;i<b.length;i++)
		{
			if(b[i]>=0)
			{
				index=i;
				break;
			}
		}
		
		if(!(index==0))
		{
			
			System.out.println("\npair is "+b[index-1]+", "+b[index]);
		}
		else
			System.out.println("\npair is :"+b[index]+", "+b[index+1]);
	}

}
