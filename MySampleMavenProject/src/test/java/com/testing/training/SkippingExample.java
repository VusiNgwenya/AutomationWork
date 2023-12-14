package com.testing.training;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class SkippingExample
{

	@Test
	public void testOne()
	{
		System.out.println("Hi, I am Test One ....");
	}
	
	@Test(enabled=true)
	public void testTwo()
	{
		System.out.println("Hi, I am Test Two ....");
	}
	
	
	@Test
	public void testThree()
	{
		System.out.println("Hi, I am Test Three ....");
	}
	
	@Test
	public void testFour()
	{
		System.out.println("Hi, I am Test Four ....");
	}
	
}
