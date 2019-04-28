package GuviWebsite;

public class FloydTriangle {
	
	public void floydtriangle(int count) {
		for(int i=1;i<=4;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(count+" ");count++;
			}
			System.out.println("");
		}
	}
	
	public void floydtriangle(Object o) {
		for(int i=1;i<=4;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(o+" ");
			}
			System.out.println("");
		}
	}
	
	public void floydtriangle(char o) {
		for(int i=1;i<=4;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(o+" ");
			}
			System.out.println("");
		}
	}
	
	public void floydtriangle() {
		int count=1;
		for(int i=1;i<=4;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(count+" ");count++;
			}
			System.out.println("");
		}
	}
	
	
	public static void main(String args[]) {
		
		FloydTriangle obj=new FloydTriangle();
		obj.floydtriangle();
	
}
}
