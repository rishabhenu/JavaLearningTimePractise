package OOPs;

public class simple_class {
	
	int a=10;
	
	public int sum(int a,int b) {	//sum is method
		// System.out.println((a+b));
		return (a+b);
	}
	public void mul(int a,int b)	// mul is method
	{
		System.out.println((a*b));
	}
	
	public static void main(String[] args) {
		
		simple_class addition=new simple_class(); //create new object
		
		simple_class obj1=new simple_class();
		addition.sum(10, 20);
		
		addition.mul(2, 4);
		
		addition.a=50;
		
		
		obj1.a=40;
		
		System.out.println(addition.a+" "+obj1.a);
		
		simple_class obj2=new simple_class();
		
		System.out.println(obj2.a);
		
		int resutl=new simple_class().sum(10, 12);
	
		System.out.println("When calling sum method with class name: "+resutl);
		
	}

}
