package main.java.rahulshettyacademy.AbstractComponents;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AbstractComponent 
{
	WebDriver driver;
	
     public void waitForElementToAppear(By findBy)
     {
    	 driver = (WebDriver) new FirefoxDriver();
    	 
    	 
    	 WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
    	 wait.until(ExpectedConditions.visibilityOfElementLocated(findBy));
    	 
    	 
     }
}
