import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class LiveDemo {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		System.setProperty("webdriver.firefox.driver","/Users/abvn237/eclipse-workspace/Introduction/geckodriver");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://rahulshettyacademy.com/greenkart/#/offers");
		
		driver.findElement(By.xpath("//tr/th[1]")).click();
		
		List<WebElement> elementsList = driver.findElements(By.xpath("//tr/td[1]"));
		
		List<String> originalList = elementsList.stream().map(s->s.getText()).collect(Collectors.toList());
		
		List<String> sortedList = originalList.stream().sorted().collect(Collectors.toList());
		
		Assert.assertTrue(originalList.equals(sortedList));
		List<String> price;
		
		do {
			
			List<WebElement> rows = driver.findElements(By.xpath("//tr/td[1]"));
		price = rows.stream().filter(s->s.getText().contains("Rice")).
		map(s->getPriceVeggie(s)).collect(Collectors.toList());
		
		if(price.size()<1)
		{
			driver.findElement(By.cssSelector("[aria-label='Next']")).click();
		}
		} while(price.size()<1);
				
	}
	
	private static String getPriceVeggie(WebElement s)
	{
		String pricevalue = s.findElement(By.xpath("following-sibling::td[1]")).getText();
		
		return pricevalue;
	}

}
