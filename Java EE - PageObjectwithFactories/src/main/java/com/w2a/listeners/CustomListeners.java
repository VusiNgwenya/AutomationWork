package com.w2a.listeners;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.SkipException;

import com.w2a.base.TestBase;
import com.w2a.utilities.TestUtil;

public class CustomListeners extends TestBase implements ITestListener{

	public void onFinish(ITestContext testResults)
	{
		
	}
	
	public void onStart(ITestContext testResults)
	{
		
	}
	
	public void onTestFailedButWithinSuccessPercentage(ITestResult result)
	{
		
	}
	
	public void onTestFailure(ITestResult testResults)
	{
		System.setProperty("org.uncommons.reportng.escape-output", "false");
		
		try
		{
			TestUtil.captureScreenshot();
		}
		catch(IOException e)
		{
		   	e.printStackTrace();
		}
		
		test.log(LogStatus.FAIL, testResults.getName().toUpperCase()+"Failed with exception"+testResults.getThrowable());
		
		Reporter.log("Capturing screenshot");
		Reporter.log("<a target=\"_blank\"href=\"F:\\screenshot\\error.jpg");
		Reporter.log("<br>");
		Reporter.log("<a target=\"_blank\"href=\"F:\\screenshot\\error.jpg");
		
		rep.endTest(test);
		rep.flush();
		
		
	}
	
	public void onTestSkipped(ITestResult testResults)
	{
		
	}
	
	public void onTestStart(ITestContext testResults)
	{
		test = rep.startTest(testResults.getName().toUpperCase());
		
		if(TestUtil.isTestRunnable(testResults.getName(), "excel"))
		{
			throw new SkipException("Skipping the test as the Run mode is new");
		}
	}
	
	public void onTestSuccess(ITestContext testResults)
	{
		test.log(LogStatus.PASS, testResults.getName().toUpperCase()+"PASS");
	}
}
