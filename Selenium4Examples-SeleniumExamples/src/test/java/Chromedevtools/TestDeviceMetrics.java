package Chromedevtools;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.devtools.v85.emulation.Emulation;
import org.openqa.selenium.devtools.v85.security.Security;

public class TestDeviceMetrics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.firefox.driver","Selenium4Examples-SeleniumExamples/geckodriver");
		
		
		WebDriver driver = new FirefoxDriver();
		
		DevTools devTools = ((FirefoxDriver) driver).getDevTools();
		devTools.createSession();
		
		/*devTools.send(Emulation.setDeviceMetricsOverride(812,
				50,
				true, null, null, null, null, null, null, null, null, null))*/
		Map<String,Object> deviceMetrics = new HashMap<String,Object>(){
				{
			         put("width",375);
			         put("height",812);
			         put("mobile",true);
			         put("deviceScaleFactor",50);
			         
				}};
		
				
	((FirefoxDriver) driver).executeCdpCommand("Emulation.setDeviceMetrictsOverride",deviceMetrics);
	
		driver.get("https://selenium.dev/");

	}

}
