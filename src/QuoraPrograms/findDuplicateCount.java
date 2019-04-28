package QuoraPrograms;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.HashMap;

public class findDuplicateCount {

//	public int noOfDuplicate(String s)
//	{
//		
//		if(s.contains(" "))
//		{
//			String[] temp=s.split(" ");
//		}
//		else
//		{
//			String temp[]=s.split("");
//		}
//			
//			
//		
//		return 0;
//		
//	}

//	private int no(String[] s)
//	{
//		return 0;
//	}
	
	public static void main(String args[])
	{
		Map<String,Integer> strings = new HashMap<>();
		
		String temp="rishabh kumar sharma is son of ravi dutt. Neha sharma is "
				+ "daughter of ravi dutt sharma. neha and rishabh are siblings";
		
		List<String> splited=new ArrayList<>();

		
//				finding splitted list
		
		if(temp.contains(" ")) {
			String s[]=temp.replace(".", "").split(" ");
			for(String i:s)
			{
				splited.add(i);
			}
		}
		else
		{
			String s[]=temp.split("");
			for(String i:s)
			{
				splited.add(i);
			}
		}
		
//		---------------------------------------------------------
		
		
		int a=0;
		
		for(String i:splited)
		{
			strings.put(i,null);
		}		
		
		for(String s:strings.keySet())
		{
			for(String s1:splited)
			{
				if(s.compareToIgnoreCase(s1)==0)
				{
					a++;
				}
			}
			strings.put(s, a);
			a=0;
		}
		
		System.out.println(strings);
	}
}
