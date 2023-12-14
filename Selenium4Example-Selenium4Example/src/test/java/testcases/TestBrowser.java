package testcases;


import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class TestBrowser {
	
	public static String browser = "chrome";
	public static ChromeDriver driver = new ChromeDriver();
	public static FirefoxDriver driver1 = new FirefoxDriver();
	public static InternetExplorerDriver driver2 = new InternetExplorerDriver();
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		if(browser.equals("Chrome"))
		{
		
		System.setProperty("webdriver.chrome.driver","/Users/abvn237/eclipse-workspace/Selenium2newseries - SeleniumTesting/chromedriver");
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		
		 driver.get("http://way2automation.com");
			
			
			String title = driver.getTitle();
			System.out.println(title.length());
			System.out.println(title);
			
			driver.close();
			driver.quit();
		
		/*driver.get("http://way2automation.com");
		
		
		String title = driver.getTitle();
		System.out.println(title.length());
		System.out.println(title);
		
		driver.close();
		driver.quit();*/
		}
		else if (browser.equals("firefox"))
		{
			System.setProperty("webdriver.firefox.driver","/Users/abvn237/eclipse-workspace/Selenium2newseries - SeleniumTesting/geckodriver");
			WebDriverManager.firefoxdriver().setup();
			//FirefoxDriver driver = new FirefoxDriver();
			
			
			 driver1.get("http://way2automation.com");
				
				
				String title = driver1.getTitle();
				System.out.println(title.length());
				System.out.println(title);
				
				driver1.close();
				driver1.quit();
		}
		else if(browser.equals("ie"))
		{
			System.setProperty("webdriver.firefox.driver","/Users/abvn237/eclipse-workspace/Selenium2newseries - SeleniumTesting/geckodriver");
		    WebDriverManager.iedriver().setup();
		    InternetExplorerDriver driver = new InternetExplorerDriver();
		    
		    
		    driver.get("http://way2automation.com");
			
			
			String title = driver.getTitle();
			System.out.println(title.length());
			System.out.println(title);
			
			driver.close();
			driver.quit();
		}
		
        

	}

}
