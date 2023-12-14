package com.testing.listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class DemoListeners implements ITestListener
{
   @Override
   public void onTestStart(ITestResult result)
   {
	   System.out.println("Test Started : "+result.getName());
   }
   
   @Override
   public void onTestFailure(ITestResult result)
   {
	   
   }
   
   @Override
   public void onTestSuccess(ITestResult result)
   {
	   
   }
   
   
   @Override
   public void onTestSkipped(ITestResult result)
   {
	   
   }
   
   @Override
   public void onTestFailedButWithinSuccessPercentage(ITestResult result)
   {
	   
   }
   
   @Override
   public void onStart(ITestContext context)
   {
	   
   }
}
