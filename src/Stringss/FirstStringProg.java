package Stringss;

public class FirstStringProg {

	public static void main(String[] args) {
		
		String s1="neha";
		String s2="neha";
		
		String r1= new String("neha1");
		String r2=new String("neha1");
		
		System.out.println("equals method for literals:"+s1.equals(s2));
		
		System.out.println("equals method for new opperator:"+r1.equals(r2));

	
		

		System.out.println("CompareTo method for literals:"+s1.compareTo(s2));
		
		System.out.println("ComparesTo method for new opperator:"+r1.compareTo(r2));
	
	
	

	
	
	System.out.println("Hello == method for literals:"+s1==s2);
		
		System.out.println("Hello ==To method for new opperator:"+r1==r2);
	

	
	}

}
