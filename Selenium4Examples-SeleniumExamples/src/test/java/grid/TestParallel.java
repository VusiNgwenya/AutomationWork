package grid;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestParallel {
	
	public static ThreadLocal<RemoteWebDriver> driver = new ThreadLocal<RemoteWebDriver>();

	public static DesiredCapabilities cap = null;
	
	public WebDriver getDriver()
	{
		return driver.get();
	}
	
	@Parameters({"browser"})
	@Test
	public void doSearch(String browser)
	{
		if(browser.equals("firefox"))
		{
			cap = new FirefoxOptions();
		}
		else if(browser.equals("chrome"))
		{
			cap = new ChromeOptions();
		}
	}
}
