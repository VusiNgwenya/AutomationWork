package testinglearning;

import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.Markup;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class TestExtentReports {
	
	public ExtentSparkReporter htmlReporter;
	public ExtentReports extent;
	public ExtentTest test;
	
	@BeforeTest
	public void setReport()
	{
		htmlReporter = new ExtentSparkReporter("./reports/extent.html");
		
		htmlReporter.config().setEncoding("utf-8");
		htmlReporter.config().setDocumentTitle("W2A Automation Report");
		htmlReporter.config().setReportName("Automation Test Results");
		htmlReporter.config().setTheme(Theme.STANDARD);
		
		extent = new ExtentReports();
		extent.attachReporter(htmlReporter);
		
		extent.setSystemInfo("Automation Tester", "Rahul Arora");
		extent.setSystemInfo("Build No:","1234");
		extent.setSystemInfo("Organization","Way2Automation");
	}
	
    @Test
    public void doLogin()
    {
    	test = extent.createTest("Login Test");
    	test.log(Status.INFO, "Entering username");
    	test.log(Status.INFO, "Entering Password");
    }
	
    @Test
    public void doUserReg()
    {
    	test = extent.createTest("User Reg Test");
    	test.log(Status.INFO, "Filling form");
    }
	
	@Test
	public void isSkipTest()
	{
		test = extent.createTest("Skip Test");
		test.log(Status.INFO, "Skipping the test");
		
	}
	
	@AfterMethod
	public void updateResults(ITestResult result)
	{
		if(result.getStatus()==ITestResult.FAILURE)
		{
			
			String methodName =	result.getMethod().getMethodName();
			  
			Markup m = MarkupHelper.createLabel("Test case failed"+ methodName.toUpperCase(),ExtentColor.RED);
			
		  
			Assert.fail("Failing the test");
		}
		else if(result.getStatus()==ITestResult.SUCCESS)
		{
			String methodName =	result.getMethod().getMethodName();
			Markup m = MarkupHelper.createLabel("Test case pass" + methodName.toUpperCase(), ExtentColor.GREEN);
			test.pass("test case pass");
		}
		else if(result.getStatus()==ITestResult.SKIP)
		{
			String methodName =	result.getMethod().getMethodName();
			Markup m = MarkupHelper.createLabel("Test case skipped" + methodName, ExtentColor.YELLOW);
			test.skip("Skipping the test");
		}
	}
	
	@AfterTest
	public void endReport()
	{
		extent.flush();
	}
	
	
}
