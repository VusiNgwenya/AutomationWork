package com.liveproject;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AddDeleteStockInPortfolio 
{
	WebDriver driver = null;
	
	
	
	@Test
	public void addStockTest()
	{
		System.setProperty("webdriver.firefox.driver",
				"/FirstSeleniumProject/geckodriver");
		
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(180,TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(180,TimeUnit.SECONDS);
		
		driver.get("https://rediff.com/");
		
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/a[2]"));
		
		driver.findElement(By.xpath("//*[@id='signin_info']/a[1]")).click();
		
		driver.findElement(By.xpath("//*[@id='usermail']")).sendKeys("Anshulc55@rediffmail.com");
		
		driver.findElement(By.xpath("//*[@id='emailsubmit']")).click();
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//*[@id='userpass']"))));
		
		driver.findElement(By.xpath("//*[@id='userpass']")).sendKeys("Test@1234");
		
		driver.findElement(By.xpath("//*[@id='userpass']")).sendKeys(Keys.ENTER);
		
		WebElement dropdown = driver.findElement(By.id("portfolioid"));
		
		Select select = new Select(dropdown);
		
		select.deselectByVisibleText("Test1");
		
		driver.findElement(By.id("addStock")).click();
		driver.findElement(By.id("addstockname")).sendKeys("Nestle India Ltd");
		//driver.findElement(By.id("stockAddname")).sendKeys("");
		
		
		driver.findElement(By.id("stockPurchaseDate")).click();
		selectDateIncalendar("13/06/2017");
		
		driver.findElement(By.id("addstockqty")).sendKeys("150");
		driver.findElement(By.id("addstockprice")).sendKeys("10000");
		
		driver.findElement(By.id("addStockButton")).click();
		
		//String stockName = driver.findElement(By.xpath("//table[@id='stock']/tbody/tr[2]/td[2]/span/a")).getText();
		
		//Assert.assertEquals(stockName, "Nestle India");
		
		int stockRowNum = getStockRowNumber("Nestle India");
		
		if(stockRowNum ==-1)
		{
			Assert.fail("Stock not found");
		}
		
	}
	
	public void deleteStock()
	{
		int stockRowNum = getStockRowNumber("Nestle India");
		driver.findElement(By.xpath("//table[@id='stock']/tbody/tr["+stockRowNum+"]/td[1")).click();
		driver.findElements(By.xpath("//input[@name='Delete']")).get(stockRowNum-1).click();
	}
	
	public int getStockRowNumber(String StockName)
	{
		List<WebElement> totalRows = driver.findElements(By.xpath("//table[@id='stock']/tbody/tr"));
		
		int rowNum = 1;
		
		for(WebElement row; totalRows)
		{
			List<WebElement> rowCells = row.findElements(By.tagName("td"));
			rowNum++;
			
			for(WebElement cell : rowCells)
			{
				String cellData = cell.getText();
				
				System.out.println(cellData);
				//return rowNum;
			}
		}
		
		return -1;
	}
	
	public void waitForpageLoad() throws InterruptedException
	{
		int i=0;
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		while(i !=20)
		{
			String pageState = (String) js.executeScript("return document.readyState;");
			System.out.println(pageState);
			
			if(pageState.equals("complete"))
			{
				Thread.sleep(1000);
			}
			else
			{
				try
				{
					Thread.sleep(1000);
				}
				catch(InterruptedException e)
				{
					e.printStackTrace();
				}
			}
		}
	}
	
	public void waitLoad(int i)
	{
		try
		{
			Thread.sleep(i*100);
		}
		catch(Exception e)
		{
			
		}
	}
	
	/***************************  Select Fae *************************/
	
	public void selectDateIncalendar(String date)
	{
		Date currentDate = new Date();
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		
		try
		{
			Date expectedDate = dateFormat.parse(date);
			
			String day = new SimpleDateFormat("dd").format(expectedDate);
			String month = new SimpleDateFormat("MMMM").format(expectedDate);
			String year = new SimpleDateFormat("yyyy").format(expectedDate);
			
			String expectedMonthYear = month+" "+year;
			
			//System.out.println(expectedMonthYear);
			
			while(true)
			{
				String displayDate = driver.findElement(By.className("dpTitletext")).getText();
				
				if(expectedMonthYear.equals(displayDate))
				{
					break;
				}
				else if(expectedDate.compareTo(currentDate) > 0)
				{
					driver.findElement(By.xpath("//*[@id='datepicker']/table/tbody/tr[1]/td[4]/button"));
				}
				else
				{
					driver.findElement(By.xpath("//*[@id='datepicker']/table/tbody/tr[1]/td[2]/button"));
				}
			}
			
		}
		catch(ParseException e)
		{
			e.printStackTrace();
		}
		
		
		
		//dateFormat

	}

}
