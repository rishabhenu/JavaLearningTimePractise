package Java67;

public class BinarySearch {
	
	static final int arr[]= {0,1,5,100,2,3,4};
	public static void main(String args[])
	{
		
		int key=100;	System.out.println(searchkey(key));
		
		if(searchkey(key)==key)
		{
			System.out.println(key+" is found in the array");
		}
		else
			System.out.println(key+" is not found");
		
		int sortedarray[]=sortArray(arr);
		
		for(int i:sortedarray)
		{
			System.out.println(i);
		}
	}
	
	public static int searchkey(int key)
	{
		
		int low=0,high=arr.length-1;
		
		int sortedarray[]=sortArray(arr);	
		
		int b=0;
		A:for(int i=0;i<high;i++)
		{
			int middle=(low+high)/2;
			
			if(sortedarray[middle]==key) 
			{
				b=key;
				break A;
			}
			
			else if(sortedarray[middle]<key)
			{
				low=middle+1;
			}
			
			else if(sortedarray[middle]>key)
			{
				high=middle-1;
			}

		}
		
		return b;
	}
	

	public static int[] sortArray(int a[])
	{
		int temp=0;
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
		}
		return a;
	}

}
