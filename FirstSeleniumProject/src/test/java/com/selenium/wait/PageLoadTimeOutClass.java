package com.selenium.wait;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class PageLoadTimeOutClass {

	@Test
	public void pageLoadTimeOutTest()
	{
		System.setProperty("webdriver.firefox.driver", 
				"/MyFirstSeleniumProject/geckodriver");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://edition.cnn.com/");
		
		driver.quit();
	}
}
