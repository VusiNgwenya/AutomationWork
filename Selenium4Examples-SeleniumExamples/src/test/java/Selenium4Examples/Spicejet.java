package Selenium4Examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Spicejet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.firefox.driver", "/Selenium4Examples-SeleniumExamples/geckodriver");
		
		WebDriver driver = null;
		
		driver = new FirefoxDriver();
		
		
		driver.get("https://spicejet.com");
		
		driver.findElement(By.xpath("//input[@id='ct100_mainContent_ddl_originalStation1_CTXT']")).click();
		
		driver.findElement(By.xpath("//a[contains(text(),'Bengaluru (BRL)']")).click();
		
		//driver.findElement(By.xpath("//a[contains(text(),'Chennai (MAA)']")).click();
		
		driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();

	}

}
