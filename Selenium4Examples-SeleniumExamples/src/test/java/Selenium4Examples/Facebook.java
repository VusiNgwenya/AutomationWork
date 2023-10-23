package Selenium4Examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Facebook {

	public static WebDriver driver = null;
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		System.setProperty("webdriver.firefox.driver","/Selenium4Examples-SeleniumExamples/geckodriver");
		
		
		
		driver = new FirefoxDriver();
		
		driver.get("https://facebook.com");
		
		driver.findElement(By.cssSelector("input.login_form_input_box")).sendKeys("dummy@gmail.com");
		
		driver.findElement(By.name("pass")).sendKeys("dummy");
		
		
		
	}

}
