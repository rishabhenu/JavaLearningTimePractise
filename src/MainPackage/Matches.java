package MainPackage;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.LinkedList;
import java.util.List;

public class Matches {

	public int matchid,season;
	public String city;
	public String date;
	public String team1,team2,tosswinner,tossdecision,result,winner;
	
	public static List<Matches> listmatches=new LinkedList<>();
	
	static {addData();}
	
	static private Matches setData(String s)
	{
		Matches matches=new Matches();
		
		String o[]=s.split(",");
		
		matches.matchid=Integer.parseInt(o[0]);
		matches.season=Integer.parseInt(o[1]);
		matches.city=o[2];
		matches.date=o[3];
		matches.team1=o[4];
		matches.team2=o[5];
		matches.tosswinner=o[6];
		matches.tossdecision=o[7];
		matches.result=o[8];
		try
		{
			matches.winner=o[9];
		}catch(Exception e) {matches.winner=null;}
		
		
		return matches;
	}
	
	static private int addData()
	{
		int i=0;
		try
		{
			File file=new File("/Users/anoopsharma/eclipse-workspace/JVD201807/Resources/matches.csv");
			FileReader fr=new FileReader(file);
			BufferedReader br = new BufferedReader(fr);
			
			String line=br.readLine();
			
			line=br.readLine();
			
			while(line!=null)
			{
				try
				{
					listmatches.add(setData(line));
					line=br.readLine();
					i++;
				}catch(ArrayIndexOutOfBoundsException e) {System.out.println(e.getMessage()+"\n"+i);break;}
				
			}
		}catch(Exception e) {}
		return i;
	}
}
