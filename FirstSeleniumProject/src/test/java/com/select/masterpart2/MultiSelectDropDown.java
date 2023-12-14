package com.select.masterpart2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;

public class MultiSelectDropDown 
{
	
	WebDriver driver = null;

	@BeforeMethod
	public void openBrowser()
	{
		System.setProperty("webdriver.firefox.driver",
				"/FirstSeleniumProject/geckodriver");
		
		driver = new FirefoxDriver();
		
		driver.get("https://www.facebook.com");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	}
	
	@BeforeMethod
	public void closeBrowser()
	{
		driver.quit();
	}
	
	public void selectMultiSelectDropDown()
	{
		driver.switchTo().frame("iframeResult");
		
		WebElement multiSelect = driver.findElement(By.name("cars"));
		
		Select select = new Select(multiSelect);
		
		System.out.println(select.isMultiple());
		
		select.selectByIndex(1);
		
		select.selectByIndex(3);
		
		try
		{
			Thread.sleep(4000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		System.out.println(select.getFirstSelectedOption().getText());
		
		System.out.println("**********************");
		
		select.deselectAll();
		
		try
		{
			Thread.sleep(4000);
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
		
		
	}
}
