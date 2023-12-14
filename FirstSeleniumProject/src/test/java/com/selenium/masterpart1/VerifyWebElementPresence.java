package com.selenium.masterpart1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class VerifyWebElementPresence 
{

	WebDriver driver = null;
	
	@BeforeMethod
	public void openBrowser()
	{
		System.setProperty("webdriver.firefox.driver",
				"/FirstSeleniumProject/geckodriver");
		
		driver = new FirefoxDriver();
		
		driver.get("https`;//www.facebook.com");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		
	}
	
	@AfterMethod
	public void closeBrowser()
	{
		driver.quit();
	}
	
	public void verifyElementDisplay()
	{
	    WebElement resibleLink = driver.findElement(By.linkText("Resizable"));
	
	    System.out.println("Link is Enabled: "+resizablelink.isEnabled());
	    
	}
	
	@Test
	public void verifyElementSelected()
	{
		
	}
	
}
