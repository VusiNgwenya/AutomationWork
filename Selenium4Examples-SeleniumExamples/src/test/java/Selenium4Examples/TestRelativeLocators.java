package Selenium4Examples;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.*;
//import static org.apache.

public class TestRelativeLocators {
	
	public static FirefoxDriver driver;
	

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.firefox.driver", "/Selenium4Examples-SeleniumExamples/geckodriver");
		
		driver = new FirefoxDriver();
		
		driver.get("https://www.way2automation.com/way2auto_jquery/index.php");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		WebElement above = driver.findElement(with(By.tagName("input")).above(By.tagName("select")));
		above.sendKeys("trainer@way2automation.com");
		
		File aboveScrn = above.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(aboveScrn, new File("./screenshot/above.png"));
		
		WebElement below = driver.findElement(with(By.tagName("input")).below(By.tagName("select")));
		below.sendKeys("New Dehli");
		
		WebElement rightOf = driver.findElement(with(By.xpath("//input[@type='password']")).toRightOf(driver.findElement(with(By.tagName("input")))));
		
		rightOf.sendKeys("assddfvvrrr");
		
		File rightScrn = rightOf.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(rightScrn, new File("./screenshot/right.png"));
		
		WebElement leftOf = driver.findElement(with(By.linkText("SignIn")).toLeftOf(By.xpath("//")));
		
		File leftScrn = rightOf.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(rightScrn, new File("./screenshot/right.png"));
		
		leftOf.click();
		
		driver.findElement(with(By.tagName("input"))
		.above(By.linkText("Signin"))
		.below(By.xpath("//*[@id=\"load_form\"]/fieldset[6]/input")))
		.sendKeys("ffkkkdmkkkkkkk");
	}

}
