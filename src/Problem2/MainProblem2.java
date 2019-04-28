package Problem2;
import java.util.LinkedList;
import java.util.List;

import MainPackage.Deliveries;
import MainPackage.Matches;

public class MainProblem2
{
	
	public static void main(String args[]) throws Exception
	{
//		System.out.println(Deliveries.listdeliveries.size());
		int count=0;
		
		for(int year:Years.year)
		{
			for(String team:Teams.team)
			{	
				List<Integer> matchidyear=MatchIdYear.matchidyear.get(year);
				int fours=0;int sixes=0;int total=0;
				
				for(int matchid : matchidyear)
				{
					Main:for(int i=0;i<Deliveries.listdeliveries.size();i++)
					{
						try
						{
							if(Deliveries.listdeliveries.get(i).matchid==matchid&&
									Deliveries.listdeliveries.get(i).battingteam.contains(team))
							{
								total+=Deliveries.listdeliveries.get(matchid-1).totalruns;
								if(Deliveries.listdeliveries.get(matchid-1).batsmanrun==4)fours++;
								else if(Deliveries.listdeliveries.get(matchid-1).batsmanrun==6)sixes++;
							}
						}catch(Exception e) {break Main;}
					}
				}
				System.out.println(year+" "+team+" "+fours+" "+sixes+" "+total);
			}
		}
	}
	
	private void get(int year)
	{
		
	}
}