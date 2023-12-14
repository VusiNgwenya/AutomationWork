package testcases;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestWebElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.firefox.driver","/Users/abvn237/eclipse-workspace/Introduction/geckodriver");
		//WebDriverManager.firefoxdriver().setup();
		//WebDriverManager.chromedriver().setup();
		//System.setProperty("webdriver.chrome.driver","/Users/abvn237/eclipse-workspace/Introduction/chromedriver");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://gmail.com");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		
		//wait
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(30))
				.pollingEvery(Duration.ofSeconds(30))
				.withMessage("Time out as the condition is not met")
				.ignoring(NoSuchElementException.class);
		
		
		
		
		WebElement username = driver.findElement(By.id("identifierId"));
		
		username.sendKeys("trainer@way2aytomation.com");
		
		driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/div/button/span"));
		
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"password\"]/div[1]/div/div[1]/input"))).sendKeys("sadfdf");
		
		driver.findElement(By.xpath("//*[@id=\"password\"]/div[1]/div/div[1]/input")).sendKeys("asdfs");
		
		driver.findElement(By.xpath("//*[id=\"passwordNext\"]/div/button")).click();
		
	    System.out.println(driver.findElement(By.xpath("//*[id=\"view_container\"]/div/div/div[2]/div/div[1]/div/form/span/section/div/div/div/div[1]/div[2]/span")).getText());
		
		/*WebElement clickElement = driver.findElement(By.id("identifierNext"));
		
		clickElement.click();*/
		
		//driver.findElement(By.id("identifierId"));
		

	}

}
