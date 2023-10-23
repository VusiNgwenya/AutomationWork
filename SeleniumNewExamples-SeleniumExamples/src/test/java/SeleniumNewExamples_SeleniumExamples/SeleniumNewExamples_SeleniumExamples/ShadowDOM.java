package SeleniumNewExamples_SeleniumExamples.SeleniumNewExamples_SeleniumExamples;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ShadowDOM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.firefox.driver", "/SeleniumNewExamples-SeleniumExamples/geckodriver");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.get("chrome://downloads");
		
		WebElement root = driver.findElement(By.cssSelector("download-manager"));
		
        WebElement shadowRoot1 = (WebElement) ((JavascriptExecutor) driver).executeScript("return argument[0]");
        
        WebElement root2 = shadowRoot1.findElement(By.cssSelector("download-toolbar"));
        
        WebElement shadowRoot2 = (WebElement) ((JavascriptExecutor) driver).executeScript("return argument[0]");
        
        WebElement root3 = shadowRoot1.findElement(By.cssSelector("cr-toolbar"));
        
        WebElement shadowRoot3 = (WebElement) ((JavascriptExecutor) driver).executeScript("return argument[0]");
        
        
        WebElement root4 = shadowRoot1.findElement(By.cssSelector("cr-toolbar-search-field"));
        
        WebElement shadowRoot4 = (WebElement) ((JavascriptExecutor) driver).executeScript("return argument[0]");
        
        shadowRoot4.findElement(By.cssSelector("#searchInput")).sendKeys("Hello");
		
       // WebElement shadowRoot2 = driver.findElement(By.cssSelector("#searchInput")).sendKeys("Hello");
	}

}
