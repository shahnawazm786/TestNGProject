package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class BaseTest {

	protected static WebDriver driver;
	private final String url="https://www.phptravels.net/";
	@BeforeSuite
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "src/test/resources/Drivers/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		//driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		driver.get(url);		
	}
	@AfterSuite
	public void teardown() {
		//driver.quit();
	}
}
