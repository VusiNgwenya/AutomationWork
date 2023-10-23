package Selenium4Examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class ExplicitWaitAmericanGolf {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.firefox.driver", "/Selenium4Examples-SeleniumExamples/geckodriver");
		
		WebDriver driver = null;
		
		driver = new FirefoxDriver();
		
		driver.get("https://americangolf.co.uk");
		
		Actions a = new Actions(driver);
		
		a.moveToElement(driver.findElement(By.xpath("//a[@class='a-level-1'][contains(text(),'Clothing & Shoes')]"))).build().perform();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[@id='CLOTHFOOTW_1']//span[@class='name'][contains(text(),'Shirts']")).click();
		
		
		
		

	}

}
