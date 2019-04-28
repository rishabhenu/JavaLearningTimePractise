package GuviWebsite;

public class Permutation {
	static public long factorial(int a)
	{
		long result=1;
		for(int i=a;i>0;i--)
		{
			result*=i;
		}
		return result;
	}
	
	static String swap(String s,int a,int b)
	{
		char c[]=s.toCharArray();
		char temp;
		temp=c[a];
		c[a]=c[b];
		c[b]=temp;
		
		return String.valueOf(c);
	}
	
	static public void permute(String s,int a)
	{
		
		int b=s.length();
		
		if(a==b)
			System.out.println(s);
		else
		{
			for(int i=a;i<b;i++)
			{
				s=swap(s,a,i);
				permute(s,a+1);
				s=swap(s,a,i);
					
			}
		}
		
	}
	
	public static void main(String args[])
	{
//		int a[]=new int[10];
//		int b[]= {1,2,3,4,5};
//		
//		System.out.println(a.length+" "+b.length);
//	
//		System.out.println(swap("rishu",1,3));
		
		permute("rih",0);
	}

}
