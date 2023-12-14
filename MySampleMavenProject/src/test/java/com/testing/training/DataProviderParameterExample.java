package com.testing.training;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class DataProviderParameterExample 
{

	@Test
	public void scenario1(String scenarioData)
	{
		System.out.println("Scenario testing : Data("+scenarioData+")");
	}
	
	@Test
	public void scenario2(String scenarioData)
	{
		System.out.println("Scenario testing : Data("+scenarioData+")");
	}
	
	@Test
	public void commonsScenarios(String scenarioData)
	{
		System.out.println("Scenario testing : Data("+scenarioData+")");
	}
	
	
}
