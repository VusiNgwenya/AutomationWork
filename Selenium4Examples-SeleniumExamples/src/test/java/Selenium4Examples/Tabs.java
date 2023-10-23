package Selenium4Examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Tabs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.firefox.driver", "/Selenium4Examples-SeleniumExamples/geckodriver");
		
		WebDriver driver = null;
		
		driver.get("https://www.hdfc.com/");
		
		driver.findElement(By.linkText("Blogs")).click();
		
		java.util.Iterator<String> iter = driver.getWindowHandles().iterator();
		
		String parentid = iter.next();
		String childid = iter.next();
		
		driver.switchTo().window(childid);
		System.out.println(driver.getTitle());
		
		driver.switchTo().window(parentid);
		System.out.println(driver.getTitle());

	}

}
