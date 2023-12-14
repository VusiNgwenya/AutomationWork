package executeFailedTests;

import org.testng.annotations.Test;

public class SampleTestClass1 
{

	@Test(retryAnalyzer = Retry.class)
	public void firstTest()
	{
		System.out.println("My First Test");
	}
	
	@Test(retryAnalyzer = Retry.class)
	public void secondTest()
	{
		int i = 1/0;
		System.out.println("My second Test");
	}
}
