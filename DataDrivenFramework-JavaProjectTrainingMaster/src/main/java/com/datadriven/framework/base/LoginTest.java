package com.datadriven.framework.base;

import org.apache.log4j.Logger;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import com.datadriven.framework.test.LoginTest.BaseUI;

import overriding.Base;

public class LoginTest extends BaseUI{
	
	
	
	@Test
	public void testOne()
	{
		logger = report.createTest("Login Rediff Money DashBoard");
		
		logger.log(Status.INFO, "Initializing the Browser");
		invokeBrowser("Chrome");

		logger.log(Status.INFO, "Opening the WebSite");
		openURL("https://www.rediff.com/");
		
		logger.log(Status.INFO, "Click on Sign-In Button");
		elementClick("//*[@id='signin_info']/a[1]");
		

		logger.log(Status.INFO, "Entering Email & Password");
		enterText("usernameTextbox_Id","anshulc55");
		enterText("passwordTextb0x_CSS","PasswordText");
		//tearDown();
		
		takeScreenShotOnFailure();
	}
	
	@AfterTest
	public void endReport()
	{
		report.flush();
	}
	
	@Test(dependsOnMethods="testOne")
	public void testTwo()
	{
		invokeBrowser("Chrome");
		openURL("https://www.rediff.com/");
		elementClick("//*[@id='signin_infp']/a[1]");
		enterText("usernameTextbox_Xpath","anshulc55");
		tearDown();
	}
	
	@Test(dependsOnMethods="testTwo")
	public void testThree()
	{
		invokeBrowser("Chrome");
		openURL("https://www.rediff.com/");
		elementClick("//*[@id='signin_info']/a[1]");
		enterText("usernameTextbox_Xpath","anshulc55");
		tearDown();
	}

}
