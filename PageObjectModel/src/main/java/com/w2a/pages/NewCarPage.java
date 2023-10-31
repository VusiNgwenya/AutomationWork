package com.w2a.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NewCarPage {
	
	WebDriver driver;
	
	public ToyotoCarPage gotoToyota()
	{
		driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[2]/section[1]/"));
		
		return new ToyotoCarPage();
	}
	
	
	public HyundaiCarPage gotoHyundai()
	{
		driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[2]/section[1]/"));
		
		return new HyundaiCarPage(driver);
	}
	
	public BMWCarPage gotoBMW()
	{
		driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[2]/section[1]/"));
		
		return new BMWCarPage();
	}
	
	
	

}
