package Basic_Prog;

public class A extends Thread {

	int i=(int)Math.random();
	
	volatile static int d;
	
	static public double run(byte b,double y) {
		return (long)b/y*2;
		
	}

	public void run()
	{
		System.out.println(new A().i+11);
	}

	public static void main(String args[])
	{
		A a=new A();
		Thread t1=new Thread(new A());
		Thread t2=new Thread(a);
		t1.start();
		t2.start();
	}
}