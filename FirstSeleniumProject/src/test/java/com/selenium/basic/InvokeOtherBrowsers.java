package com.selenium.basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class InvokeOtherBrowsers 
{

	@Test
	public void verifyFaceBookHomePage()
	{
		String URL = "https://www.facebook.com";
		
		System.setProperty("webdriver.opera.driver", "/MyFirstSeleniumProject/operadriver");
		
		WebDriver driver = new OperaDriver();
		
        System.setProperty("webdriver..driver", "/MyFirstSeleniumProject/geckodriver");
		
		WebDriver driver = new FirefoxDriver();
		
		
		driver.manage().window().maximize();
		
		driver.get(URL);
		
		String pageTitle = driver.getTitle();
		
		System.out.println("We get the title like: "+pageTitle);
		
		Assert.assertEquals(pageTitle, "Facebook - log in or sign up");
		
		driver.close();
	}
	
}
