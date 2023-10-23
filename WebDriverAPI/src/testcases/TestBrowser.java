package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBrowser {
	
	public static String browser = "firefox";
	public static WebDriver driver;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		

		if(browser.equals("chrome"))
		{
		    WebDriverManager.chromedriver().setup();	
			driver = new ChromeDriver();
		   /*FirefoxDriver driver = new FirefoxDriver();
		
		   driver.get("http://way2automation.com");
		   driver.getTitle();
		   driver.click();
		   driver.sendKeys();*/
		}
		else if (browser.equals("firefox"))
		{
			 WebDriverManager.firefoxdriver().driverVersion("0.30.0").setup();
			 driver = new FirefoxDriver();		
			
		}
		else if (browser.equals("edge"))
		{
			 WebDriverManager.edgedriver().setup();
			 driver = new EdgeDriver();	
		}
		else if(browser.equals("ie"))
		{
			// driver = new InternetExplorer()
			/*FirefoxDriver driver = new FirefoxDriver();
			
			   driver.get("http://way2automation.com");
			   driver.getTitle();
			   driver.click();
			   driver.sendKeys();*/
			
		}
		
	}

}
