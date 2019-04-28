package GeeksForGreeks.Amazon;

import java.util.List;
import java.util.LinkedList;
import java.util.Set;
import java.util.TreeSet;

public class returnPermutation {
	
	static returnPermutation obj=new returnPermutation();
	
	
	public String swap(String s,int a,int b)
	{
		char temp;
		char c[]=s.toCharArray();
		temp=c[a];
		c[a]=c[b];
		c[b]=temp;
		return String.valueOf(c);
	}
	
	public String[] permute(String s,int a)
	{
		List<String> set=new LinkedList<>();
		int b=s.length();
		if(a==b)
		{
			System.out.println(s);
//			set.add(s);
		}
			
		else
		{
			for(int i=a;i<b;i++)
			{
				s=obj.swap(s, a, i);
				permute(s,a+1);
				s=obj.swap(s, a, i);
			}
		}
		int c=set.size();
		String result[]=new String[c];
		
		for(int i=0;i<c;i++)
		{
			result[i]=set.get(i);
		}
		return result;
	}
	
	public static void main(String args[])
	{
		obj.permute("101", 0);
	}
	

}
