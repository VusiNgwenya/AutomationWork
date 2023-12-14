package testcases;

import java.time.Duration;

import static org.openqa.selenium.support.locators.RelativeLocator.with;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestRelativeLocators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.firefox.driver","/Users/abvn237/eclipse-workspace/Selenium4Example/geckodriver");

		//WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.way2automation.com/way2auto_jquery/index.php");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		
		/*WebElement above = driver.findElement(RelativeLocator.with(By.tagName("input")).above(By.tagName("Select")));
		above.sendKeys("trainer@way2automation.com");
				
				
		WebElement below = driver.findElement(RelativeLocator.with(By.tagName("input")).below(By.tagName("Select")));
		below.sendKeys("new Dehli");
		
		WebElement near = driver.findElement(RelativeLocator.with(By.partialLinkText("THE")).near(By.linkText("Signin")));
		near.click();
		
		WebElement rightOf = driver.findElement(RelativeLocator.with(By.xpath("//input[type='password']")).toRightOf(By.tagName("label")));
		
		rightOf.sendKeys("asfddsfsf");
		
		WebElement leftOf = driver.findElement(RelativeLocator.with(By.linkText("Signin")).toLeftOf(By.xpath("//*[@id=\"load_form\"]/div[1]/div[2]/input")));
		
		leftOf.sendKeys("asfddsfsf");*/
		
		driver.findElement(with(By.tagName("input"))
				.above(By.linkText("Signin"))
				.below(By.xpath("//*[@id=\"load_form\"]/fieldset[6]/input")))
		        .sendKeys("kdskdskdsdsf");
		
		
	}

}
