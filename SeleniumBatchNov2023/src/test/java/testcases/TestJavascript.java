package testcases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestJavascript {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.firefox.driver", "/SeleniumBatchNov2023/geckodriver");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_submit_get");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.switchTo().frame("iframeResult");
		
		((javascriptExecutor) driver).executeScript("arguments[0].setAttribute('style','border:2px solid red; background:yellow'");

	}

}
