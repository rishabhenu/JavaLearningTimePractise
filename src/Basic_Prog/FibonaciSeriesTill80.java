package Basic_Prog;

public class FibonaciSeriesTill80 {

	public static void main(String[] args) {
		

		int n1=0, n2=1, n3;
		
		System.out.print(n1+" "+n2);
		neha:
		for(int i=0; i<80; i++)
		{
			n3=n1+n2;
			n1=n2;
			n2=n3;
			System.out.print(" "+n3);
			if(Math.abs(n3-80)<=20)
				break neha;
		}

	}

}
