package GeeksForGreeks.Amazon;

import java.util.Scanner;

public class NearestPalindrom {
	

	
	public static void main(String args[])
	
	
	{
		NearestPalindrom obj=new NearestPalindrom();
		Scanner sc=new Scanner(System.in);
		int no=sc.nextInt();
		System.out.println("No whose nearest palindrome is to be findout\n " +no);
		int bigger=0,lower=0,temp=no;
		for(;;)
		{
			if(!obj.isPalindrom(no))
			{
				for(;;)
				{
					no++;
					if(obj.isPalindrom(no))
					{
						bigger=no;
						no=temp;
						break;
					}
				}
				for(;;)
				{
					no--;
					if(obj.isPalindrom(no))
					{
						lower=no;
						break;
					}
				}
				if(bigger-temp==temp-lower) System.out.println("both palindrom no's are at equal difference and they are "+lower+" and "+bigger);
				
				else
				{
					if(temp-lower<bigger-temp) 
						System.out.println("nearest palindrom is "+lower);
					else
						System.out.println("nearest palindrom is "+bigger);
				}
				break;
			}
			else
			{
				System.out.println("no itself is palindrom");
				break;
			}
		}
		
		
	}
	
	public int reverseInt(int a)
	{
		int temp=a,r,output=0;
		while(temp>0)
		{
			r=temp%10;
			temp/=10;
			output=output*10+r;
		}
		return output;
	}

	public boolean isPalindrom(int a)
	{
		int b=reverseInt(a);
		if(a==b)
			return true;
		return false;
	}
}
