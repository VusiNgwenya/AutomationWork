package Guru99Examples;

import org.testng.annotations.Test;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class AppTest2 {

	protected WebDriver driver;
	
	@Test
	public void guru99tutorials()
	{
		System.setProperty("webdriver.firefox.driver", "Selenium4Examples-SeleniumExamples/geckodriver");
		
		
		driver = new FirefoxDriver();
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(2));
		
		String eTitle = "Demo Guru99 Page";
		String aTitle = "";
		
		driver.get("http://demo.guru99.com/test/guru99home/");
		
		driver.manage().window().maximize();
		
		aTitle = driver.getTitle();
		
		if(aTitle.contentEquals(eTitle))
		{
			System.out.println("Test Passed");
		}
		else
		{
			System.out.println("Test Failed");
		}
		
		WebElement guru99seleniumlink;
		
		guru99seleniumlink = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/section/div[2]/div/div[1]/div/div/div//div[2]/div[2]/div/div/div/div/div[1]/div/div/a/i")));
		
		guru99seleniumlink.click();
		
		
	}
	

}
