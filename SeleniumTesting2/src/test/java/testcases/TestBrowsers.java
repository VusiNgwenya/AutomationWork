package testcases;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBrowsers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver", "/Users/abvn237/eclipse-workspace/SeleniumTesting2/geckodriver");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://google.com");
		
		/*WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://google.com");*/
		
		/*WebDriverManager.chromedriver().setup();
		SafariDriver driver = new SafariDriver();
		driver.get("http://google.com");*/
		
		
		/*WebDriverManager.chromedriver().setup();z
		OperaDriver driver = new OperaDriver();
		driver.get("http://google.com");*/
		
		
		
		
	}

}
