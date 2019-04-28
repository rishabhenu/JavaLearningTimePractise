package Section11Keywords;

public class ThisKeyword {
	
	private int a=100;
	
	ThisKeyword(){}
	
	private void setData(int a) {
		this.a=a;
	}
	
	private int getData() {
		
		return a;
	}

	public static void main(String args[]) {
		
		ThisKeyword obj=new ThisKeyword();
		
		System.out.println(obj.a);
		
		obj.setData(3);
		System.out.println(obj.a);
		
		ThisKeyword obj1=new ThisKeyword();
		
		obj1.setData(50);
		
		System.out.println(obj1.getData());
	}
}
