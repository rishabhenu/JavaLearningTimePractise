package A1SimplePrograms;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileHandling {
	
	
	public static void main(String args[]) throws IOException {
	File f=new File("/Users/anoopsharma/Downloads/Rishu/Lecture70.txt");
	FileReader fr=new FileReader(f);
	BufferedReader br=new BufferedReader(fr);
	String temp=br.readLine();
	String result="";
	while(temp!=null) {
		result+=temp+"\n";
		temp=br.readLine();
	}
	System.out.println(result);
	}
}
