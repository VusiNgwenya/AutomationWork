package testcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestRectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.firefox.driver","Selenium3newseries-SeleniumTesting/geckodriver");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://gmail.com/");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement img = driver.findElement(By.xpath("//*[@id=\"logo\"]"));
		
		Rectangle rect = img.getRect();
		
		System.out.println("Height :"+rect.getHeight());
		System.out.println("Width :"+rect.getWidth());
		System.out.println("X Coord :"+rect.getX());
		System.out.println("Y Coord :"+rect.getY());

	}

}
