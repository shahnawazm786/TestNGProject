package test3;
import org.testng.annotations.*;
public class TestNGDependsOnExample {

	@Test
	public void login() {
		System.out.println("Login");
	}
	
	@Test(dependsOnMethods = "login")
	public void email() {
		System.out.println("Email");
	}
	@Test(dependsOnMethods = "email")
	public void draft() {
	System.out.println("Draft");	
	}
}
