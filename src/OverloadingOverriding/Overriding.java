package OverloadingOverriding;

public class Overriding extends Overloading {

	int sum(int  a) {
	return a+10;
	}

int x=0;
	public static void main(String args[]) {
		
		Overriding getvalue=new Overriding();
		
		Overriding obj1=new Overriding();
		
		float resutl1=getvalue.sum(11.123456f, obj1.x);
			
			int result2=getvalue.sum(2);
			System.out.println(resutl1+" "+result2);
	}

}
