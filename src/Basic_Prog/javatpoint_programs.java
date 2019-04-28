package Basic_Prog;
import java.util.Scanner;
public class javatpoint_programs {
public static void main(String args[]) {
	String br=System.getProperty("line.separator");
System.out.print("Enter 1 for fibonacci series"+br+"Enter 2 to check any no for prime"+br+"Enter 3 to check whether no is palindrom");
Scanner programno= new Scanner(System.in);
int no=programno.nextInt();

switch(no) {
case 1: //fibonacci series
	System.out.println("Enter no of terms for fibonacci series");
	int terms=programno.nextInt();
	long a=0, b=1;
	for(int f=1;f<=terms;f++) {
		long c=a+b;
		System.out.print(a+" ");
		a=b;b=c;}
break;
		

case 2: //prime no
	System.out.println("Enter any no to check whether it is prime or not");
	int prime=programno.nextInt();
	boolean value=true;
	check:
		for(int p=2;p<prime;p++) 
		{
		
		 if(prime%p==0) 
		 {
		   value=false;
		   break check;
		 }
		}
	if(value)
		System.out.println("prime");
	else
		System.out.println("not prime");
break; 


case 3: //palindrom no
	System.out.println("Enter no to check for palindrom ");
	int i=0,revno=0,palno=programno.nextInt();
	String result;
	
break;
default:
System.out.println("you have not entered correct program no");	
}
}}

