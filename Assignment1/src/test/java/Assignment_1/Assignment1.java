package Assignment_1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Assignment1
{
	public static WebDriver driver;
	
	public static void main(String[] args)
	{
	
		WebDriverManager.firefoxdriver().setup();
		
	    driver = new FirefoxDriver();
	    
	    driver.get("http://www.google.co.za");
	    
	    driver.navigate().to("http://www.google.co.za");
	    
        
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
        WebElement type = driver.findElement(By.name("q"));
		
		type.sendKeys("Way2Automation");
		
		WebElement clickSearch = driver.findElement(By.name("btnK"));
		
		driver.findElement(By.id("jZ2SBf")).click();
		
		driver.findElement(By.xpath("//div[@class='LC20lb MBeuO DKV0Md']/h[3]")).click();
		
		System.out.println(" The total number of links is "+driver.findElements(By.xpath("//div[@class='LC20lb MBeuO DKV0Md']/h[3]")).size());
		
		
		for(int i=0;i<driver.findElements(By.xpath("//div[@class='LC20lb MBeuO DKV0Md']/h[3]")).size();i++)
		{
			
			String text = driver.findElements(By.xpath("//div[@class='LC20lb MBeuO DKV0Md']/h[3]")).get(i).getText();
			
			System.out.println("The text from the page is "+text);
			
		}
		
		driver.close();
			
	}
}
