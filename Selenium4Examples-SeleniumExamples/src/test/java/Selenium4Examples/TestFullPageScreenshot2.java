package Selenium4Examples;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestFullPageScreenshot2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.firefox.driver", "/Selenium4Examples-SeleniumExamples/geckodriver");
		
		WebDriver driver = null;
		
		driver.get("https://way2automation.com");
		driver.manage().window().maximize();
		
		if(driver instanceof FirefoxDriver)
		{
		   File fullPage = ((FirefoxDriver) driver).getFullPageScreenshotAs(OutputType.FILE);
		   FileUtils.copyFile(fullPage, new File("/Selenium4Examples-SeleniumExamples/geckodriver"));
		}
		else if(driver instanceof ChromeDriver)
		{
			File pageScreenshot = ((ChromeDriver) driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(fullPage, new File("/Selenium4Examples-SeleniumExamples/chromedriver"))
		}
		
		

	}

}
