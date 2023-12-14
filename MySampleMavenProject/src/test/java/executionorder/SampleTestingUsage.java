package executionorder;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class SampleTestingUsage 
{
	@BeforeTest
	public void beforeTest()
	{
		System.out.println("From BeforeTest annotation in SampleTestingUsage class ..");
	}
	
	@BeforeSuite
	public void beforeSuite()
	{
		System.out.println("From BeforeTest annotation in SampleTestingUsage class ..");
	}
}
