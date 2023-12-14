package testcases;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestTabsAndPopups 
{

	public static void main(String[] args)
	{
		System.setProperty("webdriver.firefox.driver", "SeleniumBatchNov2023/geckodriver");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.get("https://the-internet.herokuapp.com/windows");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		System.out.println("-----Generating window ids from the first window-----");
		
		Set<String> winids = driver.getWindowHandles();
		Iterator<String> iterator = winids.iterator();
		
		String firstWindow = iterator.next();
		
		System.out.println(firstWindow);
		
		driver.findElement(By.linkText("Click Here")).click();
		
		System.out.println("-----Generating window ids from the second window-----");
		
		winids = driver.getWindowHandles();
		iterator = winids.iterator();
		
		System.out.println(iterator.next());
		
		String secondWindow = iterator.next();
		System.out.println(secondWindow);
		
		
		
	}
}
