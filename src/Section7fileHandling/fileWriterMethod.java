package Section7fileHandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class fileWriterMethod {

	public static void main(String args[]) throws Exception {
		
		File f=new File("/Users/anoopsharma/Downloads/Rishu/Selenium practise.txt");
		FileWriter fw=new FileWriter(f);
		
		fw.write("hello this is fileWriter method.\nthis file is written in fileWriterMethod");
		fw.flush();
		fw.close();
		
	}
	
}
