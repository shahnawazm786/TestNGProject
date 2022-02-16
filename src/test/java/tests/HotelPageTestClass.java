package tests;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class HotelPageTestClass extends BaseTest {

	By searchHotel=By.xpath("//span[text()=' Search by City']");
	By inputCity=By.xpath("//input[@class='select2-search__field']");
	By selCity=By.tagName("li");
	@Test
	public void searchHotel() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(searchHotel).click();
		driver.findElement(inputCity).sendKeys("Del");
		//Thread.sleep(2000);
		List<WebElement> elements=driver.findElements(selCity);
		for(WebElement e:elements) {
			System.out.println(e.getText());
			if(e.getText().contains("Del")) {
				e.sendKeys(Keys.ENTER);
				break;
			}
		}
		//Actions act=new Actions(driver);
		//act.sendKeys(Keys.ARROW_DOWN).build().perform();
		//act.sendKeys(Keys.ARROW_DOWN).build().perform();
		//act.sendKeys(Keys.ENTER).build().perform();
		//act.keyDown(Keys.ARROW_DOWN).build().perform();
		//act.keyDown(Keys.ARROW_DOWN).build().perform();
		//act.sendKeys(Keys.ENTER).build().perform();
		//Thread.sleep(5000);	
	}
}
