package Selenium4Examples;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WindowTabs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.firefox.driver", "/Selenium4Examples-SeleniumExamples/geckodriver");
		
		WebDriver driver = null;
		
		
		driver = new FirefoxDriver();
		
		driver.get("https://www.hdfc.com/");
		
		String clickonlinkTab = Keys.chord(Keys.CONTROL,Keys.ENTER);
		
		driver.findElement(By.linkText("Careers")).sendKeys(clickonlinkTab);
		
		java.util.Iterator<String> iter = driver.getWindowHandles().iterator();
		
		String parentid = iter.next();
		String childid = iter.next();
		
		driver.switchTo().window(childid);
        System.out.println(driver.getTitle());
        
        driver.switchTo().window(parentid);
        System.out.println(driver.getTitle());
	}

}
