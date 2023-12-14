package com.selenium.basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.Test;

public class OptionsClassSelenium {

	@Test
	public void sampleOptionsSetBinary()
	{
		//System.setProperty("webdriver.firefox.driver", "/MyFirstSeleniumProject/geckodriver");
		
		/*FirefoxOptions fo = new FirefoxOptions();
		
		fo.sampleOptionsSetBinary();*/
		
		System.setProperty("webdriver.chrome.driver", "/MyFirstSeleniumProject/chromedriver");
		
		ChromeOptions fo = new CHromeOptions();
		
		fo.setBinary("/MyFirstSeleniumProject/");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://google.com");
		
	}
	
}
