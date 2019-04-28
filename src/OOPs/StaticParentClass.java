package OOPs;

public class StaticParentClass {
	
	
	
	private void display() {
		System.out.println("this is private static method");
	}
	
	protected void accessprivate() {
		new StaticParentClass().display();
	}
	
	public static void main(String args[]) {
		new StaticParentClass().accessprivate();
		
		if("ewee".trim()=="ewee".trim())System.out.println("equal");
		else System.out.println("not equal");
	}
}