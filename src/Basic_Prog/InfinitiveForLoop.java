package Basic_Prog;

public class InfinitiveForLoop {

	public static void main(String args[]) {
	
		int a1=0,a2=1;
	
		int number=110;

		for(;;) {
		
			if(a1>=number)break;
		
			int a3=a2+a1;
		
			System.out.print(a1+" ");
		
		a1=a2;a2=a3;
	
	}
}
}
