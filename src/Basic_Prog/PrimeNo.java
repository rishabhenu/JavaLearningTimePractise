package Basic_Prog;

public class PrimeNo {
	
	public static void main(String[] args) {
		
		int no=9;
		
		
      boolean result=true;
			for(int p=2; p<no; p++) 
			{
			
			  if(no%p==0)
			 {
				result=false;
			 }
		
	}
			if(result)
				System.out.println("Prime");
			else
				System.out.println("Not prime");
			 
	}

}
