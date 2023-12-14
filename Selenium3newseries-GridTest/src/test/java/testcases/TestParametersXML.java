package testcases;

import org.testng.annotations.Test;

import com.beust.jcommander.Parameters;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class TestParametersXML
{

	public WebDriver driver;
	public DesiredCapabilities cap = new DesiredCapabilities();
	
	@Parameters({"browser"})
	@Test
	public void launchBrowser(String browser)
	{
		if(browser.equals("chrome"))
		{
			cap.setCapability(Platform.ANY);
			cap.setBrowserName("chrome");
			
			ChromeOptions options = new ChromeOptions();
			options.merge(cap);
		}
		else if(browser.equals("firefox"))
		{
			cap.setCapability(Platform.ANY);
			cap.setBrowserName("firefox");
			
			ChromeOptions options = new ChromeOptions();
			options.merge(cap);	
		}
		driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),cap);
		
		driver.get("http://gmail.com");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.findElement(By.id("identifierId")).sendKeys("fvfv");
		
		
	}
	
	
	
}
