package Section7fileHandling;
import java.io.*;

public class Lecture72WriteLinesWOErro extends Lecture71CheckErro {
	

	public static void main(String args[]) throws IOException {
		
		//Read:
		
		File f71=new File("/Users/anoopsharma/Downloads/Rishu/Lecture71.txt");
		
		FileReader fr71=new FileReader(f71);
		
		BufferedReader br71=new BufferedReader(fr71);
		
		String temp=br71.readLine();String result="",originalfile="";
		
		while(temp!=null) {
			
			
			
			if(temp.contains("erro")) {
				originalfile+=temp+"\n";
				temp=br71.readLine();
			}
			else
				{originalfile+=temp+"\n";result+=temp+"\n";temp=br71.readLine();}
		
		}
		
		System.out.println("original file is:\n"+originalfile);
		
		//Write:
		
		File f72=new File("/Users/anoopsharma/Downloads/Rishu/Lecture72.txt");
		
		FileWriter fw72=new FileWriter(f72);
		
		BufferedWriter bw=new BufferedWriter(fw72);
		
		bw.write(result);
		bw.flush();
		bw.close();
		
		System.out.println("\n\nfile written in Lecture72 file: \n"+result);
		
		//now read new file that is written
		
		FileReader fr72 =new FileReader(f72);
		
		BufferedReader br72=new BufferedReader(fr72);
		
		String finalresult=""; 
		
		String temp2=br72.readLine();
		
		while(temp2!=null) {
			
			finalresult+=temp2+"\n";
			
			temp2=br72.readLine();
		}
		
		System.out.println("\n\nfinally new file is:\n"+finalresult);
		
	}
	
}
