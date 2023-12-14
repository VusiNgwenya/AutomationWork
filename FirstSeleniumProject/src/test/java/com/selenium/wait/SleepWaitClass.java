package com.selenium.wait;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class SleepWaitClass 
{

	@Test
	public void googleSearch()
	{
		System.setProperty("webdriver.firefox.driver", 
				"/MyFirstSeleniumProject/geckodriver");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.google.com");
		
		WebElement searchBox = driver.findElement(By.xpath("//input[@name='q' and @title='Search']"));
		searchBox.sendKeys("Selenium-webdriver");
		
		try
		{
			Thread.sleep(3000);
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
		
		WebElement searchResult = driver.findElement(By.xpath("//li[@role='presentation'][4]"));
		
		searchResult.click();
		
		driver.quit();
		
	}
}
