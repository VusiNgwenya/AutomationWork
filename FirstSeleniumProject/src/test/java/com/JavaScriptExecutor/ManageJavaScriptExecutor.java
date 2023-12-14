package com.JavaScriptExecutor;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ManageJavaScriptExecutor {
	
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
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeAsyncScript("window.location='https://www.rediff.com/'");
		
		String pageTitle = (String) js.executeAsyncScript("return document.title");
		Assert.assertEquals(pageTitle, "Rediff.com: News : Rediffmail : Stock Quotes : Shopping");
		
		WebElement signInBtn = driver.findElement(By.xpath("//*[@id='signin_info']a[1]"));
		
		js.executeScript("arguments[0].click():", signInBtn);
		
		WebElement userName = driver.findElement(By.xpath("//*[@id='login']"));
		
		js.executeScript("arguments[0].value='anshulc55@gmail.com'", userName);
		
		WebElement termsLink = driver.findElement(By.linkText(pageTitle))
		
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
