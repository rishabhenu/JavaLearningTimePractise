package SuperKeyword;

public class SuperKeywordChild extends SuperVariable{
	
	String name="this is child class's instance variable\n";
	
void ParentClass() {
	System.out.println("this is overridden method of parent class\n");
}
void print() {
	ParentClass();
	
	System.out.println(name);
	
	System.out.println(super.name);
	
	super.ParentClass();	/*invoking parent class method*/
	
	new SuperKeywordChild().ParentClass();
	
	new SuperVariable().ParentClass();  /*calling parent class method by creating it's object*/
	
}

public static void main(String args[]) {
	SuperKeywordChild result=new SuperKeywordChild();
	
	result.print();
	
	
	
}
}
