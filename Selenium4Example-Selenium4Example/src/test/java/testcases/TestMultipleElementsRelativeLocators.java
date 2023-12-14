package testcases;

import java.time.Duration;
import java.util.List;

import static org.openqa.selenium.support.locators.RelativeLocator.with;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestMultipleElementsRelativeLocators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.firefox.driver","/Users/abvn237/eclipse-workspace/Selenium4Example/geckodriver");
		
		//WebDriverManager.firefoxdriver().setup();
		
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.way2automation.com/way2auto_jquery/index.php");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		
	   List<WebElement> labels =	driver.findElements(with(By.tagName("label")).below(By.xpath("//*[@id=\"load_form\"]/h3")));
		
		
	   for(WebElement label : labels)
	   {
		   System.out.println(label.getText());
	   }

	}

}
