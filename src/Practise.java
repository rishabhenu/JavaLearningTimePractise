import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Enumeration;
import java.util.LinkedList;
import java.util.List;
import java.util.Properties;
import java.util.PropertyResourceBundle;
import java.util.ResourceBundle;

import MainPackage.Deliveries;

public class Practise {
	
	public static void main(String args[]) throws Exception
	{
		
		File file=new File("/Users/anoopsharma/eclipse-workspace/JVD201807/Resources/deliveries.csv");
		
		FileReader fr=new FileReader(file);
		
		BufferedReader br=new BufferedReader(fr);
		int matchcount=0;
		List<String> list=new LinkedList<>();
		
		String line=br.readLine();
		line=br.readLine();
		int totalruns=0;
		
		while(line!=null)
		{
			list.add(line);
			line=br.readLine();
		
			try
			{
				for(int i=60;i<=117;i++)
				{if(i==Integer.parseInt(line.split(",")[0])&&line.split(",")[2].contains("Kolkata Knight Riders"))
				{
					totalruns+=Integer.parseInt(line.split(",")[15]);
					System.out.println(totalruns+" "+line);
				}}
			}catch(NullPointerException e) {}
			
			
//			if(line.split(",")[0].equals("60")&&
//					line.split(",")[2].contains("Royal"))
//			{
//				totalruns+=Integer.parseInt(line.split(",")[15]);
//				System.out.println(totalruns+" "+line);
//			}
			
		}
		System.out.println(matchcount+"working fine till now..............."+totalruns);
	}

}
