package Selenium4Examples;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class ChromeTest 
{

	public static WebDriver driver = null;
	@BeforeClass
	public static void setupClass()
	{
		System.setProperty("webdriver.firefox.driver","/Selenium4Examples-SeleniumExamples/geckodriver");
	}
	
	@BeforeMethod
	@Before()
	public void setupTest()
	{
		driver = new FirefoxDriver();
	}
	
	@AfterMethod
	public void teardown()
	{
		if(driver != null)
		{
			driver.quit();
		}
	}
	
	@Test
	public void test()
	{
		driver.get("https://google.com");
		driver.navigate().to("https://yahoo.com");
		driver.navigate().back();
		
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getPageSource());
		driver.close();	
	}
	
}
