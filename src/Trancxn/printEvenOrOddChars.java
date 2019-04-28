package Trancxn;

public class printEvenOrOddChars {
	
	public static void main(String args[])
	{
		
		byte b=1;
		printEvenOrOddChars obj=new printEvenOrOddChars();
		
		String s=obj.fun("TRACXN", b);
		
		System.out.println(s);
	}
	
	
	String fun(String s,byte j)
	{
		String result="";
		
		int index=0;
		if(j==1)index=1;
		
		for(int i=index;i<s.length();i+=2)
		{
			result+=s.charAt(i);
		}
		
		return result;
	}

}
