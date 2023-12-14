package testnglearning;

import org.testng.annotations.Test;

import junit.framework.Assert;

import org.mockito.internal.exceptions.Reporter;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;

public class TestCase3
{
	
	@Test(priority=1,groups="med")
	public void doUserReg()
	{
		try {
		System.out.println("");
		Assert.fail("Failing user reg test");
		
		}
		catch(Throwable t)
		{
			Reporter.log("Capture screenshot");
		}
	}
	
	@Test(priority=2,dependsOnMethods="douserReg",groups="med")
	public void doLogin()
	{
		System.out.println("");
	}
	
	

}
