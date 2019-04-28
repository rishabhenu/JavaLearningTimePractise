package Section7fileHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;


public class Lecture70PrintOddLines{
	
	
	public static void main(String args[]) throws IOException {
	
	File f=new File("/Users/anoopsharma/Downloads/Rishu/Lecture70.txt");
	
	FileReader fr=new FileReader(f);
	
	BufferedReader br=new BufferedReader(fr);
	
	String odd="";
	String temp=br.readLine();
	String even="";
	int count=0;
	while(temp!=null) {
	++count;
	if(count%2==1) {
		odd+=temp+"\n";
		temp=br.readLine();
	}
	else
	{
		even+=temp+"\n";
		temp=br.readLine();
	}
		
		
	}
System.out.println(odd);

System.out.println("\n"+even);
}
}
