package Java_EE;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestBase {
	
	public static WebDriver driver;
	

	@BeforeSuite
	public void setUp()
	{
		if(driver ==null)
		{
			driver = new FirefoxDriver();
			driver.get("http://gmail.com");
			
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(5L,TimeUnit.SECONDS);
		}
	}
	

	@AfterSuite
	public void tearDown()
	{
		
	}


	public void onTestFailedButWithSuccessPercentage(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}


	public void OnTestFailure(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

}
