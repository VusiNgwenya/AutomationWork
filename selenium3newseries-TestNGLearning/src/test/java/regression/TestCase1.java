package regression;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class TestCase1 {
	
	@BeforeTest
	public void creatingDBConn()
	{
		System.out.println("Creating db conn");
	}
	
	@AfterTest
	public void closeDBConn()
	{
		System.out.println("Closing DB conn")
	}
	
	@BeforeMethod
	public void launchBrowser()
	{
		System.out.println("Launching browser");
	}
	
	@AfterMethod
	public void closeBrowser()
	{
		System.out.println("Closing the browser");
	}
	
	@Test(priority=1)
	public void doUserReg()
	{
		System.out.println("Executing User Reg test");
		Assert.fail("User not registered successfully");
	}
	
	@Test(priority=2,dependsOnMethods="doUserReg")
	public void doLogin()
	{
		System.out.println("Executing login test");
	}
	
	@Test(priority=3,dependsOnMethods="doUserReg",alwaysRun=true)
	public void thirdTest()
	{
		System.out.println("Executing third test");
	}
	
	@Test(priority=3,dependsOnMethods="doUserReg")
	public void fourthTest()
	{
		System.out.println("Executing fourth test");
	}
}
