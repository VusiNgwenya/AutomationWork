package Examples.LocatorsExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocatorsExample1 {
	
	public static WebDriver driver;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.firefox.driver", "/Users/abvn237/eclipse-workspace/Selenium3newseries-SeleniumTesting/geckodriver");
		
		//WebDriverManager.firefoxdriver().setup();
		
		driver = new FirefoxDriver();
		
		String baseUrl = "https://demo.guru99.com/test/login.html";
		
		driver.get(baseUrl);
		
		WebElement email = driver.findElement(By.id("email"));
		WebElement password = driver.findElement(By.name("passwd"));
		WebElement login = driver.findElement(By.id("SubmitLogin"));
		
		email.sendKeys("abcd@gmail.com");
		password.sendKeys("abcdefjhijkl");
		login.click();
	    
		System.out.println("Text Field Cleared");
		
		
		driver.get(baseUrl);
		
		driver.findElement(By.id("email")).sendKeys("abcd@gmail.com");
		driver.findElement(By.name("passwd")).sendKeys("abcdefghijkl");
		driver.findElement(By.id("SubmitLogin ")).submit();
		
		System .out.println("Login Done Submit");
		
	}

}
