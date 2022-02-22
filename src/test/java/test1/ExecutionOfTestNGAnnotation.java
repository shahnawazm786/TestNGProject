package test1;

import org.testng.annotations.Test;
import org.testng.annotations.*;

public class ExecutionOfTestNGAnnotation {

	@BeforeSuite
	public  void BeforeSuite() {
		System.out.println("Before Suite Method");
	}
	@BeforeClass
	public static void BeforeClass() {
		System.out.println("Before Class");
	}
	
	@BeforeMethod
	public void BeforeMethod() {
		System.out.println("Before Test Method");
	}
	
	@Test
	public void TestMethod1() {
		System.out.println("Test - One");
	}
	@Test
	public void TestMethod2() {
		System.out.println("Test - Two");
	}
	
	@AfterMethod
	public void AfterMethod() {
		System.out.println("After the Test Method");
	}
	
	@AfterClass
	public void AfterClass() {
		System.out.println("After Class method");
	}
	@AfterSuite
	public void AfterSuite() {
		System.out.println("After Suite Method");
	}
	
}
