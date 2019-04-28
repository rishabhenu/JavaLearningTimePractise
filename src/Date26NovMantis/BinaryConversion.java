package Date26NovMantis;

public class BinaryConversion {
	
	
	public static void main(String args[]) {
	
		for(int i=1;i<12;i++) {
			System.out.println(convert(i));
		}
	
	}
	public static String convert(int q) { 	
	String s="";
	int r=0;
	
	while(q>0)
	{
		r=q%2;
		q=q/2;
		s=r+s;
	}
	return s;
	}
}
