package Selenium4Examples;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HardWait {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.firefox.driver", "/Selenium4Examples-SeleniumExamples/geckodriver");
		
		WebDriver driver = null;
		
		driver = new FirefoxDriver();
		
		driver.manage().timeouts().implicitlyWait(25,TimeUnit.SECONDS);
		

		/*driver.navigate().to("https://alaskatrips.poweredbygps.com/g/pt/hotels");
		
		driver.findElement(By.id("FH-origin")).sendKeys("nyc");
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("FH-origin")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.id("FH-origin")).sendKeys(Keys.ENTER);*/
		
		driver.navigate().to("https://www.expedia.co.in/");
		
		driver.findElement(By.xpath("//button[@data-lob='package']/span/span[2]")).click();
		
		driver.findElement(By.id("package-origin-hp-package")).sendKeys("c");
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("package-origin-hp-package")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.id("package-origin-hp-package")).sendKeys(Keys.ENTER);
		driver.findElement(By.id("package-origin-hp-package")).sendKeys(Keys.TAB);
		driver.findElement(By.id("package-origin-hp-package")).sendKeys(Keys.TAB);
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("package-origin-hp-package")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.id("package-origin-hp-package")).sendKeys(Keys.ENTER);
		
		Thread.sleep(1000);
		
		driver.findElement(By.id("package-origin-hp-package")).sendKeys("10/06/2020");
		driver.findElement(By.id("package-origin-hp-package")).sendKeys(Keys.ENTER);
		
		driver.findElement(By.xpath("//a[contains(@href,'Hilton']")).click();
		
		
		
	}

}
