package Section8AdvanceFeatureofTestNG;

import org.testng.annotations.Test;

public class GroupingExamples {

	@Test(groups= {"breakfast","nonveg"})
	public void test1() {
		System.out.println("i'm having eggs in breakfast");
	}
	
	@Test(groups= {"breakfast","veg"})
	public void test3() {
		System.out.println("i'm having bread in breakfast");
	}
	
	@Test(groups= {"lunch","nonveg"})
	public void test5() {
		System.out.println("i'm having chicken-biryani in lunch");
	}
	
	@Test(groups= {"lunch","veg"})
	public void test2() {
		System.out.println("i'm having veg biryani inj lunch");
	}
	
	@Test(groups= {"dinner","nonveg"})
	public void test4() {
		System.out.println("i'm having fish in dinner");
	}
	
	@Test(groups= {"dinner","veg"})
	public void test6() {
		System.out.println("i'm having cheese in dinner");
	}
	}

