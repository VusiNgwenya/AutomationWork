package testnglearning;

import org.junit.jupiter.api.Test;

public class TestCase1 
{

	@Test(priority=2,dependsOnMethods="")
	public void doLogin()
	{
		System.out.println("Executing login test");
	}
	
	@Test(priority = 3, groups = "high")
	public void isSkip()
	{
		
	}
}
