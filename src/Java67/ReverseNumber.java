package Java67;

public class ReverseNumber {

	
	public static void main(String args[]) {
		
	int num=65656;
	
	int q=num,r;
	
	int result=0;
	
	while(q>0)
	{
		r=q%10;
		q/=10;
		
		
		result=result*10+r;
	}
	
	System.out.println(result);
}
}
