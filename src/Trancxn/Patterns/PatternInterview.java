package Trancxn.Patterns;

import java.util.Scanner;

/**
 * 
 * @author Rishabh Sharma
 * 
 * @desc print a pattern like this 
 * 
 * 					  &   
    					&   &   
  				      &       &   
				    &           &   
  				      &       &   
    					&   &   
      					  &   
 *
 */

public class PatternInterview {

	static int n;
	static
	{
		System.out.println("please enter value of n");
		n=new Scanner(System.in).nextInt();
	}
	
	public static void main(String args[])
	{
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n-i;j++)
			{
				System.out.print("  ");
			}
			
			for(int j=1;j<=i;j++)
			{
				if(j==1||j==i)System.out.print("&   ");
				else System.out.print("    ");
			}
			System.out.println();
		}
		
		for(int i=1;i<n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("  ");
			}
			
			for(int j=1;j<=n-i;j++)
			{
				if(j==1||j==n-i)System.out.print("&   ");
				else System.out.print("    ");
			}
			System.out.println();
		}
	}
}
