import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NewWindow {

	public static void main(String[] args) throws IOException 
	{
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.firefox.dirver", "/Users/abvn237/eclipse-workspace/Introduction/geckodriver");
		WebDriver driver = new FirefoxDriver();
		
		
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.switchTo().newWindow(WindowType.TAB);
		
		
		Set<String> handles = driver.getWindowHandles();
		Iterator <String> it = handles.iterator();
		String parentWindowId = it.next();
		String childWindow = it.next();
		
		driver.get("https://rahulshettyacademy.com/");
		
		String courseName = driver.findElements(By.cssSelector("a[href*='https://courses.rahulshettyacademy.com/p']")).get(1).getText();
		
		driver.switchTo().window(parentWindowId);
		
		WebElement name = driver.findElement(By.cssSelector("[name='Name']"));
		
		name.sendKeys(courseName);
		
		File file = name.getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(file, new File("logo.png"));
		
		System.out.println(name.getRect().getDimension().getHeight());
		System.out.println(name.getRect().getDimension().getWidth());
		
		
		//driver.switchTo().window(null)

	}

}
