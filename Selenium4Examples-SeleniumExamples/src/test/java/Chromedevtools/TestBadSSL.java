package Chromedevtools;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.devtools.v85.security.Security;

public class TestBadSSL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.firefox.driver", "/Selenium4Examples-SeleniumExamples/geckodriver");
		
		WebDriver driver = new ChromeDriver();
		
		
		DevTools devTools = ((ChromeDriver) driver).getDevTools();
		
		devTools.createSession();
		
		
		devTools.send(Security.enable());
		devTools.send(Security.setIgnoreCertificateErrors(true));

		driver.get("https://expired.badssl.com");
	}

}
