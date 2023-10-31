package com.w2a.pages;

import static org.testng.Assert.ARRAY_MISMATCH_TEMPLATE;

import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;

import com.aventstack.extentreports.ExtentTest;

public class Page {
	
	public static ExtentTest test;
	public static String browser;
	public static WebDriver driver;
	public static Logger log;
	
	public void click(String str)
	{
		
	}
	
	public static void initConfiguration()
	{
		if(Constants.browser.equals("firefox"))
		{
			driver = new FirefoxDriver();
			log.debug("launching Firefox");
		}
		else if(Constants.browser.equals("chrome"))
		{
			driver = new FirefoxDriver();
			log.debug("launching Firefox");
		}
		else if(Constants.browser.equals("chrome"))
		{
			System.setProperty("webdriver.ie.driver", System.getProperty("user.dir")+"\\src\\test\\resource");
			
			Map<String,Object> prefs = new HashMap<String,Object>();
			prefs.put("profile.default_content_setting_values.notifications", prefs);
			prefs.put("credentials_enable_service", false);
			prefs.put("profile.password_manager_enabled", false);
			FirefoxOptions options = new FirefoxOptions();
			options.setExperimentalOption("prefs",prefs);
			options.addArguments("--disable-extensions");
			options.addArguments("--disable-infobars");
			
	
			driver = new InternetExplorerDriver();
			log.debug("launching Firefox");
		}
		
		driver.get(Constants.testsiteurl);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Constants.implicitlyWait)
	}
	
	public static void quitBrowser()
	{
		
	}

}
