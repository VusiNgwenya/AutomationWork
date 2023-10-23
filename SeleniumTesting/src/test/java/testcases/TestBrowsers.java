package testcases;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;

public class TestBrowsers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		/*WebDriverManager.chromedriver();	
		System.setProperty("chromedriver.opera.driver", "/Users/abvn237/eclipse-workspace/SeleniumThree/chromedriver");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://way2automation.com");*/
		
		
		WebDriverManager.firefoxdriver();
	   System.setProperty("firefoxdriver.opera.driver", "/Users/abvn237/eclipse-workspace/SeleniumThree/firefoxdriver");
		
		FirefoxDriver driver = new FirefoxDriver();
		
		
		//driver.get("way2automation");
		
		//driver.get("http://way2automation.com");

	}

}
