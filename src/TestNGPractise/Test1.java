package TestNGPractise;


import org.testng.annotations.*;
//import org.testng.annotations.BeforeClass;
//import org.testng.annotations.Test;

public class Test1 extends AfterBeforeSuite {

	@Test
public void MyTest1(){
		
		System.out.println("test1 performed");
		
	}
	
	@BeforeTest
	void beforeTest() {
		System.out.println("this is before test method");
	}

	@AfterTest
	void afterTest() {
		System.out.println("this is after test mehtod");
	}
	
	
}
