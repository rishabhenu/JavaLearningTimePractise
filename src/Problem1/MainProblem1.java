package Problem1;

import java.util.Hashtable;
import java.util.Map;
import MainPackage.Matches;

public class MainProblem1 {
	
	public static void main(String args[])
	{
		System.out.println("Year"+"   "+"Count"+"  "+"Team");
		
		MainProblem1 obj=new MainProblem1();
		
		obj.get(2017);
		
		obj.get(2016);
	}

	private void get(int season)
	{
		Map<String,Integer> map=new Hashtable<>();
		
		int count=0;
		
		for(int i=0;i<Matches.listmatches.size();i++)
		{
			if(Matches.listmatches.get(i).season==season &&
					Matches.listmatches.get(i).tossdecision.contains("field"))
			{
				if(!map.containsKey(Matches.listmatches.get(i).tosswinner))
				{
					map.put(Matches.listmatches.get(i).tosswinner, 0);
				}
				else
				{
					map.put(Matches.listmatches.get(i).tosswinner, 1+map.get(Matches.listmatches.get(i).tosswinner));
				}
			}
		}
		
		for(String s:map.keySet())
		{
			System.out.println(season+"     "+map.get(s)+"    "+s);
			count++;
			if(count==4)break;
		}
		
	}

}
