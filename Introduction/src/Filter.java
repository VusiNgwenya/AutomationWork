import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class Filter {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

		System.setProperty("webdriver.firefox.driver","/Users/abvn237/eclipse-workspace/Introduction/geckodriver");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://rahulshettyacademy.com/greenkart/#/offers");
		driver.findElement(By.id("search-field")).sendKeys("Rice");
		driver.findElement(By.xpath("//tr/td[1]"));
		
		List<WebElement> veggies = driver.findElements(By.xpath("//tr/td[1]"));
		
		List<WebElement> filteredList = veggies.stream().filter(veggie->veggie.getText().contains("Rice")).
		collect(Collectors.toList());
		
		Assert.assertEquals(veggies.size(), filteredList.size());
		
	}

}
