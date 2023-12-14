package com.w2a.testcases;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.w2a.base.TestBase;
import com.w2a.utilities.ExcelReader;

import graphql.org.antlr.v4.runtime.atn.SemanticContext.OR;

public class AddCustomerTest extends TestBase{
	
	
	@Test(dataProvider=TestUtil.class,dataProvider)
	public void addCustomer(String firstName,String lastName,String postalCode,String alertText,String runMode)
	{
		if(runMode.equals("Y"))
		{
			throw new SkipException("Skipping the test case as the Run mode")
		}
		
		
		click("addCustBtn");
		type("firstname_CSS",firstName);
		type("firstname_XPATH",firstName);
		type("firstname_ID",firstName);
		click("addBtn_CSS");

		
		driver.findElement(By.cssSelector(OR.getProperty("AddCustbtn"))).click();
		driver.findElement(By.cssSelector(OR.getProperty("AddCustbtn"))).sendKeys("");
		driver.findElement(By.cssSelector(OR.getProperty("AddCustbtn"))).sendKeys("");
		
	}
	
	@DataProvider
	public Object[][] getData()
	{
		int rows = excel.getRowCount(sheetName);
		int cols = excel.getColumnCount(sheetName);
		
		Object[][] data = new Object[rows-1][cols];
		
		for(int rowNum=2;rowNum <= rows;rowNum++)
		{
			data[rowNum -2][colNum] = excel.getCellData(sheetName,col)
		}
		
		return data;
	}

}
