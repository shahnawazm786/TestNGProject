package test4;

import org.testng.annotations.*;
public class TestNGGroupsDefineExample {

	@Test(groups= {"Demo"})
	public void test1() {
		System.out.println("Test1");
	}
	@Test(groups= {"Demo"})
	public void test2() {
		System.out.println("Test2");
	}
	
	@Test(groups= {"Demo1"})
	public void test3() {
		System.out.println("Test3");
	}
	
	@Test(groups= {"Demo1"})
	public void test4() {
		System.out.println("Test4");
	}
	
	
	
	
}
