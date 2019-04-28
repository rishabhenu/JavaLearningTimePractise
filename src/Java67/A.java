package Java67;

public class A {
	static int arr[]={0,1,4,2,3,4,5,6,7,8,9};
	
	
	public static void main(String args[])
	{
		
		int key=10;
		
		if(searchkey(key)==key)System.out.println(true);
		else System.out.println(false);

		
		
//		int key=9;
//		
//		int low=0,high=arr.length-1;
//		
//		int sortedarray[]=sortArray(arr);	
//		
//		for(int i:sortedarray)
//		{
//			System.out.print(i+" ");
//		}
//		System.out.println();
//		boolean b=false;
//		
//		A:for(int i=0;i<=high;i++)
//		{
//			int middle=(low+high)/2;	System.out.print(" middle "+middle);
//			
//			if(sortedarray[middle]==key) 
//			{
//				b=true; System.out.println("\ngiven key is found at index "+middle);
//				break A;
//			}
//			
//			else if(sortedarray[middle]<key)
//			{
//				low=middle+1;		System.out.print(" low "+middle);
//			}
//			
//			else if(sortedarray[middle]>key)
//			{
//				high=middle-1;	System.out.print(" high "+middle);
//			}
//			
//			System.out.println(" i "+i);
//		}
	}
	
	public static int searchkey(int key)
	{
		
		int low=0,high=arr.length-1;
		
		int sortedarray[]=sortArray(arr);	
		
		int b=0;
		A:for(int i=0;i<=high;i++)
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
		
		return b;}

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
