package FinalizeMethod;

public class WorkingThread extends Thread{
	
	@Override
	public void run()
	{
		System.out.println("run method");
	}
	
	public static void main(String args[]) throws Throwable
	{
		Thread t=new WorkingThread();
		
		WorkingThread obj=new WorkingThread();
		
		t.start();
		
		t=null;
		obj=null;
		
		System.gc();
		
	}
	
	public void finalize()
	{
		System.out.println("finalize method");
		this.run();
	}
}
