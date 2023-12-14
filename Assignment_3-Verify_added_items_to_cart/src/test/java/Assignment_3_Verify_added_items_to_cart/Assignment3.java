//Selenium 4 WebDriver with java(Basics + Advance + Architect) - Section 28 - Assignment 3 - Verify added items to the cart - Vusi Ngwenya

package Assignment_3_Verify_added_items_to_cart;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class Assignment3
{
	public static WebDriver driver = null;
	
	@BeforeTest
	public void setWebDriver()
	{
		System.setProperty("webdriver.firefox.driver","/Assignment_3-Verify_added_items_to_cart");
	}
	
	@Test(priority = 1)
	public void launchWebDriver()
	{
		driver = new FirefoxDriver();
	}

	@Test(priority = 2,dependsOnMethods = {"launchWebDriver"})
	public void launchBrowser()
	{
		driver.get("https://www.amazon.in/");
	}
	
	@Test(priority = 3,dependsOnMethods = {"launchBrowser"})
	public void clickAndSearchIcon() throws InterruptedException
	{
		
	  WebElement searchBox = driver.findElement(By.xpath("//*[@id='twotabsearchtextbox']"));
	  
	  searchBox.click();
	  
	  searchBox.sendKeys("iPhone 14 max pro");
	  
	  Thread.sleep(4000);
	
	}
	
	@Test(priority = 4,dependsOnMethods = {"clickAndSearchIcon"})
	public void selectItem() throws InterruptedException
	{
		
		WebElement item = driver.findElement(By.xpath("/html/body/div[1]/header/div/div[2]/div/div[2]/div/div[1]/div[1]/div/div"));
		
		item.click();
		
	}
	
	@Test(priority = 5,dependsOnMethods = {"selectItem"})
	public void searchPhoneFromList() throws InterruptedException
	{
		  
		Thread.sleep(5000);
			
		WebElement phone = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[1]/div/span[1]/div[1]/div[3]/div/div/div/div/div/div/div/div[1]/div/div[2]/div/span/a/div/img"));
		
		phone.click();
	}
		
	@Test(priority = 6,dependsOnMethods = {"searchPhoneFromList"})
	public void addToCart()
	{
		WebElement addToCart = driver.findElement(By.xpath("#add-to-cart-button"));
		addToCart.click();
	}
	
	@Test(priority = 7,dependsOnMethods = {"addToCart"})
	public void cartButton()
	{
		WebElement cartButton = driver.findElement(By.xpath("/html/body/div[10]/div[3]/div[3]/div/div[1]/div[3]/div[1]/div[2]/div[3]/form/span/span/input"));
		cartButton.click();
	}
	
	@Test(priority = 8,dependsOnMethods = {"cartButton"})
	public void checkItem()
	{

		String testTitle = "Apple iPhone 14 Pro Max (128 GB) - Gold";
		String originalTitle = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[3]/div[5]/div/div[2]/div[1]/div/form/div[2]/div[3]/div[4]/div/div[2]/ul/li[1]/span/a/span[1]/span/span[2]")).getText();
		
		Assert.assertEquals(originalTitle, testTitle);
	}
	
	@AfterTest
	public void exit()
	{
		driver.close();
	}
}
