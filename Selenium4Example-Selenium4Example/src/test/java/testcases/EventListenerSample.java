package testcases;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringDecorator;
import org.openqa.selenium.support.events.WebDriverListener;

public class EventListenerSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver webdriver = new FirefoxDriver();
		
		WebDriverListener listener = new MyListener();
		
		
		WebDriver driver = new EventFiringDecorator<WebDriver>(listener).decorate(webdriver);
		
		webdriver.get("http://gmail.com");
		
		webdriver.manage().window().maximize();
		webdriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.id("identifierId")).sendKeys("trainer2way2automation.com");
		driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/div/button/span")).click();
		driver.findElement(By.xpath("//*[@id=\"password\"]/div[1]/div/div[1]/input")).sendKeys("password");
		driver.quit();

	}

}
