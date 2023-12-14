package com.selenium.wait;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class ImplicitlyWaitClass 
{

	@Test
	public void testimplicitWait()
	{
		System.setProperty("webdriver.firefoxdriver", 
				"/MyFirstSeleniumProject/geckodriver");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		
		
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		WebElement searchBox = driver.findElement(By.xpath("//input[@name='q' and @title='Search']"));
		searchBox.sendKeys("Selenium-webdriver");
		
		WebElement searchResult = driver.findElement(By.xpath("li[@role='presentation'][4]"));
		searchResult.click();
		
		driver.quit();
		
	}
}
