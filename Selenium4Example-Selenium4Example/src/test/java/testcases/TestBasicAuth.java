package testcases;

import java.time.Duration;

import org.openqa.selenium.UsernameAndPassword;

public class TestBasicAuth 
{

	public static void main(String[] args)
	{
		System.setProperty("webdriver.firefox.driver", "/Selenium4Example-Selenium4Example/geckodriver");
		
		((HasAuthentication) driver).register(UsernameAndPassword.of("admin", "admin"));
		
		driver.get("https://the-internet.herokuapp.com");
		driver.manage().window().maximize();
		
		driver.manage().implicitlyWait(Duration.ofSeconds(10));
	}
}
