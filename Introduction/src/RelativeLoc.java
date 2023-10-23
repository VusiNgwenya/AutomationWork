import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import static org.openqa.selenium.support.locators.RelativeLocator.*;


public class RelativeLoc {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		System.setProperty("webdriver.firefox.dirver", "/Users/abvn237/eclipse-workspace/Introduction/geckodriver");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		
		WebElement nameEditBox = driver.findElement(By.cssSelector("[name='name']"));
		
		System.out.println(driver.findElement(with(By.tagName("label")).above(nameEditBox)).getText());
		
		WebElement dateofBirth = driver.findElement(By.cssSelector("[for='dateofBirth']"));
		//driver.findElement(By.tagName("input")).below(dateofBirth).click();
		
		
		WebElement iceCreamLabel = driver.findElement(By.xpath("//label[text()='Check me out if you love IceCreams!']"));
		
		driver.findElement(with(By.tagName("input")).toLeftOf(iceCreamLabel)).click();
		
		WebElement rbd = driver.findElement(By.id("inLineRadio1"));
		
		//System.out.println(driver.findElement(with(By.tagName("label")).toRightOf(rdb)).getText());
		
		
	}

}
