package Chromedevtools;

import java.time.Duration;

import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestPageLoadStrategies {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeOptions opt = new ChromeOptions();
		opt.setPageLoadStrategy(PageLoadStrategy.NONE);
		
		long start = System.currentTimeMillis();
		
		System.setProperty("webdriver.chrome.driver", "/Selenium4Examples-SeleniumExamples/chreomedriver");
		
		WebDriver driver = new ChromeDriver(opt);
		
		
		driver.get("'http://flipkart.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

	}

}
