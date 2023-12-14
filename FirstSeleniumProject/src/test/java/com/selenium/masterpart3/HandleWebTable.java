package com.selenium.masterpart3;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HandleWebTable 
{

	WebDriver driver = null;
	
	@BeforeMethod
	public void openBrowser()
	{
	    System.setProperty("webdriver.firefox.driver",
	    		"/FirstSeleniumProject/geckodriver");
	    
	    driver = new FirefoxDriver();
	    
	    driver.manage().window().maximize();
	    
	    driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS); 
	}
	
	@AfterMethod
	public void closeBrowser()
	{
		driver.quit();
	}
	
	@Test
	public void manageWebTable()
	{
		driver.get("https://www.rediff.com/");
		
		driver.findElement(By.xpath("//*[@id='Homewrapper']/div[5]/a[3]/div/u")).click();
		
		driver.findElement(By.xpath("//*[@id='moremoney']/ul/li[3]/a"));
		
		driver.findElement(By.xpath("//*[@id='showMoreLess']"));
		
	}
}
