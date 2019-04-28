package Section7fileHandling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutput;

public class Lecture69ReadfromTwoandWriteinThird {

	 String readData(String path,String name) throws IOException {
		
		File f=new File(path+"/"+name);
		FileReader fr=new FileReader(f);
		BufferedReader br=new BufferedReader(fr);
		
		String temp=br.readLine();int count=0;String output="";
		while(temp!=null)
		{
//			output[count]=temp;
//			System.out.println(count+"	"+temp);
			output+=temp+"\n";
//			System.out.println(output);
			temp=br.readLine();
			count++;
		}
		return output;
		}
	 
	 void clearData(String filepath,String filename) throws IOException {
		 
		 File f=new File(filepath+"/"+filename);
		 FileWriter fw=new FileWriter(f);
		 BufferedWriter bw=new BufferedWriter(fw);
		 
		 fw.write("");
		 bw.flush();
		 bw.close();
		 
	 }
	 
void writeData(String filepath,String filename,String data) throws IOException {
		 
		 File f=new File(filepath+"/"+filename);
		 FileWriter fw=new FileWriter(f,true);
		 BufferedWriter bw=new BufferedWriter(fw);
		 
		 bw.write(data);
		 bw.flush();
		 bw.close();
		 
	 }
	
	public static void main(String args[]) throws IOException {
		
		Lecture69ReadfromTwoandWriteinThird obj=new Lecture69ReadfromTwoandWriteinThird();
		
		String file1=(obj.readData("/Users/anoopsharma/Downloads/Rishu", "Selenium practise.txt"));
		
		System.out.println(file1);
		
		String file2=(obj.readData("/Users/anoopsharma/Downloads/Rishu", "Selenium practise copy.txt"));
		
		System.out.println(file2);
		
		obj.clearData("/Users/anoopsharma/Downloads/Rishu", "Selenium practise joint of two");
		
		obj.writeData("/Users/anoopsharma/Downloads/Rishu", "Selenium practise joint of two", file1);
		
		obj.writeData("/Users/anoopsharma/Downloads/Rishu", "Selenium practise joint of two", file2);
		
//		System.out.println("file1 is\n"+file1+"\n\n"+"file2 is\n"+file2);
		
		String finalfile=obj.readData("/Users/anoopsharma/Downloads/Rishu", "Selenium practise joint of two");
		
		System.out.println("\n\njoint file of both the above files is\n"+finalfile);
		
		//System.out.println(obj.readData("/Users/anoopsharma/Downloads/Rishu","Selenium practise.txt"));
	}
	}
