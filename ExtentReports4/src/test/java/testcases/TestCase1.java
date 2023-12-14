package testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.AssertJUnit;

import java.io.IOException;
import java.util.Arrays;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.SkipException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.Markup;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class TestCase1 
{
   public ExtentHtmlReporter htmlReporter;
   public ExtentReports extent;
   public ExtentTest test;
   
   @BeforeTest
   public void setReport()
   {
	   htmlReporter = new ExtentHtmlReporter("./extent.html");
	   
	   htmlReporter.config().setEncoding("utf-8");
	   htmlReporter.config().setDocumentTitle("W2A Automation Report");
	   htmlReporter.config().setReportName("Automation Test Results");
	   htmlReporter.config().setTheme(Theme.DARK);
	   
	   extent = new ExtentReports();
	   extent.attachReporter(htmlReporter);
	   extent.setSystemInfo("Automation Tester", "Rahul Arora");
	   extent.setSystemInfo("Organization", "Way2Automation");
	   extent.setSystemInfo("Build No", "W2A-1234");
   }
   
   
   @AfterTest
   public void endReport()
   {
	   extent.flush();
   }
   
   @Test
   public void doLogin()
   {
	   test = extent.createTest("Login Test");
	   
	   System.out.println("Executing Login Test");
   }
   
   @Test
   public void doUserReg()
   {
	   test = extent.createTest("User Reg Test");
	   
	   AssertJUnit.fail("User Reg Test Failed");
   }
   
   @Test
   public void isSkip()
   {
	   test = extent.createTest("Skip Test");
	   
	   throw new SkipException("Skipping the test case");
   }
   
   @AfterMethod
@AfterMethod
   public void tearDown(ITestResult result)
   {
	    if(result.getStatus()==ITestResult.FAILURE)
	    {
	    	 String exceptionMessage = Arrays.toString(result.getThrowable().getStackTrace());;
	    	 
	    	 Assert.fail("<details>"+"<summary>"+"<b>"+"<font color="+"red>"+"Exception Occured:"
	    	 +"</font>"+"</b>"+"<summary>"+exceptionMessage.replaceAll(",","<br>"+"<br>")+"</details>"
	    	 +"\n");
	    	/* 
	    	 try
	    	 {
	    		 ExtentManager.captureScreenshot();
	    		 testReport.get().fail("<b>"+"<font color="+"red>"+
	    		 MediaEntityBuilder.createScreenCaptureFromPath(exceptionMessage)
	    		 .build());
	    	 }
	    	 catch(IOException e)
	    	 {
	    		 
	    	 }*/
	    	 
	    	 String failureLogg = "TEST CASE FAILED";
	    	 Markup m = MarkupHelper.createLabel(failureLogg, ExtentColor.RED);
	    	 test.log(Status.FAIL, m);
	    	 
	    } 
	    else if(result.getStatus()==ITestResult.SKIP)
	    {
	    	 String methodName =	result.getMethod().getMethodName();
		        
		        String logText = "<b>" + "TEST CASE : - "+methodName.toUpperCase()+"   SKIPPED";
		        
		        Markup m = MarkupHelper.createLabel(logText, ExtentColor.YELLOW);
		        
		        test.skip(m);
	    }
	    else if(result.getStatus()==ITestResult.SUCCESS)
	    {
	        String methodName =	result.getMethod().getMethodName();
	        
	        String logText = "<b>" + "TEST CASE : - "+methodName.toUpperCase()+"   PASSED";
	        
	        Markup m = MarkupHelper.createLabel(logText, ExtentColor.GREEN);
	        
	        test.pass(m);
	    
	    }
   }
	
}
