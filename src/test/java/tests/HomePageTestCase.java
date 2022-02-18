package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.testng.annotations.Test;

public class HomePageTestCase extends BaseTest {

	By anchorSignIn=By.linkText("Login");
	By email=By.xpath("//input[@name='email']");
	By pass=By.xpath("//input[@name='password']");
	By btnLogin=By.xpath("//button[@type='submit']");
	By userDet=By.xpath("//h4//strong[text()='Demo']");
	By dash=By.xpath(" //a[text()=' Dashboard']");
	@Test(priority = 1)
	public void signInLink() {
		driver.findElement(anchorSignIn).click();
		assertEquals("Login - PHPTRAVELS",driver.getTitle());
		
	}
	@Test(priority = 2)
	public void loginTest() throws Exception {
		//Thread.sleep(2000);
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(email).sendKeys("agent@phptravels.com");
		driver.findElement(pass).sendKeys("demoagent");
		driver.findElement(btnLogin).click();
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		String userName=driver.findElement(userDet).getText();
		//System.out.println(userName);
		driver.findElement(dash).click();
		assertEquals("Demo", userName);
	}
}
