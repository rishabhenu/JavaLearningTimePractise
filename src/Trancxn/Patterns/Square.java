package Trancxn.Patterns;

import java.util.Scanner;

public class Square {

	static int n;
	static
	{
		System.out.println("Enter value of n");
		n=new Scanner(System.in).nextInt();
	}
	
	public static void main(String args[])
	{
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(i==1||i==n)System.out.print("& ");
				else
				{
					if(j==1||j==n)System.out.print("& ");
					else System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
}
