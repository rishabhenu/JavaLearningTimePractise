package OverloadingOverriding;

public class FinalKeywordChild extends FinalKeyword {

	void display() {
		System.out.println("this is display method of child class");
	}
public static void main(String args[]) {
	new FinalKeyword().display();
	new FinalKeywordChild().method1();
	
	FinalKeyword s=new FinalKeywordChild();
	
	System.out.println(s instanceof FinalKeywordChild);
	
	s.display();
	
}
	
}
