package org.openqa.selenium.chrome;

import org.openqa.selenium.WebDriver;

public class ChromeDriver implements WebDriver{
	
	public ChromeDriver()
	{
		System.out.println("launching chrome");
	}
	
	public void get(String url)
	{
		System.out.println("Navigating to the URL in firefox");
	}

	public void getTitle()
	{
		System.out.println("Getting the title from the current page");
	}
	
	public void click()
	{
		System.out.println("Clicking on an Element in Chrome");
	}
	
	public void sendKeys()
	{
		System.out.println("Typing in an Element")
	}

}
