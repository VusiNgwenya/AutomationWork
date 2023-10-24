package com.w2a.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.w2a.base.TestBase;



public class BankManagerLoginTest extends TestBase{
	
	@Test
	public void loginAsBankManager() throws InterruptedException
	{
		log.debug("Inside Login Test");
		
		driver.findElement(By.cssSelector(OR.getProperty("")));
		//driver.findElement(By.xpath(OR.getProperty("bmlBtn"))).click();
		Assert.assertTrue(isElementPresent(By.cssSelector(OR.getProperty("addCustBtn"))));
		Thread.sleep(3000);
		
		log.debug("Login successfully executed ");
	}

}
