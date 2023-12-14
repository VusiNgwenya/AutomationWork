package testcases;

import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import pages.HomePage;

public class LoginTest
{
	
	public static WebDriver driver;

	@Test
	public void loginTest()
	{
		System.setProperty("webdriver.firefox.driver", "/PageObjectBasics/geckodriver");
		
		driver = new FirefoxDriver();
		
		driver.get("http://facebook.com");
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		HomePage home = new HomePage();
		home.doLogin("trainer@way2automation.com", "Selenium@1234");
		
	}
}
