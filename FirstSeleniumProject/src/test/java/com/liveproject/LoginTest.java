package com.liveproject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class LoginTest 
{
	WebDriver driver = null;

	@Test
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
	public void loginRediff()
	{
		driver.get("https://www.rediff.com/");
		
		driver.findElement(By.xpath("/html/body/div[1]/div/dvi[2]/a[2]")).click();
		
		driver.findElement(By.xpath("//*[@id='signin_info']")).click();
		
		driver.findElement(By.xpath("//*[@id='usermail']")).sendKeys("anshulc55@rediff.com");
		
		driver.findElement(By.xpath("//*[@id='emailsubmit']")).click();
		
		driver.findElement(By.xpath("//*[@id='userpass']")).sendKeys("Test@1234");
		
		driver.findElement(By.xpath("//*[@id='userpadd']")).sendKeys(Keys.ENTER);
		
		driver.findElement(By.xpath("//*[@id='username']/a")).isDisplayed();
		
		try
		{
			Thread.sleep(5000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	
}
