package OOPs;

public class constructor1 {
int id=10;String name,father_name;

constructor1(int id,String name,String father_name){
	this.id=id;
	this.name=name;
	this.father_name=father_name;}

constructor1(constructor1 s1){
	id=s1.id;
	name=s1.name;
	father_name=s1.father_name;
}

constructor1(){}

constructor1(int id){
	this.id=id;}
void display(){
		System.out.println(id+" "+name+" "+father_name);
	}
public static void main(String args[]) {

	constructor1 student1=new constructor1(11302074,"rishabh","ravi dutt sharma");

	constructor1 student2=new constructor1(student1);

	constructor1 student3=new constructor1();

	constructor1 student4=new constructor1(11302075);
	
	student1.display();
	{student1.id=11302072;
	student1.name="Parshant";
	student1.father_name="Mr. Rautela";}

	student1.display();

	student2.display();

	student3.name="ravjot kaur";
	student3.id=11302073;
	student3.father_name="Mr. Singh";
	
	student3.display();
	
	student4.father_name="Mr. Singh";
	
	student4.display();
}
}

