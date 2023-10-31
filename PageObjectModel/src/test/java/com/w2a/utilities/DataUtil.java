package com.w2a.utilities;

import org.apache.hc.core5.http.Method;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;

import com.w2a.base.BasePage;
import com.w2a.testcases.BaseTest;

public class DataUtil extends BasePage
{
	
	public DataUtil(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}


	@DataProvider(name="dp1")
	public Object[][] getData(Method m)
	{
		String sheetName = m.getName();
		
	}
	
	
	public void setUp(String browserName)
	{
		
	}

}
