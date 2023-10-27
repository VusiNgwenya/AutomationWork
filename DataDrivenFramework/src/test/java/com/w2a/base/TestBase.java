package com.w2a.base;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import java.io.FileInputStream;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.PropertyConfigurator;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.w2a.utilities.ExcelReader;
import com.w2a.utilities.ExtentManager;

import testcases.DBManager;

public class TestBase {

	public static WebElement dropdown;
	public static WebDriver driver;
	public static Properties config = new Properties();
	public static Properties OR = new Properties();
	public static FileInputStream fis=null;
	public static Logger log = Logger.getLogger(TestBase.class);
    public static ExcelReader excel = new ExcelReader("/DataDrivenFramework/");	
    public static ExtentReports rep = ExtentManager.getInstance();
    public static ExtentTest test;
    public static WebDriverWait wait;
    
    
	@BeforeMethod
	@BeforeSuite
	public void setUp()
	{
		PropertyConfigurator.configure("./src/test/resource/properties/jog4j.properties");
		
		if(driver==null)
		{	 
		 try
		 {
			     System.out.println(System.getProperty("user.dir"));
			    fis = new FileInputStream("/DataDrivenFramework/runner/");

				config.load(fis);
				log.debug("Config file loaded!");
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
				log.debug("navigated to :"+config.getProperty("testsiteurl"));
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Integer.parseInt(config.getProperty("implicit.wait")),TimeUnit.SECONDS);
				
			   // wait = new WebDriverWait(driver,Duration.ofSeconds(Integer.parseInt(config.getProperty("explicit.wait"))));
				DBManager.setMysqlDbConnection();
				log.info("DB Connection established !!!");
		 }
		 catch(ClassNotFoundException e)
		 {
			 //DriverManager.setMysqlDBConnection();
			 
			 
			 e.printStackTrace();
		 }
		 catch(SQLException e)
		 {
			 e.printStackTrace();
		 }
		} 
	}
	
	public static void verifyEquals(String value1,String value2)
	{
		
	}
	
	public static void click(String locator)
	{
		if(locator.endsWith("_CSS"))
		{
			driver.findElement(By.cssSelector(OR.getProperty(locator))).click();
		
		}else if(locator.endsWith("_XPATH"))
		{
			driver.findElement(By.cssSelector(OR.getProperty(locator))).click();
		}
		else if(locator.endsWith("_ID"))
		{
			driver.findElement(By.cssSelector(OR.getProperty(locator))).click();
		}
			
		test.log(LogStatus.INFO, "Clicking on :"+locator);
		
		//driver.findElement(By.cssSelector(OR.getProperty(locator))).click();
	}
	
	
	
	
	public void select(String locator,String value)
	{
		if(locator.endsWith("_CSS"))
		{
			driver.findElement(By.cssSelector(OR.getProperty(locator))).click();
		
		}else if(locator.endsWith("_XPATH"))
		{
			driver.findElement(By.cssSelector(OR.getProperty(locator))).click();
		}
		else if(locator.endsWith("_ID"))
		{
			driver.findElement(By.cssSelector(OR.getProperty(locator))).click();
		}
			
		test.log(LogStatus.INFO, "Clicking on :"+locator);
		
		Select select = new Select(dropdown);
		
		select.selectByVisibleText(value);
		
		//driver.findElement(By.cssSelector(OR.getProperty(locator))).click();
	}
	
	public static void type(String locator,String text)
	{
		driver.findElement(By.cssSelector(OR.getProperty(locator))).sendKeys("dcdcdc");
	}
		
	public static boolean isElementPresent(By by)
	{
		try
		{
			driver.findElement(by);
		}
		catch(NoSuchElementException e)
		{
			return false;
		}
	   
	
	}
	
	@AfterMethod
	@AfterMethod
	@AfterMethod
	@AfterMethod
	@AfterSuite
	public void tearDown()
	{
		driver.quit();
	}

}
