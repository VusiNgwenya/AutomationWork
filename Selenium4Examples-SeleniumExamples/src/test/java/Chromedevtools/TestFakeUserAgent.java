package Chromedevtools;

import java.util.Optional;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v85.network.Network;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestFakeUserAgent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.firefox.driver", "/Selenium4Examples-SeleniumExamples/geckodriver");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		
		DevTools devTools = ((FirefoxDriver) driver).getDevTools();
		devTools.createSession();
		
		String userAgent = "Mozilla/5.0 (Macintosh; Itel Mac OS X 10_15_7) AppleWebKit/537.36 (KHT)";
		
		devTools.send(Network.setUserAgentOverride(userAgent, Optional.empty(), Optional.empty(), Optional.empty()));
		
		driver.get("https://www.whatismybrowser.com/detect/what-is-my-user-agent");

	}

}
