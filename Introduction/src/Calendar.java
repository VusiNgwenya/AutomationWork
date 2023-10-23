import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Calendar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//System.setProperty("webdriver.chrome.driver", "/Users/abvn237/eclipse-workspace/Introduction/chromedriver");
		//ChromeDriver driver = new ChromeDriver();
		
		 System.setProperty("webdriver.firefox.driver","/Users/abvn237/eclipse-workspace/Introduction/geckodriver");
			
			//WebDriver driver = new ChromeDriver();
	    WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.path2usa.com/travel-companions");
		
		//driver.findElementByXPath(".//*[@id='travel_date']").click();
		
		driver.findElement(By.cssSelector("[class='datepicker-days'][class='datepicker-switch']")).getText().contains("April");
		
		
		while(driver.findElement(By.cssSelector("[class='datepicker-days'][class='datepicker-switch']")).getText().contains("April"))
		{
			driver.findElement(By.cssSelector("[class='datepicker-days'] th[class='next']")).click();
		}
		
		List<WebElement> dates = driver.findElements(By.className(".day"));
		
		int count = driver.findElements(By.className(".day")).size();
		
		for(int i=0;i<count;i++)
		{
			String text = driver.findElements(By.className(".day")).get(i).getText();
			
			if(text.equalsIgnoreCase("23"))
			{
				driver.findElements(By.className(".day")).get(i).click();
				break;
			}
		}

	}

}
