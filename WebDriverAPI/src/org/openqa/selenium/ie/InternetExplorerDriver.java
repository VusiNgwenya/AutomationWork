package org.openqa.selenium.ie;

import org.openqa.selenium.WebDriver;

public class InternetExplorerDriver implements WebDriver{
	
	public InternetExplorerDriver()
	{
		System.out.println("Launching Internet Explorer");
	}

	public void get(String url)
	{
		System.out.println("Navigating to the URL in IE");
	}
	
	public void getTitle()
	{
		System.out.println("getting the title from the current page in an Element");
	}
	
	public void click()
	{
		System.out.println("Clicking on an Element in Chrome");
	}
	
	public void sendKeys()
	{
		System.out.println("Typing in an Element in Chrome");
	}
}
