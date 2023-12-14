package testcases;

import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import Selenium4Examples.Screenshot;

public class TestScreenshotUsingAshot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.firefox.driver", "/Selenium3newseries-SeleniumTesting/geckodriver");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		WebElement ele = driver.findElement(By.xpath("/html/body/div[4]/div/header/div[2]/div/div[1]"));
		
		Screenshot screenshot = new Ashot().shootingStrategy(ShootingStategies.viewportPasting(1000)).takesScreenshot(driver,ele);
		
		ImageIO.write(screenshot.getImage(), "jpg", ".\\screenshot\\ashotimg.jpg");
		
		
		

	}

}
