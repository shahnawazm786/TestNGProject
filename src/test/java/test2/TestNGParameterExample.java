package test2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;



public class TestNGParameterExample {


@Test
@Parameters("para")
public void Test(@Optional("selenium")String value) {
	System.setProperty("webdriver.chrome.driver", "src/test/resources/Drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(50));
	driver.get("https://www.google.com");
	driver.manage().window().maximize();
	driver.findElement(By.name("q")).sendKeys(value);
	driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
}
	
	
}
