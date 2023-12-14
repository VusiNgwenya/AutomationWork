package com.testing.training;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MultiTestDependency 
{

	@Test
	public void start()
	{
		System.out.println("Starting the server");
	}
	
	
	@Test(dependsOnMethods="start")
	public void init()
	{
		System.out.println("Initializing the data for processing!");
	}
	
	@Test(dependsOnMethods="init")
	public void process()
	{
		AssertJUnit.assertTrue(false);
		System.out.println("Initializing the data for processing!");
	}
	
	@Test(dependsOnMethods={"process","init"})
	public void stop()
	{
		AssertJUnit.assertTrue(false);
		System.out.println("Initializing the data for processing!");
	}
	
	
	
	
	
}
