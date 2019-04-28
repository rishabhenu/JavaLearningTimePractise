package Multithreading;

public class threadPool extends Thread implements Runnable{
	static int a;
	public void run() {
		for(int i=1;i<=5;i++) {
		
			System.out.println("thread name is "+Thread.currentThread().getName());
			
		try {
		Thread.sleep(2000);}
				catch(Exception e) {System.out.println(e.getMessage());}
	}
	}
	
	public static void main(String args[]) throws InterruptedException {
		
		threadPool thread1=new threadPool();
		threadPool thread2=new threadPool();

		thread1.setName("T1");
		thread2.setName("T2");
		//ExecutorService threadpool= Executors.newFixedThreadPool(5‰);
		
		thread1.start();
		thread2.start();
		
		Thread.sleep(2000);
		
//		thread1.notify();
	}
}
