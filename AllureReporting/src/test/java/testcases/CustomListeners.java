package testcases;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Date;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;


import io.qameta.allure.Allure;

public class CustomListeners implements ITestListener{
	
	public InputStream is;
	
	

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
		
		try
		{
			is = new FileInputStream("/AllureReporting/");
			
		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
		
		Allure.addAttachment("Screenshot", is);
	}

	@Override
	public void onTestSkipped(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
				
	}

	@Override
	public void onTestSuccess(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

}
