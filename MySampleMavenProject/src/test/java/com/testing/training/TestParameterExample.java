package com.testing.training;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestParameterExample 
{

	@Test(dataProvider="getDataSet")
	public void testAddition(int actual,int expected)
	{
		int actualValue = actual + 20;
		
		AssertJUnit.assertEquals(actualValue, expected);
	}
	
	@DataProvider
	public Object[][] getData()
	{
		return new Object[][]
				{
		         	{100,120},
		         	{200,220},
		         	{250,270},
		         	{300,310},
		         	{400,420},
				};
	}
	
	@DataProvider(name="DoubleSet")
	public Object[][] getDataSet()
	{
		return new Object[][]
				{
		         	{100,120},
		         	{200,220},
		    
				};
	}
}
