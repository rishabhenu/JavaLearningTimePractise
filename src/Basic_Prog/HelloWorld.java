package Basic_Prog;

public class HelloWorld {
public static void main(String args[]) {
	String new_line= System.getProperty("line.separator");
	String name="Rishabh Kumar Sharma";
	int age = 22;
	float btech=78.9f;
	System.out.print("Hello! My name is "+name+"."+new_line+"I am "+age+" years old."+new_line+"I have completed my B.Tech. from Punjabi University Patiala with "+btech+"% marks.");
	}
}