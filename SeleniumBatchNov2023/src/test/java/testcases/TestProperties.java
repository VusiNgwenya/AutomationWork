package testcases;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import java.util.logging.Logger;

import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TestProperties {
	
	public static WebDriver driver;
	public static Logger log = Logger.getLogger(TestProperties.class.getName());
	public static Properties OR;
	public static Properties Config;
	
	
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		PropertyConfigurator.configure(System.getProperty("user.dir")+"\\src\\test\\resources\\properties\\log4j.properties");
		
		Properties OR = new Properties();
		Properties Config = new Properties();
		
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\properties\\OR.properties");
		
		OR.load(fis);
		
		log.info("OR Properties loaded");
		
		fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\properties\\Config.properties");
		
		System.out.println(OR.getProperty("username_ID"));
		
		
		System.out.println(Config.getProperty("testsiteurl"));
		
		if(Config.getProperty("browser").equals("firefox"))
		{
			System.setProperty("webdriver.firefox.driver", "/SeleniumBatchNov2023/geckodriver");
			
			log.info("firefox browser launched !!!");
		}
		else if(Config.getProperty("browser").equals("firefox"))
		{
	        System.setProperty("webdriver.chrome.driver", "/SeleniumBatchNov2023/chromedriver");
			
			log.info("chrome browser launched !!!");
		}
		
		driver.get(Config.getProperty("testsiteurl"));
		log.info("Navigated to : "+Config.getProperty("testsiteutl"));
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Integer.parseInt(Config.getProperty("user.dir")+"\\src\\test\\resources\\properties\\Config.properties"),Duration.ofSeconds(10));
		
		driver.findElement(By.id("username-ID")).sendKeys("trainer@way2automation.com");
		
		log.info("Typing in an Element : and enterwd value as trainer@way2automation.com");
		
		driver.findElement(By.xpath("nextBtn_XPATH")).click();
		
		log.info("Clicking on next button");
		
		driver.quit();
		
		log.info("test execution completed !!!");
		
		click("");
		
		
		

	}
	
	public static void click(String key)
	{
		driver.findElement(By.xpath(key));
		
		log.info("Clicking on an element : "+key);
		
		if(key.endsWith("_XPATH"))
		{
			driver.findElement(By.xpath(OR.getProperty(key)));
		}
		else if(key.endsWith("_ID"))
		{
			driver.findElement(By.id(OR.getProperty(key)));
		}
		else if(key.endsWith("_CSS"))
		{
			driver.findElement(By.cssSelector(OR.getProperty(key)));
		}
	}
	
	public void type(String str1,String str2)
	{
		
	}

}
