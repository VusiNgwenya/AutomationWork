package com.w2a.base;

import org.openqa.selenium.By;

public class TopMenu extends Page
{

	public void gotoLeads()
	{
		
	}
	
	public void gotoHome()
	{
		
	}
	
	public void gotoFeeds()
	{
		
	}
	
	public AccountsPage gotoAccounts()
	{
		 click("accountTab_CSS");
		
		return new AccountsPage()
	}
	
	public void gotoContacts()
	{
		
	}
}
