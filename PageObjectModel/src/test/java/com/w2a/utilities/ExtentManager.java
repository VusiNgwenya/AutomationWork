package com.w2a.utilities;

import com.aventstack.extentreports.ExtentReports;

public class ExtentManager {
	
	public static ExtentReports extent;
	public static String fileName;
	
	
	public static ExtentReports getInstance()
	{
		if(extent == null)
		{
			extent = new ExtentReports(System.getProperty("user.dir")+"\\target\\surefire-reports\\html\\extent.html",true,DisplayOrder.OLDEST_FIRST);
			extent.loadConfig(System.getProperty("user.dir")+"\\src\\test\\resources\\extentconfig\\ReportsConfig.xml");
		}
		
		return extent;
	}
	

}
