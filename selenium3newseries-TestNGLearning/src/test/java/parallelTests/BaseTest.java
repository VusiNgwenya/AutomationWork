package parallelTests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTest {
	
	public WebDriver driver;
	
	public WebDriver getDriver(String browser)
	{
		if(browser.equals("chrome"))
		 {
			System.setProperty("webdriver.firefox.driver","/selenium3newseeries-TestNGLearning");
			driver = new ChromeDriver();
	     }
		else if(browser.equals("firefox"))
		{
			System.setProperty("webdriver.firefox.driver","/selenium3newseeries-TestNGLearning");
			driver = new FirefoxDriver();
		}
		
		return driver;
	}

}
