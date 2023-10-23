package org.openqa.selenium.firefox;

import org.openqa.selenium.WebDriver;

public class FirefoxDriver implements WebDriver{
	
	public void FirefoxDriver()
	{
		System.out.println("Launching firefox");
	}

	public void get(String url)
	{
		System.out.println("navigating to the URL in firefox");
	}

	public void getTitle()
    {
	    System.out.println("Getting  the title from the current page");
    }
	
	public void click()
	{
		System.out.println("Clicking on an Element");
	}
	
	public void sendKeys()
	{
		System.out.println("Typing in an Element");
	}

}
