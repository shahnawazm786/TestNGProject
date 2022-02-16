package tests;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class BaseTest {

	protected static WebDriver driver;
	private final String url="https://www.phptravels.net/";
	private static WebDriverWait wait;
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
	static WebElement waitForElementClickable(WebDriver driver,By locator) {
		wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		return wait.until(ExpectedConditions.elementToBeClickable(locator));
		
	}
	static WebElement waitForElementClickable(WebDriver driver,By locator,long second) {
		wait=new WebDriverWait(driver, Duration.ofSeconds(second));
		return wait.until(ExpectedConditions.elementToBeClickable(locator));
		
	}
}
