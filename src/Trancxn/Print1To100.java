package Trancxn;

public class Print1To100 {

	public static void main(String args[])
	{
		for(int i=1;i<=100;i++)
		{
			String s=String.valueOf(i);
			if(i%3==0){s="Buzz";}
			if(i%5==0) {s="Fizz";}
			if(i%15==0) {s="BuzzFizz";}
			
			System.out.println(i+" "+s);
		}
		
	}
}
