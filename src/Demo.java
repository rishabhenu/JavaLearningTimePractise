

class Demo {
	
	static public void main(String args[])
	{
	
		int n=5,temp;
//		int count=0;
//		for(int i=n;i>0;i--)
//		{
//			for(int j=n;j>0;j--)
//			{
//				for(int k=i;k>0;k--)
//				{
//					System.out.print(j);
//					count++;
//				}
//			}
//			System.out.print("&");
//		}
//		System.out.println("\n"+count);
				
		int count1=0;
		for(int i=n;i>0;i--)
		{
			temp=n;
			for(int j=1;j<=i*n;j++)
			{
				System.out.print(temp);
				count1++;
				if(j%i==0)temp--;
			}
			System.out.println();
		}
		System.out.println("\n"+count1);
	}
}
