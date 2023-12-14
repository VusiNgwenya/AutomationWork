package com.testing.listeners;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SampleTestClass 
{

	@Test
	public void testOne()
	{
		System.out.println("I am TestOne");
	}
	
	@Test(dataProvider = "dataprovider")
	public void testGetData(String s)
	{
		System.out.println("Test GetData method, input = "+s);
	}
	
	@DataProvider
	public Object[][] dataProvider()
	{
		return new Object[][] {"A","B"};
	}
	
	@Test
	public void testThree()
	{
		AssertJUnit.assertEquals(5, 7);
	}
	
	@Test
	public void testFour()
	{
		System.out.println("I am testFour");
		throw new SkipException(null);
	}
}
