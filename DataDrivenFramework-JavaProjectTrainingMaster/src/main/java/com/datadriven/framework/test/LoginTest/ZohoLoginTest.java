package com.datadriven.framework.test.LoginTest;

import java.util.Hashtable;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ZohoLoginTest extends BaseUI
{

	@Test(dataProvider="getDatadoZohoLoginTest")
	public void doZohoLoginTest(Hashtable<String, String> dataTable)
	{
		logger = report.createTest("Zoho Login Test Case : "+dataTable.get("Comment"));
		
		invokeBrowser("chrome");
		openURL("websiteURL");
		elementClick("zohoLoginTextBox_ClassName");
		enterText("zohoUsernameTextBox_Id","USER_ID",dataTable.get("UserName"));
		enterText("zhPasswordTB_Id","PASSWORD",dataTable.get("Password"));
		elementClick("zhSignBtn_id");
		verifyPageTitle(dataTable.get("PageTitle"));
		
	}
	
	@DataProvider
	public Object[][] getDataZohoLoginTest()
	{
		return testDataProvider.getTestData("ZohoTestData.xlsx", "LoginTest", "doZohoLoginTest");
	}
}
