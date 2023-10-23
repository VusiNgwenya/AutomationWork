package Selenium4Examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ExceptionExample {

	public static WebDriver driver = null;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.firefox.driver","/Selenium4Examples-SeleniumExamples/geckodriver");
		
		WebElement username = driver.findElement(By.id("username"));
		WebElement pwd = driver.findElement(By.id("password"));
		WebElement submitBtn = driver.findElement(By.id("submit"));
		
		username.sendKeys("invalidUserName");
		pwd.sendKeys("invalidPassword");
		submitBtn.click();
		
		username.sendKeys("validUsername");
		pwd.sendKeys("validPassword");
		submitBtn.click();
		

	}

}
