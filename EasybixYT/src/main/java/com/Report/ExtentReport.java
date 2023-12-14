package com.Report;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.ITestResult;
import org.testng.SkipException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentReport {
	
	ExtentReports reports;
	ExtentHtmlReporter htmlReporter;
	ExtentTest test;
	WebDriver driver;
	
	@BeforeTest
	public void startTest()
	{
		htmlReporter = new ExtentHtmlReporter(System.getProperty("user.dir")+"//test-output//extentreport.html");
		reports.attachReporter(htmlReporter);
		
		reports.setSystemInfo("machine", "Anshul-772G");
		reports.setSystemInfo("Env", "DevOps");
		reports.setSystemInfo("Build", "Integration");
		reports.setSystemInfo("Browser", "IE");
	}
	
	@BeforeMethod
	public void openApplication()
	{
		System.setProperty("webdriver.chrome.driver", "/EasybixYT/geckodriver");
		driver = new FirefixDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		
	}
	
	@Test
	public void verifyTitleTest()
	{
		test = reports.createTest("verifyTitleTest");
		String expectedTitle = "Facebook - log in or sign  up";
		String pageTitle = driver.getTitle();
		
		Assert.assertEquals(pageTitle, expectedTitle);
	}
	
	
	
	@Test
	public void passTest()
	{
		test = reports.createTest("passTest");
		System.out.println("This is my Pass test");
		Assert.assertTrue(true);
		test.pass("first Test passed");
	}
	
	@Test
	public void failTest()
	{
		test = reports.createTest("passTest");
		System.out.println("This is my Fail test");
		Assert.assertTrue(true);
		test.pass("first Test failed");
	}
	
	
	@Test
	public void skipTest()
	{
		test = reports.createTest("failTest");
		System.out.println("This is my Skip test");
		
		throw new SkipException("Skip test forcefully");
		
		//Assert.assertTrue(false);
		//test.pass("first Test skipped");
	}
	
	@AfterMethod
	public void setTestResult(ITestResult result)
	{
		if(result.getStatus() == ITestResult.FAILURE )
		{
			test.fail(result.getTestName());
			test.fail(result.getThrowable());
		}
		else if(result.getStatus() == ITestResult.SUCCESS)
		{
			test.pass(result.getTestName());
		}
		else if(result.getStatus() == ITestResult.FAILURE)
		{
			test.skip("Test Case :"+result.getTestName()+" has been skipped.");
		}
	}
	
	@Test
	public void fillRegistrationformTest()
	{
		test = reports.createTest("fillRegistrationformTest");
		
		WebElement firstName = driver.findElement(By.cssSelector("input[id='u_0_2']"));
		WebElement lastName = driver.findElement(By.cssSelector("lastname"));
		WebElement submitButton = driver.findElement(By.id("u_0_m"));
		
		firstName.sendKeys("Anshul");
		lastName.sendKeys("Chauhan");
		
		submitButton.click();
		
		String expectedTitle = "Facebook Home";
		String pageTitle = driver.getTitle();
		
		Assert.assertEquals(pageTitle, expectedTitle);
		
	}
	
	@AfterMethod
	public void setTestResult(ITestResult result) throws
	{
		String screenshot = CaptureScreenshot.captureScreen(driver,captureScreenshot.generateFile());
		
		if(result.getStatus() == ITestResult.FAILURE)
		{
			test.log(Status.FAIL, result.getName());
			test.log(Status.FAIL,result.getThrowable());
			test.fail("Screen Shot: "+test.addScreenCaptureFromBase64String(screenshot));
		}
		else if(result.getStatus() == ITestResult.SUCCESS)
		{
			test.log(Status.PASS, result.getName());
		}
	}
	
	@AfterTest
	public void endTest()
	{
	    reports.flush();	
	}

}
