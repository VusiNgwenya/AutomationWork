package testcases;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestConcat {

	public static WebDriver driver;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//System.setProperty("webdriver.firefox.driver", "/Users/abvn237/eclipse-workspace/Selenium3newseries-SeleniumTesting/geckodriver");
		//System.setProperty("webdriver.firefox.driver", "/Users/abvn237/eclipse-workspace/Selenium3newseries-SeleniumTesting/geckodriver");
		
		WebDriverManager.firefoxdriver().setup();
		
		System.setProperty("webdriver.firefox.driver", "/Users/abvn237/eclipse-workspace/Selenium3newseries-SeleniumTesting/geckodriver");
		
		
		driver = new FirefoxDriver();
		
		driver.get("https://www.wikipedia.org/");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		
		
		/*for(int i=1;i<=4;i++)
		{
			System.out.println(By.xpath("//div[4]/input["+i+"]"));
		}*/
		
		/*int i=1;
		int count =0;
		
		
		while(true)
		{
			driver.findElement(By.xpath("//div[4]/input["+i+"]")).click();
			i++;
			count++;
		}*/
		
		List<WebElement> checkboxes = driver.findElements(By.name(""));
		
		System.out.println("Total checkboxes are : "+checkboxes.size());
		
		for(WebElement checkbox : checkboxes)
		{
			checkbox.click();
		}

	}

}
