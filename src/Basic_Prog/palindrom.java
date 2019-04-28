package Basic_Prog;

public class palindrom {
	
public static void main(String[] args) {

	int input=-1221221,value=input,revvalue=0,remainder;

	String result="";

	while(value!=0)
	
	{
		remainder=value%10;
	
		revvalue=revvalue*10+remainder;
	
		value/=10;
	
		result=(revvalue==input)?"is equal to entered value hence palindrom":"is not equal to entered value hence not palindrom";
	}
System.out.println(revvalue+" "+result);

}
}