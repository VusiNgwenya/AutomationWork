package com.w2a.testcases;

import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.SkipException;
import org.testng.annotations.Test;

import com.w2a.pages.HomePage;
import com.w2a.pages.NewCarPage;
import com.w2a.utilities.DataUtil;

public class FindNewCarTest extends BaseTest{
	
	@Test(dataProviderClass = DataUtil.class,dataProvider = "dp1")
	public void findNewCar(String browserName,String runMode)
	{
		if(runMode.equals("N"))
		{
			throw new SkipException("Skipping the test as the run mode");
		}
		
		setUp(browserName);
		
		HomePage home = new HomePage(driver);
		NewCarPage carpage = home.findNewCar();
		
		
	}
	
	public static void main(String [] args)
	{
		System.setProperty("webdriver.firefox.driver", "/PageObjectModel/geckodriver");
		
		Map<String, Object> prefs = new HashMap<String, Object>();
		prefs.put("profile.default_content_settings_values.notifications", 2);
		
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("prefs",prefs);
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.carwale.com/");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		HomePage home = new HomePage(driver);
		
		NewCarPage carPage = new NewCarPage();
		carPage.gotoBMW();
	}
	
	
	

}
