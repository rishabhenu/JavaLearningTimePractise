package OOPs.MultileverInheritance;

public class ClassA {

public void displayint(int i) {
	System.out.println(i);
}

	 int a,b,c;
	static float sqrt;

protected int sum(int i,int j,int k) {
		this.a=i; this.b=j;this.c=k;
		return i+j+k;}
   
   protected int sum(int i,int j) {
	   this.a=i;this.b=j;
	   return i+j;
   }

   protected int multiplication(int i,int j) {
	   a=i;b=j;
	   return i*j;
	   
   }

}
