package OverloadingOverriding;

public class Overloading {

	int sum(int a,int b) 
	{
	return a+b;
	}

float sum(float a,float b)
	{
	return a+b;
	}

float sum(int a,float b) 
	{
	return a+b;
	}

float sum(float a,int b) 
	{
	return a+b;
	}

int sum(int a,int b,int c) {return a+b+c;}

public static void main(String args[]) {
	Overloading getvalue=new Overloading();
	
	int result=getvalue.sum(10, 20);
	
	float result1=getvalue.sum(10.12f, 15.9f);
	
	float result2=getvalue.sum(18.1f, 13);
	
	float result3=getvalue.sum(34, 12.9f);
	
	int resutl4=getvalue.sum(10, 12,15);
	
	System.out.println(result+" "+result1+" "+result2+" "+result3+" "+resutl4);
	
}
}
