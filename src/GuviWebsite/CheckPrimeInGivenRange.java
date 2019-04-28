package GuviWebsite;
import java.util.*;

public class CheckPrimeInGivenRange {
	
	public void checkPrimeRange(int initial,int last) {
	
		int count=0;int no=0;
		List<Integer> primeno=new ArrayList<>();
		
		I:for(int i=initial;i<=last;i++) {
			J:for(int j=2;j<=i;j++) {
				
				if(i%j==0&&i!=j) {
					
					break J;
					
				}
				else if(i%j==0&&i==j)
					{
					primeno.add(i);
					no=i;
					System.out.println(no);
					break J;
					}
			}
		
		}
		System.out.println("\nprime no's b/w "+initial+" and "+last+" are: "+primeno);
		
	}
	
	public static void main(String args[]) {
		
		CheckPrimeInGivenRange obj=new CheckPrimeInGivenRange();
		
		obj.checkPrimeRange(3, 20);
		
		
	}

}
