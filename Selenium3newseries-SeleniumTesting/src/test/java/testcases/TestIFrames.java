package testcases;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestIFrames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.firefox.driver", "/Selenium3newseries-SelniumTesting/geckodriver");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.w3schools.com/jsref/tryit.jsp?filename");

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.switchTo().frame("iframeResult");
		
		driver.findElement(By.xpath("/html/body/button")).click();
		
	    List<WebElement> frames = driver.findElements(By.tagName(""));
	    
	    System.out.println(frames.size());
	    
	    for(WebElement frame : frames)
	    {
	    	System.out.println(frame.getAttribute("id"));
	    }
      ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);		
  }
}
