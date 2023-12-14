package customListeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listeners implements ITestListener{
	
	public void onTestStart(ITestResult result)
	{
		
	}
	
	public void onTestSuccess(ITestResult result)
	{
		System.out.println("Passed Test - "+result.getName());
	}
	
	public void onTestFailure(ITestResult result)
	{
		System.out.println("Capturing screenshot for the failed test -- "+result.getTestName());
	}
	
	public void onTestSkipped(ITestResult result)
	{
		
	}
	
	public void onTestFailedButWithinSuccessPercentage(ITestResult result)
	{
		
	}

	public void onStart(ITestContext context)
	{
		
	}
	
	public void onFinish(ITestContext context)
	{
		
	}
}
