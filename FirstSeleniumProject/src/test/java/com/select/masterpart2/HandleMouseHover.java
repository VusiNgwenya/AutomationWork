package com.select.masterpart2;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HandleMouseHover {


	WebDriver driver = null;
	
	@BeforeMethod
	public void openBrowser()
	{
		System.setProperty("webdriver.firefox.driver",
				"/FirstSeleniumProject/geckodriver");
		
		driver = new FirefoxDriver();
		
		driver.get("https://www.w3scholls.com/tryit.aps?filename=tryhtml_select_multiple");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
	}
	
	@BeforeMethod
	public void closeBrowser()
	{
		driver.quit();
	}
	
	@Test
	public void handleFacebook()
	{
		driver.get("https://facebook.com");
		
		String mainPageWindow = driver.getWindowHandle();
		
		System.out.println(mainPageWindow);
		
		driver.findElement(By.linkText("Forgotten account?")).click();
		
		String forgotAccountPage = driver.getWindowHandle();
	}
	
	@Test
	public void handleMouseHoverOnClick()
	{
		driver.get("https://www.jobserve.com");
		
		String mainPageWindow = driver.getWindowHandle();
		
		System.out.println("Main Page ID of JobServe"+mainPageWindow);
		
		driver.findElement(By.id("SPTPosTitleLink")).click();
		
		
		Set<String> windowIDs = driver.getWindowHandles();
		Iterator<String> itr = windowIDs.iterator();
		
		
		String mainPageID = itr.next();
		String jobPageID = itr.next();
		
		driver.switchTo().window(jobPageID);
		
		String JobHeading = driver.findElement(By.id("md_visareq")).getText();
		System.out.println(JobHeading);
		
		
		
		
		
		String CurrentWindow = driver.getWindowHandle();
		
		System.out.println("Current Page ID : "+CurrentWindow);
		
		String JobHeading = driver.findElement(By.id("md_visareq")).getText();
		System.out.println(JobHeading);
		
		
		
	}
}
