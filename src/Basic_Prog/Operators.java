package Basic_Prog;

import java.util.Scanner;

public class Operators {

	public static void main(String args[]) {
		
		int a=11 , b=9, c=4,intage;
		
		double age;
		
		String result,eligibility;
		
		if((a<b)&&(a==10))
			
		System.out.println("the value of a is "+a);	
        
		else
		System.out.println("both the the conditions are not satisfied");
	    c-=1;	
	    System.out.println(c);
	    if(c==3)
	    {
	    	System.out.println("good");
	        c+=1;
	    }
	     if(c==4)
	    	System.out.println("bad");
	     
	    result= (a==11)?"True":"False";
	    System.out.println(result);
	    
	    System.out.println("Enter your name:");
	    String name;
	   
	    Scanner sc = new Scanner(System.in);
	   name=sc.nextLine(); 
	   
	   System.out.println("Entered name is:"+name);
	   
	   System.out.println("Enter your age:");
	   
	   Scanner maturity=new Scanner(System.in);
	   
	   age=maturity.nextDouble();
	   
	   intage=(int)age;
	   
	   if(intage>0) {	
		   
	   eligibility=(age>=18)?"Hello "+name+"! You are mature":"Hello "+name+"! You are not mature";
	   
	   System.out.println(eligibility);}
	else
		System.out.println("Enter valid age");
	}
}
