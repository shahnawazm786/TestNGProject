package test4;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNGGroupsDefineExample_01 {
	@Test(groups= {"Demo"})
	public void test5() {
	Reporter.log("Test5");
		System.out.println("Test5");
	}
	@Test(groups= {"Demo"})
	public void test6() {
		Reporter.log("Test6");
		System.out.println("Test6");
	}
	
	@Test(groups= {"Demo1"})
	public void test7() {
		Reporter.log("Execution done of  Test7");
		System.out.println("Test7");
	}
	
	@Test(groups= {"Demo1"})
	public void test8() {
		Reporter.log("Execution done of Test8");
		System.out.println("Test8");
	}
	
}
