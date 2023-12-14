package testcases;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestTabsandPopups {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.firefox.driver", "Selenium3newseries-SeleniumTesting/geckodriver");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://hdfcbank.com");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
	
		//((JavascriptExecutor) driver).executeScript("myFunction()");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("myFunction()");
		js.executeScript("arguments[0].style.border='3px solid red'", driver.findElement(By.id("mySubmit")));
		
		System.out.println("--------Generating window ids from first with");
		
		Set<String> winids = driver.getWindowHandles();
		
		Iterator<String> iterate = winids.iterator();
		
		String first_window = iterate.next();
		
		driver.switchTo().frame("iframeResult");
		driver.findElement(By.xpath("html/body/button")).click();
		driver.switchTo().defaultContent();
		
		
		System.out.println(first_window);
		
		driver.findElement(By.id("loginsubmit")).click();
		
		
	    driver.findElement(By.id("loginsubmit")).click();
	    
	    System.out.println("-----------Generating window ids from Second");
	    
	    String second_window = iterate.next();
	    System.out.println(second_window);
	    
	   
	    while(iterate.hasNext())
	    {
	    	iterate.next();
	    }
	    
		
	    driver.switchTo().window("");
		driver.findElement(By.xpath("/html/body/div[4]/div[3]/div"));
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]"));
		
		
		 String third_window = iterate.next();
		 
		 System.out.println(third_window);
		 
		 driver.switchTo().window(third_window);
		 
		 
		System.out.println(driver.getTitle().contains("JetPrivilege"));
		
		driver.close();
		
		driver.switchTo().window(third_window);
		driver.quit();

	}

}
