import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.*;




public class Locators2 {

	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		
		String name = "rahul";

		//System.setProperty("webdriver.chrome.driver","/Users/abvn237/eclipse-workspace/Introduction/chromedriver");
		
		//WebDriver driver = new ChromeDriver();
		
		 System.setProperty("webdriver.firefox.driver","/Users/abvn237/eclipse-workspace/Introduction/geckodriver");
			
			//WebDriver driver = new ChromeDriver();
	    WebDriver driver = new FirefoxDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys("rahul");
		driver.findElement(By.name("inputPassword")).sendKeys("rahulshettyacademy");
		driver.findElement(By.className("signInBtn")).click();
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.tagName("p")).getText());
	
		driver.findElement(By.xpath("//*[text()='Log Out'")).click();
		driver.close();
	}
	
	public void getPassword(WebDriver driver) throws InterruptedException
	{
		driver.get("https:;//rahulshettyacademy.com/locatorspractise/");
		driver.findElement(By.linkText("Forgot your password?")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
		
		
		
		
		
	}
	
	

}
