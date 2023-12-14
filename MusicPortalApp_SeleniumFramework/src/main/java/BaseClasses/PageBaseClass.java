package BaseClasses;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Alert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.utils.DateUtil;

import PageClasses.LandingPage;
import Utilities.ExtentReportManager;

public class PageBaseClass extends BaseTestClass
{
	
	public static ExtentTest logger;

	public PageBaseClass(WebDriver driver, ExtentTest logger)
	{
		this.driver = driver;
		this.logger = logger;
	}
	
	/*public static void invokeBrowser(String browserName)
	{
		try
		{
			if(browserName.equalsIgnoreCase("Chrome"))
			{
				System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/SeleniumPOMFramework/chromedriver");
				driver = new ChromeDriver();
			}
			else if(browserName.equalsIgnoreCase("Mozilla"))
			{
				System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"/SeleniumPOMFramework/geckodriver");
				driver = new ChromeDriver();
			}
			else if(browserName.equalsIgnoreCase("Opera"))
			{
				System.setProperty("webdriver.gecko.opera", System.getProperty("user.dir")+"/SeleniumPOMFramework/operadriver");
				driver = new OperaDriver();
			}
			else if(browserName.equalsIgnoreCase("IE"))
			{
				System.setProperty("webdriver.ie.driver", System.getProperty("user.dir")+"/SeleniumPOMFramework/IEDriverServer");
				driver = new OperaDriver();
			}
			else
			{
				driver = new SafariDriver();
			}
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(60,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
	}*/
	
	/********************** OpenApplication ****************************/
	
	public static LandingPage OpenApplication()
	{
		logger.log(Status.INFO,"Opening the WebSite");
		
		driver.get("https://www.rediff.com/");
		
		logger.log(Status.PASS,"Success Opened the https://www.rediff.com");
		
		return PageFactory.initElements(driver, LandingPage.class);
		
	}
	
	/********************** Get Page Title ****************************/
	
	public static void getTitle(String expectedTitle)
	{
		try
		{
			Assert.assertEquals(driver.getTitle(), expectedTitle);
			reportPass("Actual Title: "+driver.getTitle()+" - equals to Expected Title :"+expectedTitle);
		}
		catch(Exception e)
		{
			reportFail(e.getMessage());
		}
	}
	
	public static void reportFail(String reportString)
	{
		logger.log(Status.FAIL, reportString);
		takeScreenShotOnFailure();
		
	}
	
	public static void reportPass(String reportString)
	{
		logger.log(Status.PASS, reportString);
		takeScreenShotOnFailure();
		Assert.fail(reportString);
	}
	
	public static void takeScreenShotOnFailure()
	{
		TakesScreenshot takesScreenShot = (TakesScreenshot) driver;
		File sourceFile = takeScreenShot.getScreenshotAs(OutputType.FILE);
		
		File destFile = new File(System.getProperty("user.dir")+"/ScreenShots"+DateUtil.getTimeStamp());
		
		try
		{
			FileUtils.copyFile(sourceFile, destFile);
			logger.addScreenCaptureFromPath(
					System.getProperty("user.dir")+"/ScreenShots/"+DateUtil.getTimeStamp()+".png");
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		
		
	}
	
	public void verifyElementIsDisplayed(WebElement webElement)
	{
		try
		{
			if(webElement.isDisplayed())
			{
				reportPass("Password Box is Displayed");
			}
			else
			{
				reportFail("Password box is not appeared");
			}
		}
		catch(Exception e)
		{
			//e.printStackTrace();
			
			reportFail(e.getMessage());
		}
	}
	
	public List getAllElementsOfDropDown(WebElement webElement)
	{
		try
		{
			Select select = new Select(webElement);
			
			List<WebElement> allElements = select.getOptions();
			
			return allElements;
			
		}
		catch(Exception e)
		{
			//e.printStackTrace();
			reportFail(e.getMessage());
		}
		
		return null;
	}
	
	/***********************  Accept Java Script Alert **************/
	
	public void acceptAlert()
	{
		try
		{
			Alert alert = driver.switchTo().alert();
			alert.accept();
			logger.log(Status.PASS, "Page Alert Accepted");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
}
