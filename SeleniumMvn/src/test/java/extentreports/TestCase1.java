package extentreports;

import org.testng.ITestResult;
import org.testng.SkipException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import junit.framework.Assert;

public class TestCase1 
{

	public ExtentSparkReporter htmlReporter;
	public ExtentReports extent;
	public ExtentTest test;
	
	@BeforeTest
	public void setReport()
	{
		htmlReporter = new ExtentSparkReporter("./reports/")
	}
	
	@Test
	public void doLogin()
	{
		test = extent.createTest("Login Test");
	}
	
	/*@Test
	public void doUserReg()
	{
		test = extent.createTest("User Reg Test");
		Assert.fail("Failing userb reg test");
	}*/
	
	@Test
	public void validateTitle()
	{
		test = extent.createTest("Validate Title Test");
		throw new SkipException("Skipping the test case");
	}
	
	@AfterMethod
	public void tearDown(ITestResult result)
	{
		if(result.getStatus()==ITestResult.FAILURE)
		{
			test.log(Status.FAIL, "Failed test");
		}
		else if(result.getStatus()==ITestResult.SUCCESS)
		{
			test.log(Status.FAIL, "Passed test");
			
			String methodName = result.getMethod().getMethodName();
			String text = "<b>TEST CASE: "+methodName.toUpperCase()+" FAILED</b>";
			
			Markup m = MarkupHelper.createLabel("Test Case Failed"),ExtentColor.RED);
			
		}
		else if(result.getStatus()==ITestResult.SKIP)
		{
			test.log(Status.FAIL, "Skipped test");
		}
	}
	
	@Test
	public void doUserReg()
	{
	     test = extent.createTest("User Reg Test");	
	}
}
