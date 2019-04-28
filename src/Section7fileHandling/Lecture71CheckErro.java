package Section7fileHandling;
import java.io.*;
public class Lecture71CheckErro {
	
	public static void main(String args[]) throws IOException {
		
		File f=new File("/Users/anoopsharma/Downloads/Rishu/Lecture71.txt");
		
		FileReader fr=new FileReader(f);
		
		BufferedReader br=new BufferedReader(fr);
		
		String temp=br.readLine();String result="",originalfile="";
		
		while(temp!=null) {
			
			
			
			if(temp.contains("erro")) {
				originalfile+=temp+"\n";
				temp=br.readLine();
			}
			else
				{originalfile+=temp+"\n";result+=temp+"\n";temp=br.readLine();}
		
		}
		System.out.println("original file is:\n"+originalfile+"\n\n");
		
		System.out.println("now file after removing those lines containing error:\n"+result);
	}

}
