package Grid2;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;


import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;
import org.openqa.selenium.Platform;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestSample 
{

	@Parameters("browser")
	@Test
	public void testLogin(String browser) throws MalformedURLException
	{
		
		System.out.println(browser);
		//DesiredCapabilities cap = DesiredCapabilities.firefox();
		DesiredCapabilities cap = null;
		/*cap.setBrowserName("firefox");
		cap.setPlatform(Platform.ANY);*/
		
		if(browser.equals(browser))
		{
			DesiredCapabilities.firefox();
			
			cap.setBrowserName("firefox");
			cap.setPlatform(Platform.ANY);
		}
		else if(browser.equals("chrome"))
		{
            DesiredCapabilities.chrome();
			
			cap.setBrowserName("chrome");
			cap.setPlatform(Platform.ANY);
		}
		else if(browser.equals("explore"))
		{
			   DesiredCapabilities.internetExplorer();
				
				cap.setBrowserName("iexplore");
				cap.setPlatform(Platform.WINDOWS);
		}
		
		RemoteWebDriver driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),cap);
		
		driver.get("https://gmail.com");
		driver.findElement(By.id("Email")).sendKeys("raman@gmail.com");
		driver.findElement(By.id("Passwd")).sendKeys("deedddddd");
		
		driver.quit();
		
	}
	
	@DataProvider
	public Object[][] getData()
	{
		Object data[][] = new Object[2][3];
		
		data[0][0] = "raman@gmail.com";
		data[0][1] = "sdsdsdsds";
		data[0][2] = "firefox";
		
		data[1][0] = "rahul@gmail.com";
		data[1][1] = "sdsdsdsd";
		data[1][2] = "chrome";
		
		data[2][0] = "ishita@gmail.com";
		data[2][1] = "dcdcdcdcdc";
		data[2][2] = "iexplore";
		

		data[1][0] = "rahul@gmail.com";
		data[1][1] = "sdsdsdsd";
		data[1][2] = "chrome";
		
		data[2][0] = "ishita@gmail.com";
		data[2][1] = "dcdcdcdcdc";
		data[2][2] = "iexplore";
		
		data[0][0] = "raman@gmail.com";
		data[0][1] = "sdsdsdsds";
		data[0][2] = "firefox";
		
		data[1][0] = "rahul@gmail.com";
		data[1][1] = "sdsdsdsd";
		data[1][2] = "chrome";
		
		data[2][0] = "ishita@gmail.com";
		data[2][1] = "dcdcdcdcdc";
		data[2][2] = "iexplore";
		

		data[1][0] = "rahul@gmail.com";
		data[1][1] = "sdsdsdsd";
		data[1][2] = "chrome";
		
		data[2][0] = "ishita@gmail.com";
		data[2][1] = "dcdcdcdcdc";
		data[2][2] = "iexplore";
		
		data[2][0] = "ishita@gmail.com";
		data[2][1] = "dcdcdcdcdc";
		data[2][2] = "iexplore";
		

		data[1][0] = "rahul@gmail.com";
		data[1][1] = "sdsdsdsd";
		data[1][2] = "chrome";
		
		data[2][0] = "ishita@gmail.com";
		data[2][1] = "dcdcdcdcdc";
		data[2][2] = "iexplore";
		
		return data;
		
	}
}
