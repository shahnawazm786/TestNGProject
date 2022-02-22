package test1;

import org.testng.annotations.*;
public class TestNGOrderExample {

	@Test
	public void Test() {
		System.out.println("Test1");
	}
	@Test
	public void Test1() {
		System.out.println("Test2");
	}
}
