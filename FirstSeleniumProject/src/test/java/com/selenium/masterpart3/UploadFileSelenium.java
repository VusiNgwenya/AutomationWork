package com.selenium.masterpart3;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class UploadFileSelenium 
{
	
	WebDriver driver = null;
	
	
	@BeforeMethod
	public void openbrowser()
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
	public void testUploadFunction()
	{
		driver.get("http://the-internet.herokuapp.com/upload");
		
		WebElement uploadBtn = driver.findElement(By.id("file-upload"));
	    String filePath = "/FirstSeleniumProject/";
	    
	    uploadBtn.sendKeys(filePath);
	    
	    try
	    {
	    	Thread.sleep(5000);
	    }
	    catch(Exception e)
	    {
	    	e.printStackTrace();
	    }
	    
	    driver.findElement(By.id("file-submit")).click();
	    
	    String confirmationTxt = driver.findElement(By.xpath("//*[@id='content']/div/h3")).getText();
	    
	    Assert.assertEquals(confirmationTxt, "File Uploaded!");
	    
	    try
	    {
	    	Thread.sleep(5000);
	    }
	    catch(InterruptedException e)
	    {
	    	e.printStackTrace();
	    }
	    
	    
	}
	

}
