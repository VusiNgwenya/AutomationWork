package Chromedevtools;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
//import org.openqa.selenium.devtools.v113.emulation.Emulation;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.devtools.v85.emulation.Emulation;


import com.google.common.base.Optional;

import io.vavr.control.Option;

import org.openqa.selenium.devtools.v85.security.Security;

public class TestMOCGeoLocation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.firefox.driver", "/Selenium4Examples-SeleniumExamples/geckodriver");
		
		WebDriver driver = new FirefoxDriver();
		
		
		DevTools devTools = ((ChromeDriver) driver).getDevTools();
		devTools.createSession();
		
		
		devTools.send(Emulation.setGeolocationOverride(Option.of((Number)51.509865), Optional.of((Number)(double) -0.110892), Optional.of((Number) 100)));
		
		driver.get("https://mycurrentlocation.net/");
	}

}
