package Selenium4Examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Frames {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.firefox.driver", "/Selenium4Examples-SeleniumExamples/geckodriver");
		
		WebDriver driver = null;
		
		driver = new FirefoxDriver();
		
		driver.get("https://paytm.com/");
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//div[@class='_3ac-']")).click();
        System.out.println("Count of frames:-->"+driver.findElements(By.tagName("iframe")).size());
        
        driver.switchTo().frame(0);
        
        driver.findElement(By.xpath("//div[@class='qrcode-footer-text']/span")).click();
        driver.findElement(By.xpath("//input[@name='username']")).sendKeys("abcdef");
		
	}

}
