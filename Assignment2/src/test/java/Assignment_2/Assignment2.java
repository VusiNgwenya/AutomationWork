package Assignment_2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Assignment2 {

	public static WebDriver driver;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.firefox.driver", "/Assignment2/geckodriver");
		
		driver = new FirefoxDriver();
		
		driver.get("https://qa.way2automation.com");
		
		driver.navigate().to("https://qa.way2automation.com");	
		
		driver.findElement(By.xpath("//input[@name='name']")).sendKeys("John");
		
		driver.findElement(By.cssSelector("div.bottom:nth-child(12) > div:nth-child(2) > input:nth-child(1)")).click();
		
	}
}
