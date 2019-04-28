package Problem2;

import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import MainPackage.Matches;

public class MatchIdYear {
	
	public static void main(String args[])
	{
		for(int year:Years.year)
		{
			System.out.println(matchidyear.get(year));
		}
	}
	
	static public Map<Integer,List<Integer>> matchidyear=new LinkedHashMap<>();

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
