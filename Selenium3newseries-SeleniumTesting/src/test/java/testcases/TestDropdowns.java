package testcases;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestDropdowns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.firefox.driver", "/Users/abvn237/eclipse-workspace/Selenium4Example/geckodriver");
		
		
		//WebDriverManager.firefoxdriver().setup();
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://gmail.com");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//driver.findElement(By.name("country")).sendKeys("French Guiana");
		
		WebElement dropdown = driver.findElement(By.id("searchLanguage"));
		
		Select select = new Select(dropdown);
		
		select.selectByValue("hi");
		
		List<WebElement> values =  driver.findElements(By.tagName("option"));
		
		System.out.println("Total values are : "+values.size());
		
		System.out.println(values.get(7).getText());
		
		for(int i=0;i<values.size();i++)
		{
			System.out.println(values.get(i).getAttribute("lang"));
		}
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		
		System .out.println(" ---Printing links---");
		
		System.out.println("Total links are:"+links.size());
		
		
		for(WebElement link : links)
		{
		System.out.println(link.getText()+" -- URL IS ---"+link.getAttribute("href"));
		}
		
		WebElement secondBlock = driver.findElement(By.id("blockid"));
		
		
		secondBlock.findElements(By.id("abc")).get(2);
		
		driver.findElement(By.id("abc")).click();
		

	}

}
