package tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class HomePageTestCase extends BaseTest {

	By anchorSignIn=By.linkText("Login");
	@Test
	public void signInTest() {
		driver.findElement(anchorSignIn).click();
		
	}
}
