package com.sample.test;

import org.testng.ITestResult;

public class Retry {
	
	
	int retrycount =0;
	int maxretrycount =1;
	
	@Override
	public boolean retry(ITestResult result)
	{
		if(retrycount<maxretrycount)
		{
			System.out.println("Retrying test"+result.getName()+"with"+getResultStatusName("pass")+"for the");
			retrycount++;
			return true;
		}
		
		return false;
	}
	
	public static String getResultStatusName(int status)
	{
		String resultName = null;
		
		if(status == 1)
		
			resultName="SUCCESS";
		
		else if(status ==2)
		
			resultName="FAILURE";
		else if (status ==3)
		
			resultName = "Skip";
		
		return resultName;
	}

}
