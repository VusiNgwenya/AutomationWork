package com.datadriven.framework.test.LoginTest;

import java.io.File;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.asynchttpclient.util.DateUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.Status;
import com.datadriven.framework.utils.TestDataProvider;

import zmq.ZError.IOException;

public class BaseUI 
{

	public static WebDriver driver;
	
	public static Properties prop;
	public static Logger logger;
	
	public static ExtentReports report;
	public static SoftAssert softAssert;
	public static TestDataProvider testDataProvider;
	
	
	public void invokeBrowser(String browserName)
	{
		if(browserName.equalsIgnoreCase("Chrome"))
		{
			System.setProperty(System.getProperty("user.dir"), "/DataDrivenFramework/chromedriver");
			driver = new ChromeDriver();
		}
		else if(browserName.equalsIgnoreCase("Mozilla"))
		{
			System.setProperty(System.getProperty("user.dir"), "/DataDrivenFramework/geckodriver");
			driver = new FirefoxDriver();
		}
		else if(browserName.equalsIgnoreCase("Opera"))
		{
			System.setProperty(System.getProperty("user.dir"), "/DataDrivenFramework/operadriver");
			driver = new OperaDriver();
		}
		else if(browserName.equalsIgnoreCase("IE"))
		{
			System.setProperty(System.getProperty("user.dir"), "/DataDrivenFramework/IEDriverServer");
		}
		else
		{
			driver = new SafariDriver();
		}
		
		driver.manage().timeouts().implicitlyWait(180,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(180, TimeUnit.SECONDS);
		
		if(prop == null)
		{
			prop = new Properties();
		}
	}
	
	public void openURL(String websiteURLKey)
	{
		driver.get(websiteURLKey);
	}
	
	public void tearDown()
	{
		driver.close();
	}
	
	public void quitBrowser()
	{
		driver.quit();
	}
	
	public void enterText(String xpathKey,String data)
	{
		driver.findElement(By.xpath(xpathKey)).sendKeys(data);
	}
	
	public void elementClick(String xpathKey)
	{
		driver.findElement(By.xpath(prop.getProperty(xpathKey))).click();
	}
	
	public boolean isElementPresent(String locatorKey)
	{
		try
		{
			if(getElement(locatorKey).isDisplayed())
			{
				reportPass(locatorKey+" : Element is Displayed");
				return true;
			}
		}
		catch(Exception e)
		{
			reportFail(e.getMessage());
		}
		
		return false;
	}
	
	
	public boolean isElementSelected(String locatorKey)
	{
		try
		{
			if(getElement(locatorKey).isSelected())
			{
				reportPass(locatorKey+" : Element is Selected");
				return true;
			}
		}
		catch(Exception e)
		{
			reportFail(e.getMessage());
		}
		
		return false;
	}
	
	public boolean isElementEnabled(String locatorKey)
	{
		try
		{
			if(getElement(locatorKey).isSelected())
			{
				reportPass(locatorKey+" : Element is Enabled");
				return true;
			}
		}
		catch(Exception e)
		{
			reportFail(e.getMessage());
		}
		
		return false;
	}
	
	public void assertTrue(boolean flag)
	{
		softAssert.assertTrue(flag);
	}
	
	public void assertFalse(boolean flag)
	{
		softAssert.assertFalse(flag);
	}
	
	public WebElement getElement(String locatorKey)
	{
		WebElement element = null;
		
		try 
		{
		    if(locatorKey.endsWith("_id"))
	    	{
			element = driver.findElement(By.id(prop.getProperty(locatorKey)));
		    }
		   else if(locatorKey.endsWith("_xpath"))
		   {
			element = driver.findElement(By.id(prop.getProperty(locatorKey)));
		    }
		   else if(locatorKey.endsWith("_CSS"))
		   {
			element = driver.findElement(By.id(prop.getProperty(locatorKey)));
		    }
		   else if(locatorKey.endsWith("_linkText"))
		   {
			element = driver.findElement(By.id(prop.getProperty(locatorKey)));
		    }
		   else if(locatorKey.endsWith("_PartialLinkText"))
		   {
			element = driver.findElement(By.id(prop.getProperty(locatorKey)));
		   }
		   else if(locatorKey.endsWith("_Name"))
		   {
			element = driver.findElement(By.id(prop.getProperty(locatorKey)));
		   }
		   else
		   {
			   reportFail("Failing the Testcase, Invalid Locator"+locatorKey);
		   }
		}
		catch(Exception e)
		{
			//e.printStackTrace();
			
			reportFail(e.printStackTrace());
			
			e.printStackTrace();
			
			Assert.fail("Failing the TestCase : "+e.getMessage())
		}
		
		return element;
	}
	
	public void verifyPageTitle(String locatorKey)
	{
WebElement element = null;
		
		try 
		{
		    if(locatorKey.endsWith("_id"))
	    	{
			element = driver.findElement(By.id(prop.getProperty(locatorKey)));
		    }
		   else if(locatorKey.endsWith("_xpath"))
		   {
			element = driver.findElement(By.id(prop.getProperty(locatorKey)));
		    }
		   else if(locatorKey.endsWith("_CSS"))
		   {
			element = driver.findElement(By.id(prop.getProperty(locatorKey)));
		    }
		   else if(locatorKey.endsWith("_linkText"))
		   {
			element = driver.findElement(By.id(prop.getProperty(locatorKey)));
		    }
		   else if(locatorKey.endsWith("_PartialLinkText"))
		   {
			element = driver.findElement(By.id(prop.getProperty(locatorKey)));
		   }
		   else if(locatorKey.endsWith("_Name"))
		   {
			element = driver.findElement(By.id(prop.getProperty(locatorKey)));
		   }
		   else
		   {
			   reportFail("Failing the Testcase, Invalid Locator"+locatorKey);
		   }
		}
		catch(Exception e)
		{
			//e.printStackTrace();
			
			//reportFail(e.printStackTrace());
			
			e.printStackTrace();
			
			Assert.fail("Failing the TestCase : "+e.getMessage())
		}
		
		
	}
	
	/********************* Reporting Functions *********************/
	
	public void reportFail(String reportString)
	{
		logger.log(Status.FAIL, reportString);
		takesScreenShotOnFailure();
	}
	
	public void reportPass(String reportString)
	{
		logger.log(Status.PASS, reportString);
	}
	
	public Object[][] getTestOneData()
	{
		return testDataProvider.getTestData("TestData/TestData_testmanagement","Feature 1","Test Three");
	}
	
	public void takesScreenShotOnFailure()
	{
		TakesScreenshot takesScreenShot = (TakesScreenshot) driver;
		takesScreenShot.getScreenshotAs(OutputType.FILE);
		
		File sourceFile = new File(System.getProperty("user.dir"));
		
		File destFile = new File(System.getProperty("user.dir")+"/Screenshots/"+DateUtils.getTimeStamp()+".png");
		
		try
		{
			FileUtils.copyFile(sourceFile, destFile);
			logger.addScreenCaptureFromPath(System.getProperty("user.dir")+"/Screenshots/"+DateUtils.getTimeStamp()+".png");
			
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		
		
	}
}
