package com.selenium.wait;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ExplicitWaitClass 
{
	
	WebDriver driver = null;
	
	@BeforeMethod
	public void setUp()
	{
		System.setProperty("webdriver.firefox.driver", 
				"/MyFirstSeleniumProject/geckodriver");
		
		driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		
		driver.get("file://Users/ansul/Trainings/Selenium/Waits%20in%20Selenium/ExplicitWait.html");
		
	}
	
	@AfterMethod
	public void closeBrowser()
	{
		driver.quit();
	}
	
	@Test
	public void verifyAlert()
	{
		WebElement alertBtn = driver.findElement(By.xpath("//button[@id='alert']"));
		alertBtn.click();
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		
		wait.until(ExpectedConditions.alertIsPresent());
		
		
		driver.switchTo().alert().accept();
		
	}
	
	@Test
	public void verifyElementClickable()
	{
		driver.findElement(By.id("display-other-button"));
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeSelected(driver.findElement(By.xpath("//input[@type='checkbox']"))));
		
	}
	
	@Test
	public void verifyPresentText()
	{
		driver.findElement(By.id("populate-text")).click();
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		
		wait.until(ExpectedConditions.textToBePresentInElementValue(driver.findElement(By.xpath("//h2[@class='target-text']")), null));
		
		
	}
	
	@Test
	public void verifyElementVisibility()
	{
		driver.findElement(By.id("display-other-button")).click();
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("hidden")));
	}

}
