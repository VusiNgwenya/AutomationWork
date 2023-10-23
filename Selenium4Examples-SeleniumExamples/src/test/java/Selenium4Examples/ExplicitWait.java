package Selenium4Examples;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ExplicitWait {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.firefox.driver", "/Selenium4Examples-SeleniumExamples");
		
		WebDriver driver = null;
		
		driver = new FirefoxDriver();
		
		driver.navigate().to("https://www.exedia.co.in/");
		
		driver.findElement(By.xpath("//button[@data-lob='package']/span/span[2]")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("package-origin-hp-package")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.id("package-origin-hp-package")).sendKeys(Keys.ENTER);
		driver.findElement(By.id("package-origin-hp-package")).sendKeys(Keys.TAB);
		driver.findElement(By.id("package-origin-hp-package")).sendKeys(Keys.TAB);
		
		Thread.sleep(2000);
		
		
		
		

	}

}
