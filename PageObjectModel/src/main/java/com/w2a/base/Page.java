package com.w2a.base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Page 
{

	public WebDriver driver;
	
	public Page menu;
	
	public Page()
	{
		if(driver==null)
		System.setProperty("webdriver.firefox.driver", System.getProperty(""));
		driver = new FirefoxDriver();
		
		driver.get("http://zoho.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS)
		
	}
}
