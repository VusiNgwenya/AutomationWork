package com.selenium.masterpart1;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ExtractSspecificElementOnWebPage 
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
	public void getElements()
	{
		WebElement topStories = driver.findElement(By.xpath("//*[@id='intl_homepage1-zone']/div[1]/div[2]"));
		
		List<WebElement> topStoriesLink = topStories.findElements(By.tagName("q"));
		
		System.out.println("Number of Top Stories on ONN are "+topStoriesLink.size());
	
	}
}
