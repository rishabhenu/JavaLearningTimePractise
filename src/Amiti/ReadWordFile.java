package Amiti;

import java.io.*;
public class ReadWordFile {
	
	public static void main(String args[]) throws IOException
	{
		File file=new File("/Users/anoopsharma/Downloads/Rishu/Lecture70.txt");
		
		FileReader fr=new FileReader(file);
		
		BufferedReader br=new BufferedReader(fr);
		
		String line=br.readLine();
		
		String s="";
		int wordscount=0;
		while(line!=null)
		{
			String words[]=line.split(" ");
			wordscount+=words.length;
			s+=line+"\n";
			line=br.readLine();
		}			
		String s1=s.substring(0, s.length()/2);
		String s2=s.substring(s.length()/2);
		
		System.out.print(s1);
		System.out.print(s2);
		
		System.out.println(wordscount);
	}

}
