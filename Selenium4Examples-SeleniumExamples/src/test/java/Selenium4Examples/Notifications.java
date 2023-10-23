package Selenium4Examples;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Notifications {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeOptions opts = new ChromeOptions();
		
		opts.addArguments("--disable-notifications");
		
		System.setProperty("webdriver.firefox.driver", "/Selenium4Examples-SeleniumExamples/chromedriver");
		
		WebDriver driver = null;
		
		driver = new ChromeDriver(opts);
		
		driver.get("https://www.cleartrip.com/");

	}

}
