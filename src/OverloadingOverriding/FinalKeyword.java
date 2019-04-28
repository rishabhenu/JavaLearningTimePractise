package OverloadingOverriding;

public class FinalKeyword {
final int id;

FinalKeyword()
	{
	id=40;}
void display() {
	System.out.println(id);
}

void display(int id) {
		System.out.println("Roll no is "+id);
	}
		

final void method1() {
	System.out.println("this is final method1");
}


public static void main(String args[]) {
	
	new FinalKeyword().display();
	int c = new FinalKeyword().id;
	new FinalKeyword().display(c);
	new FinalKeyword().display(12);
	
}

}