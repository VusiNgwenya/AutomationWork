package Selenium4Examples;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestMouseOver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.firefox.driver", "/Selenium4Examples/SeleniumExamples/geckodriver");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://google.com");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.findElement(By.name("q")).sendKeys("way2automation");
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div[3]/form/div[2]/div[2]/div/center/input[1]")));
		
		driver.findElement(By.xpath("/html/body/div/div[3]/form/div[2]/div[2]/div/center/input[1]")).click();
		
		WebElement menu = driver.findElement(By.xpath("html/body/div[6]/div[3]/div[10]/div[1]/div[2]/div/div/div/div[1]/div/div/div/div[1]/div/div/div/div/div[1]/a/h3"));
		
		Actions action = new Actions(driver);
		
		action.moveToElement(menu).perform();
		
		driver.findElement(By.linkText("Practice site 1")).click();
		
		
		
	}

}
