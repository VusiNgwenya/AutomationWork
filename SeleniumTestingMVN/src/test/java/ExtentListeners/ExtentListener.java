package ExtentListeners;

import java.util.Date;

import org.testng.ISuiteListener;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

public class ExtentListener implements ITestListener, ISuiteListener
{
   static Date d = new Date();
   static String fileName = "Extent_"+d.toString().replace(":", "_");
   
   private static ExtentReports extent = ExtentManager
		   .createInstance(".\\reports\\"+fileName);
   
   private static ExtentTest test;
   
   public void onTestStart(ITestResult result)
   {
	   test = extent
			   .createTest(result.getTestClass().getName()+"       @TestCase: "+)
   }
   
   
}
