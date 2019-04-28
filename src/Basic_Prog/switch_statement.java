package Basic_Prog;
import java.util.Scanner;

public class switch_statement {     //declare a class
	
	public int abs(int a) {   //generate own method
		return (a<0)?-a:a;
	}

	public static void main(String args[]) {
	
		//program to check whether entered no is even or odd using switch statement
	
		System.out.println("Enter any integer no to check whether it is even or odd");
	
		Scanner input=new Scanner(System.in);
	
		int no=input.nextInt();
	
		int temp=(no%2);
		
		int temp1= new switch_statement().abs(temp);
	
	switch(temp1) {
	
	case 0:
		System.out.println(no+" is even");
		break;
	
	case 1:
		System.out.println(no+" is odd");
		break;
	
	default:
		System.out.println("please enter a valid integer");
	}
}

}