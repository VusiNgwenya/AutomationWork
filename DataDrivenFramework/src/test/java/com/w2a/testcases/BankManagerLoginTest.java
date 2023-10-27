package com.w2a.testcases;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Reporter;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.w2a.base.TestBase;

import zmq.ZError.IOException;



public class BankManagerLoginTest extends TestBase{
	
	@Test
	public void BankManagerLoginTest() throws InterruptedException
	{
		try
		{
			verifyEquals("xss","cdd");
			log.debug("Inside Login Test");
			
			click("bmlBtn_CSS");
			
			log.debug("Inside Login Test");
			
			System.out.println("Assertion");
			
			Assert.assertEquals(false, null);
			
			driver.findElement(By.cssSelector(OR.getProperty("")));
			//driver.findElement(By.xpath(OR.getProperty("bmlBtn"))).click();
			AssertJUnit.assertTrue(isElementPresent(By.cssSelector(OR.getProperty("addCustBtn"))));
			Thread.sleep(3000);
			
			
			
			log.debug("Login successfully executed ");
			Reporter.log("Login successfully executed ");
			Reporter.log("<a href=\"F:\\screenshot\\error.jpg\">Screenshot</a>");
		}
		catch(IOException e)
		{ 
			e.printStackTrace();	
		}
		
	}

}
