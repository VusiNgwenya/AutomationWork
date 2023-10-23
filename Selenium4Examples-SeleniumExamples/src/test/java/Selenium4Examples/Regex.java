package Selenium4Examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Regex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.firefox.driver","/Selenium4Examples-SeleniumExamples/geckodriver");
		
		WebDriver driver = null;
		
		driver = new FirefoxDriver();
		
		/*driver.get("https://facebook.com");
		
		driver.findElement(By.id("email")).sendKeys("dummy@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("dummy");
		
		//driver.findElement(By.xpath("//input[contains(@id,'u_0_')]")).click();
		driver.findElement(By.xpath("//input[@id='u_0_2']")).click();*/
		
		driver.get("https://google.com");
		
		//driver.findElement(By.xpath("//input[contains(@data-ved,'9UDCA']")).sendKeys("home");
		
		driver.findElement(By.cssSelector("a[ping*='QCC']")).click();
		
	}

}
