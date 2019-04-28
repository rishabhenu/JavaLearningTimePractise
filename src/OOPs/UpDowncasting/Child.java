package OOPs.UpDowncasting;

public class Child  extends Parent {
	
	
	public void display1()
	{
		int A=10;
		int a=10;
		System.out.println(A);
		System.out.println("Child class display method");
	}
	
	
	public static void main(String[] args) {
		  
		Child p=new Child();
		p.display1();
		
		Child c= new Child();
		c.display();    

	}

}
