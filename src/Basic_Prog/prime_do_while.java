package Basic_Prog;
import java.util.Scanner;

import OOPs.simple_class;
public class prime_do_while
{
	public static void main(String[] args)
	{
		
		System.out.println("Enter value to check whether it is prime or not");
		
		Scanner input=new Scanner(System.in);
		
		int value=input.nextInt();
		
		for(int i=2;i<=value;i++) 
		
		{
				int remainder=value%i;
				System.out.print(i+" ");
				if(remainder==0&&i<value)
		
				{
				     System.out.println("");
				     System.out.println("not prime");
				     break;
				}
				
				else if(remainder==0&&i==value)
				
				{
					System.out.println("");
					System.out.println("prime");
				}	
			}
	}
}
