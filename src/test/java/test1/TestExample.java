package test1;

import org.testng.SkipException;
import org.testng.TestException;
import org.testng.annotations.Test;

public class TestExample {

	@Test
	public void Test01() {
		System.out.println("Test Passed");
	}
	
	@Test
	public void Test02() {
		//new Exception("Error");
		throw new RuntimeException("Test failed");
 
		
	}
	@Test
	public void Test03() {
		throw new SkipException("Test skip");
	}
	
}
