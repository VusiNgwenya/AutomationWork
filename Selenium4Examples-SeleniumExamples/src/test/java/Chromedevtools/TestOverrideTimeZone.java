package Chromedevtools;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v113.emulation.Emulation;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestOverrideTimeZone {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.firefox.driver","/Selenium4Examples-SeleniumExamples");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		driver.get("https://whatismytimezone.com/");
		
		Thread.sleep(5000);
		
		DevTools devTools = ((FirefoxDriver) driver).getDevTools();
		
		devTools.createSession();
		devTools.send(Emulation.setTimezoneOverride("EST"));
		
		driver.get("https://whatismytimezone.com");

	}

}
