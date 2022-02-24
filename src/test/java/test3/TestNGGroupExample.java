package test3;

import org.testng.annotations.*;
public class TestNGGroupExample {

	@Test(groups= {"sanity"})
	public void test1() {
		System.out.println("Test1 is part of sanity");
	}
	
	@Test (groups= {"sanity"})
	public void test4() {
		System.out.println("Test1 is part of sanity");
	}
	
	@Test(groups={"regression","sanity"})
	public void test2() {
		System.out.println("Test2 is part of smoke test");
	}
	@Test(groups={"regression","sanity"})
	public void test3() {
		System.out.println("Test3 is part of Regression test");
	}
	
}
