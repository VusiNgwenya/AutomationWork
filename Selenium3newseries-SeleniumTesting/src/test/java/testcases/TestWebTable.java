package testcases;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestWebTable {

	public static WebDriver driver;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.firefox.driver", "/Users/abvn237/eclipse-workspace/Selenium3newseries-SeleniumTesting/geckodriver");
		
		//WebDriverManager.firefoxdriver().setup();
		
		driver = new FirefoxDriver();
		
		driver.get("https://www.wikipedia.org/");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		List<WebElement> rowNum = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr"));
		
		System.out.println("Total rows are : "+rowNum.size());
		
		List<WebElement> colNum= driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr[1]/td"));
		
		System.out.println("Total cols are : "+colNum.size());
		
		for(int rows=1;rows<=rowNum.size();row++)
		{
			for(int cols=1;cols<=colNum.size();cols++)
			{
				System.out.println(By.xpath("//table"));
			}
			
			
		}
		
		System.out.println();

	}

}
