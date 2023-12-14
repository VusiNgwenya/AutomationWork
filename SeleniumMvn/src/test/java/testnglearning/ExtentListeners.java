package testnglearning;

import java.util.Date;

import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.w2a.utilities.ExtentManager;

public class ExtentListeners implements ITestListener
{
    static Date d = new Date();
    static String fileName = "Extent_"+d.toString().replace(":","_").replace(0, 0);
    
    private static ExtentReports extent = ExtentManager.createInstance(System.getProperty("user.dir"));
    
    public static ExtentTest test;
    
    public void onTestStart(ITestResult result)
    {
    	test = extent.createTest(result.getTestClass().getName());
    	
    }
    
    public void onTestSkipped(ITestResult result)
    {
    	String methodname = result.getMethod()
    }
    
}
