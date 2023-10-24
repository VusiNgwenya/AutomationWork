package com.w2a.rough;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class TestProperties 
{
	public static WebDriver driver=null;
	public static Properties config = new Properties();
	public static Properties OR = new Properties();
	public static FileInputStream fis=null;

	@BeforeMethod
	@BeforeSuite
	public void setUp()
	{

		if(driver==null)
		{	 
		 try
		 {
			     System.out.println(System.getProperty("user.dir"));
			    fis = new FileInputStream("/DataDrivenFramework/runner/");

				config.load(fis);
				
				fis = new FileInputStream(System.getProperty("user")+"/DataDrivenFramework/runner/");
				
				OR.load(fis);
				
				System.out.println(config.getProperty("browser"));
				System.out.println(OR.getProperty("browser"));
				
				if(config.getProperty("browser").equals("firefox"))
				{
					System.setProperty("webdriver.firefox.driver", "/DataDriverFramework/geckodriver");
					driver = new FirefoxDriver();
				}
				else if(config.getProperty("browser").equals("chrome"))
				{
					System.setProperty("webdriver.chrome.driver", "/DataDriverFramework/chromedriver");
					driver = new ChromeDriver();
				}
				else if(config.getProperty("browser").equals("ie"))
				{
					System.setProperty("webdriver.ie.driver", "/DataDriverFramework/internetexplorerdriver");
					driver = new InternetExplorerDriver();
				}
				
				driver.get(config.getProperty("testsiteurl"));
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Integer.parseInt(config.getProperty("implicit.wait")),TimeUnit.SECONDS);
				
		 }
		 catch(Exception e)
		 {
			 e.printStackTrace();
		 }
		}	
	}
	
	@AfterMethod
	@AfterSuite
	public void tearDown()
	{
		
	}
}
