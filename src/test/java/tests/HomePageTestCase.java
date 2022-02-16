package tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class HomePageTestCase extends BaseTest {

	By anchorSignIn=By.linkText("Login");
	By email=By.xpath("//input[@name='email']");
	By pass=By.xpath("//input[@name='password']");
	By btnLogin=By.xpath("//button[@type='submit']");
	@Test
	public void signInTest() {
		driver.findElement(anchorSignIn).click();
		
	}
}
