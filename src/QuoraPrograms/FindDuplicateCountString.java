package QuoraPrograms;

import java.util.HashMap;
import java.util.Map;

public class FindDuplicateCountString {
	
	public static void main(String args[])
	{
		String s="my name my is is name rishabh hi";
		
		String splited[]=s.split(" ");
		
		Map<String,Integer> map=new HashMap<>();
		
		for(String i:splited)
		{
			if(!map.containsKey(i))
			{
				map.put(i, 1);
			}
			else
				map.put(i, map.get(i)+1);
		}
	
		for(String i:splited)
		{
			if(map.get(i)==1)
			{
				System.out.println(i);
				break;
			}
			else
			{}
				
		}
	}
}
