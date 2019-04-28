package TestNGPractise;
//import org.testng.annotations.BeforeClass;
import org.testng.annotations.*;
//import org.testng.annotations.Test;
public class Test2BeforeClass extends AfterBeforeSuite{

@BeforeClass
public void beforeClassMethod() {
	
	System.out.println("this is before class method");

}

@AfterClass
public void testMethodAfterClass() {
	System.out.println("this is AfterClass annotation and executed after all the tests in the class");
}

@Test(priority=1)
public void testMethods() {
	System.out.println("this is normal test method no1 ");
}

@Test(priority=2)
public void testMethodBefore() {
	System.out.println("i am normal test method no 2");
}

@Test(priority=3)
public void testMethodafterclass() {
	System.out.println("i am normal test method no 3");
}

@BeforeMethod(enabled=false)
public void testBeforeMethod() {
	System.out.println("i am @BeforeMethod annotation");
}

@AfterMethod
public void testAfterMethod() {
	System.out.println("i am @AfterMethod annotation");
}

}
