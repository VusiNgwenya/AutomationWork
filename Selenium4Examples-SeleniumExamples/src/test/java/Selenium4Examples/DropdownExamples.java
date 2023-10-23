package Selenium4Examples;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DropdownExamples {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.firefox.driver", "/Selenium4Examples-SeleniumExamples/geckodriver");
		
		WebDriver driver = null;
		
		driver = new FirefoxDriver();
		
		/*driver.get("https://ksrtc.in/oprs-web/");
		
		driver.findElement(By.id("fromPlaceName")).sendKeys("BENG");
		driver.findElement(By.id("fromPlaceName")).sendKeys(Keys.DOWN);
		driver.findElement(By.id("fromPlaceName")).sendKeys(Keys.DOWN);
		
		System.out.println(driver.findElement(By.id("fromPlaceName")).getAttribute("value"));*/
		
		/*driver.get("https://www.makemytrip.com/");
		
		driver.findElement(By.cssSelector(".lbl_input.latoBold.appendBottom5")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@aria-autocomplete='list']")).sendKeys("MUM");
		driver.findElement(By.xpath("//input[@aria-autocomplete='list']")).sendKeys(Keys.DOWN);
		driver.findElement(By.xpath("//input[@aria-autocomplete='list']")).sendKeys(Keys.ENTER);*/
		
		driver.get("https://in.yahoo.com/?p=us");
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("hello");
		
		Thread.sleep(5000);
		
		List<WebElement> values = driver.findElements(By.xpath("//div[type='normal']"));
		
		for(int i=0;i<values.size();i++)
		{
			System.out.println(values.get(i).getText());
		}
		
		
		

	}

}
