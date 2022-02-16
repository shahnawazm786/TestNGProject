package tests;

import org.openqa.selenium.By;
import static org.testng.Assert.assertEquals;
import org.testng.annotations.Test;

public class HomePageTestCase extends BaseTest {

	By anchorSignIn=By.linkText("Login");
	By email=By.xpath("//input[@name='email']");
	By pass=By.xpath("//input[@name='password']");
	By btnLogin=By.xpath("//button[@type='submit']");
	@Test
	public void signInLink() {
		driver.findElement(anchorSignIn).click();
		assertEquals("Login - PHPTRAVELS",driver.getTitle());
		
	}
	public void loginTest() {
		driver.findElement(email).sendKeys("agent@phptravels.com");
		driver.findElement(pass).sendKeys("demoagent");
		driver.findElement(btnLogin).click();
		assertEquals("Actual", "expected");
		
	}
}
