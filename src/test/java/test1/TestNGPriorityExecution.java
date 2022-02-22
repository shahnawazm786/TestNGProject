package test1;

import org.testng.annotations.*;

public class TestNGPriorityExecution {

	@Test(priority=1)
	public void A() {
		System.out.println("Method A");
	}
	
		
	@Test(priority=1)
	public void A1() {
		System.out.println("Method A1");
	}
	@Test(priority=1)
	public void A2() {
		System.out.println("Method A2");
	}
	@Test(priority=1)
	public void B() {
		System.out.println("Method B");
	}
	@Test(priority=1)
	public void C() {
		System.out.println("Method C");
	}
	@Test(priority=0)
	public void a() {
		System.out.println("Method a");
	}
	@Test(priority=-1)
	public void b() {
		System.out.println("Method b");
	}
	@Test(priority=1)
	public void AB() {
		System.out.println("Method AB");
	}
	@Test(priority=1)
	public void BA() {
		System.out.println("Method BA");
	}
}
