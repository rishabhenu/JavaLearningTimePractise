package OOPs;

public class constructor {
  int id; String name;
  
 static String statvar;
 
 constructor(String i){
	 statvar=i;
 }

  constructor(){}
  constructor(int a,String b){
	 this.id=a;
	 this.name=b;
  }

  void display() {
	  
	  System.out.println(id+" "+name);}
	

  public static void main(String args[])
  {
		
	  constructor c1=new constructor();
	  c1.display();
//		constructor obj=new constructor(12,"neha");
//		obj.display();
	  
	  
		
	}
}

