import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.LinkedList;
import java.util.List;

public class Teams {
	
	public static void main(String args[]) throws Exception
	{
		File file=new File("/Users/anoopsharma/eclipse-workspace/JVD201807/Resources/matches.csv");
		
		FileReader fr=new FileReader(file);
		
		BufferedReader br=new BufferedReader(fr);
		
		List<String> list=new LinkedList<>();
		
		String line=br.readLine();
		System.out.println(line);
		
		String team="";
		
		while(line!=null)
		{
			if(!team.contains(line.split(",")[5]))
			{	
				System.out.println(line.split(",")[5]);
				team+=line.split(",")[5];
			}
			
			line=br.readLine();
		}
	}

}
