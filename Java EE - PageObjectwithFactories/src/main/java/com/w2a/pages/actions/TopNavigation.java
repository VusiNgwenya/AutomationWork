package com.w2a.pages.actions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.w2a.pages.SigninPage;

public class TopNavigation {
	
	public WebDriver driver;
	public String account;
	public String signinBtn;
	

	public TopNavigationLocators topNavigation;
	
	public TopNavigation(WebDriver driver)
	{
		this.topNavigation = new TopNavigationLocators();
		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver);
		PageFactory.initElements(factory, this.topNavigation);
		
	}
	
	public SigninPage gotoSignIn()
	{
		Page.click(topNavigation.account);
		page.click(topNavigation.signinBtn);
		
		return new SigninPage();
		
	}

}
