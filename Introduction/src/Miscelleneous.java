import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.apache.commons.io.FileUtils;


public class Miscelleneous {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
	
		
		System.setProperty("webdriver.firefox.driver","/Users/abvn237/eclipse-workspace/Introduction/geckodriver");
		
	    WebDriver driver = new FirefoxDriver();
		
		driver.get("http://facebook.com");
		driver.findElement(By.xpath("id('email')")).sendKeys("fsfd");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		//driver.manage().deleteCookieNamed("sessionKey");
		
		int a = 5;
		
		getScreenshot(driver);

	}
	
	public static void getScreenshot(WebDriver driver) throws IOException
	{
		driver.get("http://google.com");
		
		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("/Users/abvn237/eclipse-workspace/Introduction/screenshot.png"));
		
	}

}
