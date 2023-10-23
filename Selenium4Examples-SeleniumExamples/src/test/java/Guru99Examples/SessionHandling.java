package Guru99Examples;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SessionHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.firefox.driver", "/Selenium4Examples-SeleniumExamples/geckodriver");
		

		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://demo.guru99.com/V4/");
		
		
		WebDriver driver2 = new FirefoxDriver();
		driver2.get("http://demo.guru99.com/V4/");
				
	}

}
