package Source_Lab_Proj;

import java.net.URL;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverTest 
{
	public static WebDriver driver;

	@Before
	public void setUp()
	{
		DesiredCapabilities capabilities = DesiredCapabilities.firefox();
		capabilities.setCapability("version", "5");
		capabilities.setCapability("platform", Platform.MAC);
		
		this.driver = new RemoteWebDriver(new URL("http://ramanjuja1413:414c790d-480a-ab9e-d2c375861b5@ondemand.saucelabs"),capabilities);
		
		
	
	}
	
	
	@Test
	public void webDriver()
	{
	    driver.get("http//www.gmail.com/");
	    Assert.assertEquals("Gmail",driver.getTitle());
	    driver.findElement(By.id("Email")).sendKeys("dsdsd@gmail.com");
	    driver.findElement(By.id("Passwd")).sendKeys("dcfvfvfv");
	    driver.findElement(By.id("SignIn")).click();
	}
	
	@After
	public void tearDown()
	{
		driver.quit();
	}
}
