package test3;

import org.testng.annotations.Test;

public class TestNGGroupExample_01 {
	@Test(groups= {"sanity"})
	public void test5() {
		System.out.println("Test1 is part of sanity");
	}
	
	@Test (groups= {"sanity"})
	public void test6() {
		System.out.println("Test1 is part of sanity");
	}
	
}
