package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage 
{
	@FindBy(id="email")
	public WebElement userName;
	
	public WebElement pass;
	
	public WebElement login;
	
	public WebElement driver;
	
	public HomePage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public void doLogin(String username,String password)
	{
		userName.sendKeys(username);
		pass.sendKeys(password);
		login.click();
	}
	
	public void createAccount(String firstName,String surName)
	{
		
	}
	
	public void validateLinks()
	{
		
	}

}
