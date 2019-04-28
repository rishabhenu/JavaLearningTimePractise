package Section7fileHandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class bufferReader {
	
public static void main(String args[]) throws IOException {
		
		File f=new File("/Users/anoopsharma/Downloads/[FreeCoursesOnline.Us] Pluralsight - Java Path - java-fundamentals-core-platform/[FreeTutorials.Us].txt");
		
		FileReader fr=new FileReader(f);
		
		BufferedReader br= new BufferedReader(fr);
		
		String s=br.readLine();
		
		while(s!=null)
		{
			System.out.println(s);
			s=br.readLine();
		}
		
	}

}
