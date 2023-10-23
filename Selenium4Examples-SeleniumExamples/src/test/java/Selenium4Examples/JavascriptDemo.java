package Selenium4Examples;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class JavascriptDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.firefox.driver", "/Seleniu,4Examples-SeleniumExamples/geckodriver");
		
		WebDriver driver = null;
		
		
		driver.get("https://ksrtc.in");
		
		driver.findElement(By.id("fromPlaceName")).sendKeys("BENG");
		driver.findElement(By.id("fromPlaceName")).sendKeys(Keys.DOWN);
		driver.findElement(By.id("fromPlaceName")).sendKeys(Keys.DOWN);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		String script = "document.getElementById(\"fromPlaceName\").value;";
		String text = (String) js.executeScript(script);
		
		//System.out.println(text);
		
		int i=0;
		while(!text.equalsIgnoreCase("bengaluru internation airport"));
		{
			i++;
			driver.findElement(By.id("fromPlaceName")).sendKeys(Keys.DOWN);
			Thread.sleep(1000);
			
			text = (String) js.executeScript(script);
			
			System.out.println(text);
			
			/*if(i>10)
			
				break;*/
			
			
		}
		
		if(i>10)
		{
			System.out.println("Element not found");
		}
		else
		{
			System.out.println("Element found");
		}

	}

}
