package com.w2a.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
	
	WebDriver driver;
	LoginPage login;
	
	public HomePage(WebDriver driver)
	{
		this.driver = driver;
	}
	public void goToSupport()
	{
		driver.findElement(By.cssSelector(".signing>a:nth-child(2)")).click();
	}
	
	public void goToSignUp()
	{
		driver.findElement(By.cssSelector(".signup")).click();
	}
	
	public LoginPage goToLogin()
	{
		driver.findElement(By.cssSelector(".signin")).click();
		return login;
	}
	
	public void goToZohoEdu()
	{
		
	}
	
	public void goToLearnMore()
	{
		
	}
	
	public void validateFooterLinks()
	{
		
	}

}
