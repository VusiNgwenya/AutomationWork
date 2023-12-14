package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestCase3 {
	
	@Test(priority=1,groups = {"function","smoke"})
	public void doUserReg()
	{
		System.out.println("Executing User Reg test");
		Assert.fail("User not registered successfully");
	}
	
	@Test(priority=2,dependsOnMethods="doUserReg",groups = {"function","smoke"})
	public void doLogin()
	{
		System.out.println("Executing login test");
	}
	
	@Test(priority=3,dependsOnMethods="doUserReg",alwaysRun=true)
	public void thirdTest()
	{
		System.out.println("Executing Third test");
	}
	
	@Test(priority=3,dependsOnMethods="doUserReg",groups = {"bvt"})
	public void fourthTest()
	{
		System.out.println("Executing Fourth test");
	}
	
	@Test(groups={"function","Smoke"})
	public void validateTitles()
	{
		SoftAssert softAssert=null;
		
		System.out.println("Beginning");
	   String expected_title = "Yahoo.com";
	   String actual_title= "Gmail.com";
	   
	   System.out.println("Validating title");
	  // Assert.assertEquals(actual_title, expected_title);
	   
	   
	   
	   softAssert.assertEquals(actual_title, expected_title);
	   System.out.println("Validating image");
	   softAssert.assertEquals(true,false);
	   
	   
	   /*if(expected_title.equals(actual_title))
	   {
		   System.out.println("Test case pass");
	   }
	   else
	   {
		   System.out.println("Test case failed");
	   }
	   
	   Assert.assertEquals(actual_title, expected_title);
	   
	   Assert.assertTrue(false,"Element not found");*/
	   
	   //Assert.fail("Failing the test as the condition is not met");
	   
	   Assert.assertEquals(true, false);
	   
	   System.out.println("validate text box presence");
	   softAssert.assertEquals(true, false,"text box not present");
	   
	   //Assert.assertEquals(true, false);
	   System.out.println("Ending");
	   
	   softAssert.assertAll();
	}

}
