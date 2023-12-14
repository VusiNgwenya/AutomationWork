package com.selenium.masterpart1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SelectDropDown 
{

WebDriver driver = null;

	
	@BeforeMethod
	public void openBrowser()
	{
		System.setProperty("webdriver.firefox", 
				"/FirstSeleniumProject/geckodriver");
		
		driver = new FirefoxDriver();
		
		driver.get("https://edition.cnn.com");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
	}
	
	@AfterMethod
	public void closeBrowser()
	{
		driver.quit();
	}
	
	@Test
	public void SelectDOB()
	{
		WebElement monthDropDown = driver.findElement(By.name("birthday_month"));
		
	    Select select = new Select(monthDropDown);
	    
	    select.deselectByIndex(5);
	    
	    try
	    {
	    	Thread.sleep(4000);
	    }
	    catch(Exception e)
	    {
	    	e.printStackTrace();
	    }
	    
	    select.selectByValue("11");
	    
	    try
	    {
	    	Thread.sleep(4000);
	    }
	    catch(Exception e)
	    {
	    	e.printStackTrace();
	    }
	    
	    select.deselectByVisibleText("Sept");
	    
	    try
	    {
	    	Thread.sleep(4000);
	    }
	    catch(Exception e)
	    {
	    	e.printStackTrace();
	    }
	    
	   List<WebElement> monthValues = select.getOptions();
	   
	   for(WebElement month : monthValues)
	   {
		   System.out.println(month.getText());
	   }
	    
	    
	}
}
