package com.selenium.basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FirstSeleniumTest
{
	
	@Test
	public void verifyFaceBookHomePage()
	{
		String URL = "https://www.facebook.com/";
		
		System.setProperty("webdriver.firefox.driver", "/MyFirstSeleniumProject/")
		
		WebDriver driver = new ChromeDriver();
		
		driver.get(URL);
		
		String pageTitle = driver.getTitle();
		
		System.out.println("We get the Title Like: "+pageTitle);
		
		Assert.assertEquals(pageTitle, "Facebook - log in or sign up");
		
		driver.close();
	}

}
