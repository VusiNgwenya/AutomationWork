package com.w2a.rough;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.w2a.pages.HomePage;

public class FlightSearchTest {
	
	public static void main(String arg[])
	{
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir"));
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.expedia.co.in/");
		
		HomePage home = PageFactory.initElements(driver, HomePage.class);
		home.gotoFlights();
		
	}
	
	
	public void flightSearchTest()
	{
		
	}
	@Test
	public void doFlightSearch()
	{
		
	}

}
