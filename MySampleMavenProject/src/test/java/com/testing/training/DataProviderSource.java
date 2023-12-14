package com.testing.training;

import org.testng.ITestContext;
import org.testng.annotations.DataProvider;

public class DataProviderSource
{
	
	@DataProvider(name="TestType")
	public static Object[][] getTestTypeData(ITestContext context)
	{
		String testName = context.getName();
		
		if("IntegrationLevel".equals(testName))
		{
			return new Object[][] {{"Integration test data"}};
		}
		else if("AcceptanceLevel".equals(testName))
		{
			return new Object[][] {{"Acceptance test data"}};
		}
		else
		{
			return new Object[][] {{"Common tets data"}};
		}
	}
	
	
	public class DataProviderSource
	{
		
		@DataProvider(name="TestType")
		public static Object[][] getTestTypeData(ITestContext context)
		{
			String testName = context.getName();
			
			if("IntegrationLevel".equals(testName))
			{
				return new Object[][] {{"Integration test data"}};
			}
			else if("AcceptanceLevel".equals(testName))
			{
				return new Object[][] {{"Acceptance test data"}};
			}
			else
			{
				return new Object[][] {{"Common tets data"}};
			}
		}

}
