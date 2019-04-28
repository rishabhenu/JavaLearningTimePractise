package GeeksForGreeks.Amazon;

public class Permutations {

	public String swap(String s,int a,int b)
	{
		char temp;
		char c[]=s.toCharArray();
		temp=c[a];
		c[a]=c[b];
		c[b]=temp;
		return String.valueOf(c);
	}
	
	public void permute(String s,int a)
	{
		int b=s.length();
		if(a!=b)
		{
			for(int i=a;i<b;i++)
			{
				s=swap(s, a, i);
				permute(s,a+1);
				s=swap(s, a, i);
			}
		}
		else
			System.out.println(s);
			
	}
	public static void main(String args[])
	{
		Permutations obj=new Permutations();
		obj.permute("rihu", 0);
	}
	
}