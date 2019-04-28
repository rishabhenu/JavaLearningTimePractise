package OOPs.MultileverInheritance;
public class ClassB extends ClassA{
	
public  void displayint(int i) {
		System.out.println(i);
	}
		
public static void main(String args[]) {
	
	ClassA obj=new ClassB();
	
	int sum3=obj.sum(12, 13,14);
	
	int sum2=obj.sum(12, 13);
	
	int mul1=obj.multiplication(3, 4);
	
	obj.displayint(sum3);
	obj.displayint(sum2);
	obj.displayint(mul1);

}
}
