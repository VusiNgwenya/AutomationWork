package com.w2a.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {
	
	WebDriver driver;
	LoginPage login;
	
	
	
	public HomePage(WebDriver driver)
	{
		this.driver = driver;
	}
	public void goToSupport()
	{
		driver.findElement(By.cssSelector(".signing>a:nth-child(2)")).click();
	}
	
	public void goToSignUp()
	{
		driver.findElement(By.cssSelector(".signup")).click();
	}
	
	public LoginPage goToLogin()
	{
		driver.findElement(By.cssSelector(".signin")).click();
		return login;
	}
	
	public void goToZohoEdu()
	{
		
	}
	
	public void goToLearnMore()
	{
		
	}
	
	public void validateFooterLinks()
	{
		
	}
	
	
	/*@FindBy(xpath="//*[@id=\"root\"]/div[1]/header/div/nav/ul//li[1]/div")
	public WebElement newCarsMenu;
	
	@FindBy(xpath="div[contains(text(),'Find New Cars')]")
	public WebElement findNewCars;

	@FindBy(xpath="//*[@id=\"root\"]/div[2]/div[1]/div[2]/div/div[1]/div/div[2])
	public WebElement newCarsMenu;*/
	
	@FindBy(linkText="Toyota")
	public WebElement toyota;
	
	@FindBy(linkText="Hyundai")
	public WebElement hyundai;

	@FindBy(linkText="BMW")
	public WebElement bmw;
	
	public ToyotoCarPage totoToyota()
	{
		
	}
	
	public NewCarPage findNewCar()
	{
		
	}
	
	

}
