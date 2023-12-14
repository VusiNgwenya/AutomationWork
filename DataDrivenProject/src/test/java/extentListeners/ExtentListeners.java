package extentListeners;

import java.util.Arrays;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class ExtentListeners implements ITestListener{
	
	public void onTestFailure(ITestResult result)
	{
	     String exceptionMessage = Arrays.toString(result.getThrowable().getStackTrace());
	     //test.fail(exceptionMessage);
	     
	     ScreenshotUtil.captureScreenshot();
	     
	     String methodName.getMethod().getMethodName();
	     String logText = "<br>"+"TEST CASE:- "+methodName.toUpperCase()+" FAILED";
	     
	     try
	     {
	    	 String screenshot  = ScreenshotUtil.fileName;
	    	 test.fail("<b><font color=red> "+"screenshot of failure"+"</font>");
	     }
	     catch(Exception e)
	     {
	    	 
	     }
	}

}
