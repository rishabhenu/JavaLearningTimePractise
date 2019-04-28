package Basic_Prog;
import java.util.Scanner;
public class looping {
public static void main(String args[]) {
	String new_line=System.getProperty("line.separator");
//for loop
	//enter specific no for following programs
	//1 :- program to print first five natural numbers
	//2 :- print following output
		//1
		//1 1
		//1 1 1 
		//1 1 1 1
	System.out.println("Enter a valid program no to execute program");
	Scanner no=new Scanner(System.in);
	
	int program=no.nextInt();
	
	switch(program) {
//program no 1
	case 1:System.out.println("Program to print first five natural no");
		for(int i=1;i<6;i++)
			System.out.println(i);
	break;

//program no 2
	case 2:System.out.println("Program to print following output "+new_line+"1"+new_line+"1 1"+new_line+"1 1 1"+new_line+"1 1 1 1");
		for(int i=1;i<=4;i++) {
			for(int j=1;j<=i;j++) { 
				System.out.print("1 ");}
			System.out.println("");}
	break;
	
	default:System.out.println("no any program exists for this no, please try some other program no");
	
	}}}
