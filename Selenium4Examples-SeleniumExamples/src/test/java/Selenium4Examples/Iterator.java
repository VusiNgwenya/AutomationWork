package Selenium4Examples;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Iterator {

	public static WebDriver driver = null;
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.firefox.driver","/Selenium4Examples-SeleniumExamples/geckodriver");
		
		
		driver = new FirefoxDriver();
		
		driver.get("https://www.hollisterco.com/shop/wd");
		
		WebElement columndriver = driver.findElement(By.cssSelector(".footer__info-links.grid-col-2 ul ul"));
		
		System.out.println("Total links in first column-->"+columndriver.findElements(By.tagName("a")).size());
		
		for(int i=0;i<columndriver.findElements(By.tagName("a")).size();i++)
		{
			String clickonlinkTab = Keys.chord(Keys.CONTROL,Keys.ENTER);
			columndriver.findElements(By.tagName("a")).get(i).sendKeys(clickonlinkTab);
			Thread.sleep(1000);
		}
		
		java.util.Iterator<String> iter = driver.getWindowHandles().iterator();
		
		/*String parentid = iter.next();
		String childid = iter.next();
		
		driver.switchTo().window(childid);
		System.out.println(driver.getTitle());
		
		driver.switchTo().window(parentid);
		System.out.println(driver.getTitle());*/
		
		
	/*	while(iter.hasNext())
		{
			driver.switchTo().window(iter.next());
			System.out.println(driver.getTitle());
		}*/
		
		
		

	}

}
