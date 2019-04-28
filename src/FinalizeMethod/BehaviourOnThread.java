package FinalizeMethod;

public class BehaviourOnThread {
	
	public void run()
	{
		System.out.println("run method called");
	}
	
	public static void main(String args[])
	{
		BehaviourOnThread obj=new BehaviourOnThread();
		BehaviourOnThread obj1=new BehaviourOnThread();
		Thread t=new Thread();
		t.start();
		t=null;
		obj=null;
		obj1=null;
		System.gc();
	}
	
	public void finalize()
	{
		System.out.println("finalize method");
	}
}
