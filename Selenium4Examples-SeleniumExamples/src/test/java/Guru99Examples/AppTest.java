package Guru99Examples;

import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class AppTest {
	
	protected WebDriver driver;
	
    @Test
    public void guru99tutorials()
    {
    	System.setProperty("webdriver.firefox.driver", "/Selenium4Examples-SeleniumExamples/geckodriver");
    	
    	driver = new FirefoxDriver();
    	
    	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
    	
    	String eTitle = "Demo Guru99 Page";
    	
    	String aTitle = "";
    	
    	driver.get("http://demo.guru99.com/test/guru99home/");
    	
    	driver.manage().window().maximize();
    	
    	aTitle = driver.getTitle();
    	
    	if(aTitle.equals(eTitle))
    	{
    		System.out.println("Test Passed");
    	}
    	else
    	{
    		System.out.println("Test Failed");
    	}
    	
    	driver.close();
    }
	

}
