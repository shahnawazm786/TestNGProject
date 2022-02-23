package test2;

import org.testng.annotations.*;
public class TestNGRunAlwaysExample {

	@Test(alwaysRun = true)
	public void Test_xy() {
		System.out.println("Run Always");
	}
	@Test(enabled = false)
	public void Test_xy1() {
		System.out.println("Not Run Always");
	}
	
}
