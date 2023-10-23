package Selenium4Examples;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Temp {
	
	public static WebDriver driver = null;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println ("-----------------------------Welcome to the automation world-------------------------------------------------------");
		System.out.println("--------------------------------------------------------------------------------------------------------------------");
		System.out.println("--------------------------------------------------------------------------------------------------------------------");
		System.out.println("------------------------------The options for browsers you can select from are as follows --------------------------");
		System.out.println("------------------------------1. Chrome Driver ---------------------------------------------------------------------");
		System.out.println("------------------------------2. FirefoxDriver ---------------------------------------------------------------------");
		System.out.println("------------------------------3. MS Edge Driver --------------------------------------------------------------------");
		System.out.println("--------------------------------------------------------------------------------------------------------------------");
		System.out.println("--------------------------------------------------------------------------------------------------------------------");
		System.out.println("Enter the option for the driver to use for testing:");
		System.out.println("\n");
		
		String driverName = reader.readLine();
		
		
		System.out.println("--------------------------------------------------------------------------------------------------------------------");
		System.out.println("--------------------------------------------------------------------------------------------------------------------");
		System.out.println("You have selected the "+driverName+" as driver option");
		
		switch(driverName)
		{
		     case "Chrome Driver" : 
		    	 
		     launchChromeBrowser(driver);
		     
		     break;
		     
		     case "Firefox Driver":
		    	 
		    launchFirefoxDriver(driver);
		    
		    break;
		    
		     case "MS Edge Driver":
		    	 launchEdgeDriver(driver);
		    	 break;
		    
		    default :
		    	
		    	System.out.println("The option selected is incorrect");
		    	
		}
		
		
		
		/*Scanner in = new Scanner(System.in);
		
		String name1 = in.nextLine();
		
		System.out.println("You have entered the driver :"+name1);
		
		String driverName = System.console().readLine();
		
		System.out.println("You entered driver name :"+driverName);*/
		

		
		
		
	}
	
	public static void launchChromeBrowser(WebDriver driver)
	{
		System.setProperty("webdriver.chrome.driver","/Selenium4Examples-SeleniumExamples/chromedriver");
		
		
		driver = new ChromeDriver();
		driver.get("https://google.com");
		driver.navigate().to("https://yahoo.com");
		driver.navigate().back();
		
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getPageSource());
		driver.close();
	}
	
	
	public static void launchFirefoxDriver(WebDriver driver)
	{
		System.setProperty("webdriver.firefox.driver","/Selenium4Examples-SeleniumExamples/geckodriver");
		
		driver = new FirefoxDriver();
		driver.get("https://google.com");
		driver.navigate().to("https://yahoo.com");
		driver.navigate().back();
		
		
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getPageSource());
		driver.close();
	}
	
	public static void launchEdgeDriver(WebDriver driver)
	{
		

		System.setProperty("webdriver.msedge.driver", "/Selenium4Examples-SeleniumExamples/msedgedriver");
		
		driver = new EdgeDriver();
		driver.get("https://google.com");
		driver.navigate().to("https://yahoo.com");
		driver.navigate().back();
		
		
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getPageSource());
		driver.close();
	}

}
