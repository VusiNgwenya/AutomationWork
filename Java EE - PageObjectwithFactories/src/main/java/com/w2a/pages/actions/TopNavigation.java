package com.w2a.pages.actions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class TopNavigation {
	
	public WebDriver driver;

	public TopNavigationLocators topNavigation;
	
	public TopNavigation(WebDriver driver)
	{
		this.topNavigation = new TopNavigationLocators();
		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver);
		PageFactory.initElements(factory, this.topNavigation);
		
	}
	
	public SigninPage gotoSignIn()
	{
		
	}

}
