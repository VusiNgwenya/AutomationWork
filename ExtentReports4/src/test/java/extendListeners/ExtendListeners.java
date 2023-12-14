package extendListeners;

import java.util.Arrays;
import java.util.Date;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

public class ExtendListeners implements ITestListener{
	
	static Date d = new Date();
	static String fileName = "Extent_"+d.toString().replace(":", "_")+".html";
	
	private static ExtentReports extent = ExtentManager.createInstance(System.getProperty("user.dir")+"\\reports\\"+filename);
	public static ThreadLocal<ExtentTest> testReport = new ThreadLocal<ExtentTest>();
	
	

	@Override
	public void onFinish(ITestContext result) {
		// TODO Auto-generated method stub
		
		
		
	}

	@Override
	public void onStart(ITestContext arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailure(ITestResult arg0) {
		// TODO Auto-generated method stub
		
		String exceptionMessage = Arrays.toString(result.getThrowable());
		testReport.get("<details>"+"<summary>"+"<b>"+"<font>");
		
	}

	@Override
	public void onTestSkipped(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		
		ExtentTest test = extent.createTest(result.getTestClass().getName()+"  ");
		testReport.set(test);
				
				
	}

	@Override
	public void onTestSuccess(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

}
