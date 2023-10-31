package com.w2a.testcases;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.Properties;
import java.util.logging.Logger;

import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeSuite;

import com.w2a.utilities.ExcelReader;

import sendingMails.MonitoringMail;
import testcases.DBManager;

public class BaseTest {
	
	public WebDriver driver;
	private static Properties or = new Properties();
	private static Properties config = new Properties();
	private static FileInputStream fis;
	private static Logger log = Logger.getLogger("",BaseTest.class);
	public static ExcelReader excel = new ExcelReader(".//src//testcases");
	public static MonitoringMail mail = new MonitoringMail();
	public static WebDriverWait wait;
	public static WebDriverWait dropdown;
	
	
	
	@BeforeSuite
	public void setUp(String browserName)
	{
		PropertyConfigurator.configure(".//src/test/resources/properties/log4j");
		
		try
		{
			fis = new FileInputStream("./src/test/resources/properties/configure.properties");
			
		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
		
		try
		{
			config.load(fis);
			log.info("Config properties loaded !!!");
		}
		catch(IOException e)
		{
			e.printStackTrace()
		}
		
		try
		{
			fis = new FileInputStream("./src/test/resources/properties/OR.properties");
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		
		try
		{
			config.load(fis);
			log.info("OR properties loaded !!!");
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		
		try {
			DBManager.setMysqlDbConnection();
			log.info("DB Connection established !!!");
		}
		catch(ClassNotFoundException e)
		{
			e.printStackTrace();
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		
		if(config.getProperty("browser").equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "/PageObjectModel/chromedriver");
			driver = new ChromeDriver();
			log.info("Launching Chrome !!!");
		}
		else if(config.getProperty("browser").equals("firefox"))
		{
			System.setProperty("webdriver.firefox.driver", "/PageObjectModel/geckodriver");
			driver = new FirefoxDriver();
			log.info("Launching Chrome !!!");
		}
		
		
		
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
		log.info("Test Execution completed !!!");
	}
	
	

}
