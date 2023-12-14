package testnglearning;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class CustomerListeners implements ITestListener {
	
	public void onTestStart(ITestResult result)
	{
		
	}
	
	public void onTestSuccess(ITestResult result)
	{
		Reporter.log("Capture Screenshot");
	}
	
	public void onTestFailure(ITestResult result)
	{
		//Reporter.log("<Capture Screenshot");
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
