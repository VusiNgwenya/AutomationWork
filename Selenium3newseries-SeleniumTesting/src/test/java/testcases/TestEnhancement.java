package testcases;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class TestEnhancement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.firefox.driver", "/Selenium3newseries-SeleniumTesting/geckodriver");
		
		WebDriver driver = new FirefoxDriver();
		

		driver.get("http://google.com");
		
		//Actions action = new Actions(driver);
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement link = driver.findElement(By.linkText("Gmail"));
		
		int x = link.getRect().getX();
		int y = link.getRect().getY();
		
		Actions action = new Actions(driver);
		action.moveByOffset(x, y).click().perform();
		
		
		
		
	}

}
