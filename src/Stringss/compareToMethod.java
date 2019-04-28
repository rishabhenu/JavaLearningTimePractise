package Stringss;

public class compareToMethod {

	public int comparestrings(String s1,String s2) {
		System.out.println(s1.compareTo(s2));
		return s1.compareTo(s2);
	}
	
	public static void main(String args[]) {
		compareToMethod obj=new compareToMethod();
		obj.comparestrings("Z", "Zrishu");		
	}
	
}
