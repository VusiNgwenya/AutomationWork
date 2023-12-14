package com.w2a.testcases;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.w2a.base.TestBase;
import com.w2a.utilities.ExcelReader;
import com.w2a.utilities.TestUtil;

import graphql.org.antlr.v4.runtime.atn.SemanticContext.OR;

public class OpenAccountTest extends TestBase{
	
	
	@Test(dataProviderClass=TestUtil.class,dataProvider="dp")
	public void openAccountTest(String customer,String currency) throws InterruptedException
	{
		click("openaccount_CSS");
		select("customer_CSS",customer);
		select("currency_CSS",customer);
		click("button[type='submit']");
		Thread.sleep(2000);
		
		Alert alert = wait.until(ExpectedConditions.alertIsPresent());
		alert.accept();
		
		Assert.fail("Customer not added successfully");
		
		Thread.sleep(2000);
	}
	
	@Test(dataProvider="getData")
	public void addCustomer(String firstName,String lastName,String postalCode)
	{
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
