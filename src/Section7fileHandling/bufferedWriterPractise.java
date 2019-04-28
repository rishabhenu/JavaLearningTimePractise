package Section7fileHandling;

import java.io.*;

public class bufferedWriterPractise {
	
	public static void main(String[] args) throws IOException {
		
		File f=new File("/Users/anoopsharma/Downloads/Rishu/Selenium Practise.txt");
		
		FileWriter fw=new FileWriter(f,true);
		
		BufferedWriter br=new BufferedWriter(fw);
		
		br.newLine();
		
		br.write("now this data is written in the previous file using buffered writer method");
		
		br.flush();
		
		br.close();

	}

}
