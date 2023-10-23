package Selenium4Examples;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Capslock_excercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.firefox.driver", "/Selenium4Examples-SeleniumExamples/geckodriver");
		
		WebDriver driver = null;

		driver = new FirefoxDriver();
		
		driver.get("https://americangolf.co.uk");
		
		Actions a = new Actions(driver);
		
		a.moveToElement(driver.findElement(By.xpath("//input[@id='q']"))).click().keyDown(Keys.SHIFT).sendKeys("HELLO").build().perform();
		
	}

}
