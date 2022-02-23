package test2;
import org.testng.SkipException;
import org.testng.annotations.*;
public class TestNGPriorityAndTestEnableDisableExample {

	// Test Case - 1000
	// 950 Test Case - Passed in first run
	// 50 Test Case - Failed 
	// Second Time 
	// Not Run all the 1000 rather 50 TC
	
	@Test(enabled=false)
	public void method_x() {
		System.out.println("Method X");
	}
	@Test(enabled=false)
	public void method_a() {
		System.out.println("Method A");
	}
	@Test(enabled=false)
	public void method_z() {
		System.out.println("Method Z");
	}
	@Test(enabled=false)
	public void method_b() {
		System.out.println("Method B");
	}
	@Test(enabled=false)
	public void method_w() {
		System.out.println("Method W");
	}
	@Test(enabled=false)
	public void method_c() {
		System.out.println("Method C");
	}

	@Test
	public void method_xy() {
		throw new RuntimeException("Runtime Exception");
	}

	@Test
	public void method_xy1() {
		throw new SkipException("Skip Exception");
	}

	
}
