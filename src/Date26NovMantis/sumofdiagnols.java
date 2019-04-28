package Date26NovMantis;

public class sumofdiagnols {
 static int a[][]= {{1,2,3,2},{4,5,6,3},{7,8,9,4},{3,5,7,9}};
 
	static int sum(int col) {
			int result=0;
			try {
			for(int i=col;i>=0;i--) {
				
				result+=a[i][col-i];
				
			}}
			catch(IndexOutOfBoundsException e)
			{
				for(int i=a.length-1;i>col-a.length;i--)
				{
					result+=a[i][col-i];
				}
			}
			return result;
			}
		
	public static void main(String args[])
	{
		int result=0;int temp=0;
		for(int i=0;i<(2*a.length-2);i++)
		{
			result=temp+sum(i);
		
			System.out.println("sum of column "+(i+1)+" is : "+result);
		}
	}
}