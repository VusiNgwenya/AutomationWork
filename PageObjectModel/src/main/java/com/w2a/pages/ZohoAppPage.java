package com.w2a.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.w2a.pages.crm.CRMHomePage;

public class ZohoAppPage 
{
	
	WebDriver driver;
	
	public ZohoAppPage(WebDriver driver)
	{
	   this.driver = driver;	
	} 
	
	public void gotoChat()
	{
		driver.findElement(By.xpath(".zicon-apps-chat.zicon-apps-96")).click();
	}
	
	public CRMHomePage gotoCRM()
	{
		driver.findElement(By.xpath(".zicon-apps-crm.zicon-apps-96")).click();
		
		return new CRMHomePage();
	}
	
	public void gotoSalesIQ()
	{
		driver.findElement(By.xpath(".zicon-apps-salesiq.zicon-apps-96")).click();
	}

}
