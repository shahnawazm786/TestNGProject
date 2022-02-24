package test3;
import org.testng.annotations.*;
public class TestNGDependsOnExample_01 {

	@Test
	public void login() {
		System.out.println("Login");
	}

	@Test (dependsOnMethods="login",priority=1)
	public void inbox() {
		System.out.println("Inbox");
	}

	@Test (dependsOnMethods="login",priority=2)
	public void draft()
	{
		System.out.println("Draft email");
	}
	
	@Test (dependsOnMethods="login",priority=2)
	public void bins() {
		System.out.println("bins");
	}

	@Test (dependsOnMethods="login",priority = 3)
	public void sentitem() {
		System.out.println("Sent item");
	}

	@Test (dependsOnMethods="login",priority=4)
	public void trash() {
		System.out.println("Trash");
	}
}
