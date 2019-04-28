package OOPs;

public class Sisub extends SingleInheritance {
	
	int a,b;
	
	void sos(int i,int j) {

		this.a=i;
		this.b=j;
		int k=i*i+j*j;
		System.out.println("sum of product is "+k);
	}
	public static void main(String args[]) {
		
		Sisub obj1=new Sisub();
		
		obj1.display();
		
		obj1.sos(2, 3);
		
		SingleInheritance obj2=new SingleInheritance();
		
		obj2.display();
		
		
	}
}
