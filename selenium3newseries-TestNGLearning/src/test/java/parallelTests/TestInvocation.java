package parallelTests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class TestInvocation extends BaseTest{
	public WebDriver driver;
	
	@Test(invocationCount=5,threadPoolSize=5)
	public void executeTest()
	{
		driver = getDriver("firefox");
		driver.get("http://google.com");
		
		System.out.println(driver.getTitle());
		//System.out.println("Launching chrome browser");
		
		driver.quit();
	}

}
