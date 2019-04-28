package Multithreading;

public class ThreadingExample extends Thread  {
	
	public void run()
	{
		for(int i=0;i<1000;i++)
		{
//			try {Thread.sleep(500);}catch(Exception e) {}
			System.out.println(i);
		}
	}
	
	public static void main(String args[]) throws InterruptedException
	{
		ThreadingExample t1=new ThreadingExample();
		ThreadingExample t2=new ThreadingExample();
		
		t1.start();
		t2.start();
	}
	
//	public void start()
//	{
//		new ThreadingExample().run();
//	}

}
