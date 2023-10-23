import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Properties;
import java.util.Set;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.BrowserType;
import org.apache.log4j.*;
import java.util.logging.*;



public class SelIntroduction {

	static Logger logger = Logger.getLogger(SelIntroduction.class.getName());
	
	
	public static void main(String[] args) throws FileNotFoundException, IOException, InterruptedException 
	{
		// TODO Auto-generated method stub
		
	//	try 
	//	{
		
			//System.setProperty("webdriver.chrome.driver", "/Users/abvn237/eclipse-workspace/Introduction/chromedriver");
			
			//ChromeOptions o = new ChromeOptions();
			//o.addArguments("headless");
			
	//		WebDriver driver = new ChromeDriver();
		
			
	//	}
	//	catch(Exception i)
	//	{
			//logger.error("ERROR");
	//		logger.warn("WARNING");
			
	//BasicConfigurator.configure();
			
		//	Properties props = new Properties();
		//	props.load(new FileInputStream("log4j property file path"));
		//	props.setProperty("log4j.appender.File.File", "Folder where you want to store log files/" + "File Name");
			//logger.debug("DEBUG");
			//logger.info("INFO");
		//}
		
		//System.setProperty("webdriver.chrome.driver", "/Users/abvn237/eclipse-workspace/Introduction/chromedriver");
		
		//WebDriver driver = new ChromeDriver();
		
		//Thread.sleep(100);
		
		//System.setProperty("webdriver.gecko.driver", "/Users/abvn237/eclipse-workspace/Introduction/geckodriver");

		//WebDriver driver = new FirefoxDriver();
		
		//System.setProperty("webdriver.edge.driver", "/Users/abvn237/eclipse-workspace/Introduction/msedgedriver");

		//WebDriver driver = new EdgeDriver();
		
		 System.setProperty("webdriver.firefox.driver","/Users/abvn237/eclipse-workspace/Introduction/geckodriver");
			
			//WebDriver driver = new ChromeDriver();
	    WebDriver driver = new FirefoxDriver();
		
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		
		Thread.sleep(1000);
		
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.close();
		driver.quit();
		

	}
}
