package Chromedevtools;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v85.console.Console;
import org.openqa.selenium.devtools.v85.log.Log;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.JavascriptExecutor;

public class TestConsoleLogs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.firefox.driver","/Selenium4Examples-SeleniumExamples/geckodriver");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		
		DevTools devTools = ((FirefoxDriver) driver).getDevTools();
		
		devTools.createSession();
		
		devTools.send(Log.enable());
		devTools.send(Console.enable());
		
		
		devTools.addListener(Log.entryAdded(), entry -> 
		{
		  System.out.println(" Text is : "+entry.getText());
		  System.out.println(" Timestampo : "+entry.getTimestamp());
		  System.out.println(" Source is : "+entry.getSource());
		  System.out.println(" Level is : "+entry.getLevel());
		});
		
		driver.get("http://flipkart.com");
		
		((JavascriptExecutor) driver).executeScript("console.log('This s a simple log')");
		
	}

}
