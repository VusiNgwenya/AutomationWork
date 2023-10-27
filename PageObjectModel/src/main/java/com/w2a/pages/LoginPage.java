package com.w2a.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.w2a.base.Page;

public class LoginPage extends Page{
	
	//public static WebDriver driver;
	
	public LoginPage(WebDriver driver)
	{
		
	}
	
	

	public void doLogin(String username,String password)
	{
		driver.switchTo().frame("zohoiam");
		driver.findElement(By.cssSelector("#id")).sendKeys(username);
		driver.findElement(By.cssSelector("#pwd")).sendKeys(password);
		driver.findElement(By.cssSelector("#submit_but")).click();
	}

	public void gotoSalesandMarketing()
	{
			
	}
	
	public void gotoFinance()
	{
		
	}
	
	public void gotoHome()
	{
		
	}
	
	public void gotoFeeds()
	{
		
	}
	
	public void gotoLeads()
	{
		
	}
	
	public void gotoAccount
}
