package Section8AdvanceFeatureofTestNG;

//import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

public class DependencyExample {
	
	@Test
	void method1Independent() {
		
		System.out.println("this is independent method1");
		
	
	}
	
	@Test(dependsOnMethods= "method1Independent")
	void method2Independent() {
		
		System.out.println("this is independent method2 and depends upon method1Independent");
		
	}
	
	@Test(groups="Group1",dependsOnMethods="method2Independent")
	void method3Independent() {
		
		System.out.println("this is method3Independent belongs to Group1 and depends on method1Independent");
		
	}
	
	@Test(priority=0,dependsOnGroups="Group1")
	void method4Independent() {
		
		System.out.println("this method4 with higher priority and depends on group1");
		
	}
		
}
