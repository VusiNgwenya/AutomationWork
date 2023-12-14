package com.liveproject;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CreatePortfolio
{
	
	WebDriver driver = null;
	

	public void openBrowser()
	{
		System.setProperty("webdriver.firefox.driver", 
				"/FirstSeleniumProject/geckodriver");
		
		driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(180,TimeUnit.SECONDS);
		
		driver.manage().timeouts().pageLoadTimeout(180,TimeUnit.SECONDS);
		
	}
	
	@Test(priority=1)
	public void testCreatePortfolio()
	{
		driver.get("https://www.rediff.com/");
		
		driver.findElement(By.xpath("/html/tbody/div[1]/div/div[2]/a[2]"));
		
		driver.findElement(By.xpath("//*[@id='signin_info']/a[1]")).click();
		
		driver.findElement(By.xpath("//*[@id='useremail']")).sendKeys("anshulc55@rediffmail.com");
		
		driver.findElement(By.xpath("//*[@id='emailsubmit']"));
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		
		
		driver.findElement(By.id("create")).clear();
		driver.findElement(By.id("create")).sendKeys("AnshulTestPortfolio");
		
		driver.findElement(By.id("createPortfolioButton")).click();
	}
	
	@Test(priority=2)
	public void testportfolioVerification()
	{
		WebElement portfolioDropdown = driver.findElement(By.id("portfolioid"));
		
		Select select = new Select(portfolioDropdown);
		
		String portfolioName = select.getFirstSelectedOption().getText();
		
		Assert.assertEquals(portfolioName, "AnsulTestPortfolio");
		
	}
	
	public void waitforElement(String xpath,String elementValue)
	{
		int i=0;
		while(i!=10)
		{
			WebElement portfolioDropdown = driver.findElement(By.xpath(xpath));
			
			Select select = new Select(portfolioDropdown);
			
			String portfolioName = select.getFirstSelectedOption().getText();
			
			if(portfolioName.equalsIgnoreCase(elementValue))
			{
				return;
			}
			else
			{
				try
				{
					Thread.sleep(2000);
				}
				catch(InterruptedException e)
				{
					e.printStackTrace();
				}
				
				i++;
			}
			
		}
		
		Assert.assertTrue(false,"The Given Text "+elementValue+" is not present in portfolio Dropdown");
	}
}
