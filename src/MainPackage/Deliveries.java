package MainPackage;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Deliveries {
	
	public int matchid,inning;
	public String battingteam,bowlingteam;
	public int over,ball;
	public String batsman,bowler;
	public int wideruns,byeruns,legbyeruns,noballruns,penaltyruns,batsmanrun,extraruns,totalruns;

	public static List<Deliveries> listdeliveries = new ArrayList<>();
	
	static{addData();}
	
	public static void main(String args[])
	{
		for(int i=0;;i++)
		{
			try
			{
				if(Deliveries.listdeliveries.get(i).matchid==60&&
						Deliveries.listdeliveries.get(i).battingteam.equals("Royal Challengers Bangalore"))
				{
					System.out.println(Deliveries.listdeliveries.get(i).batsmanrun);
				}
			}catch(Exception e) {break;}
		}
	}
	
	static private Deliveries setData(String s)
	{
		Deliveries deliveries=new Deliveries();
		String o[]=s.split(",");
		try 
		{
			deliveries.matchid=Integer.parseInt(o[0]);
			deliveries.inning=Integer.parseInt(o[1]);
			deliveries.battingteam=o[2];
			deliveries.bowlingteam=o[3];
			deliveries.over=Integer.parseInt(o[4]);
			deliveries.ball=Integer.parseInt(o[5]);
			deliveries.batsman=o[6];
			deliveries.bowler=o[7];
			deliveries.wideruns=Integer.parseInt(o[8]);
			deliveries.byeruns=Integer.parseInt(o[9]);
			deliveries.legbyeruns=Integer.parseInt(o[10]);
			deliveries.noballruns=Integer.parseInt(o[11]);
			deliveries.penaltyruns=Integer.parseInt(o[12]);
			deliveries.batsmanrun=Integer.parseInt(o[13]);
			deliveries.extraruns=Integer.parseInt(o[14]);
			deliveries.totalruns=Integer.parseInt(o[15]);
		}
		catch(Exception e) {e.getMessage();}
		
		return deliveries;
	}
	
	static private void addData()
	{
		try
		{
			File file=new File("/Users/anoopsharma/eclipse-workspace/JVD201807/Resources/deliveries.csv");
			FileReader fr=new FileReader(file);
			BufferedReader br = new BufferedReader(fr);
			
			String line=br.readLine();
			line=br.readLine();
			
			while(line!=null)
			{
				listdeliveries.add(setData(line));
				line=br.readLine();
			}
		}catch(Exception e) {}	
	}
}