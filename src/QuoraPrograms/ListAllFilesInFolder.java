package QuoraPrograms;

import java.io.File;

public class ListAllFilesInFolder{
	
	public static void main(String args[])
	{
		File folder=new File("/Users/anoopsharma/Downloads/Rishu/finalresume.pdf");
		
		System.out.println(folder.isFile());
		
//		for(File filename:folder.listFiles())
//		{
//			System.out.println(filename.getName());
//		}
	
	}
}
