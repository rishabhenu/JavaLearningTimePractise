
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import MainPackage.Matches;
import Problem2.Years;

public class MatchIdYear {
	
	public static void main(String args[])
	{
		int year=2008;
		System.out.println(matchidyear.get(year));
	}
	
	static Map<Integer,List<Integer>> matchidyear=new LinkedHashMap<>();

	static
	{
		for(int year:Years.year)
		{
			List<Integer> matchid=new LinkedList<>();
			I:for(int i=0;;i++)
			{
				try
				{
					if(Matches.listmatches.get(i).season==year)
					{
						matchid.add(Matches.listmatches.get(i).matchid);
					}
				}catch(Exception e) {break I;}
			}
			matchidyear.put(year, matchid);
		}
	}
}
