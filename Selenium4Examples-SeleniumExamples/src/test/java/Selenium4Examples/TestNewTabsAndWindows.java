package Selenium4Examples;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestNewTabsAndWindows {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.firefox.driver", "/Selenium4Examples-SeleniumExamples/geckodriver");
		
		WebDriver driver = new FirefoxDriver();
		

		driver.get("https://www.way2automation.com/");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("http://google.com");
		driver.findElement(By.name("q")).sendKeys("Hello Selenium 4");
		
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("http://gmail.com");
		System.out.println(driver.getTitle());
		
		System.out.println(driver.getWindowHandles().size());
		
		Set<String> winids = driver.getWindowHandles();
		
		java.util.Iterator<String> iterator =   winids.iterator();
		
		List<String> winIndex = new ArrayList<String>();
				
		while(iterator.hasNext())
		{
		  winIndex.add(iterator.next());
		}
		
		driver.switchTo().window(winIndex.get(0));
		System.out.println("First Window title is :"+driver.getTitle());
		
		driver.close();
		
		driver.switchTo().window(winIndex.get(1));
		
		System.out.println("Second Window title is :"+driver.getTitle());
		
        driver.switchTo().window(winIndex.get(2));
		
		System.out.println("Third Window title is :"+driver.getTitle());
		
		Thread.sleep(1000);
		
		driver.quit();
		
		
	}

}
