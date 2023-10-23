import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class base {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//System.setProperty("webdriver.chrome.driver", "/Users/abvn237/eclipse-workspace/Introduction/chromedriver");
		
		//WebDriver driver = new ChromeDriver();
		
		 System.setProperty("webdriver.firefox.driver","/Users/abvn237/eclipse-workspace/Introduction/geckodriver");
			
			//WebDriver driver = new ChromeDriver();
	    WebDriver driver = new FirefoxDriver();
	    
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		
		String[] itemsNeeded = {"Cucumber","Brocolli","Betroot"};
		
		
		
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		
		Thread.sleep(3000);
		
		addItems(driver,itemsNeeded);
		
		driver.findElement(By.cssSelector("img[alt='Cart']")).click();
		driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT']")).click();
		
		System.out.println(driver.findElement(By.cssSelector("span.promoInfo")).getText());
	
		driver.findElement(By.cssSelector("input.promoCode")).sendKeys("rahulshetty");
		driver.findElement(By.cssSelector("button.promoBtn"));
		
		WebDriverWait w = new WebDriverWait(driver, 5);
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span.promoInfo")));
		
		System.out.println(driver.findElement(By.cssSelector("span.promoInfo")).getText());

	}
	
	public static void addItems(WebDriver driver,String[] itemsNeeded)
	{
		
List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));
		
		for(int i=0;i<products.size();i++)
		{
			String[] name = products.get(i).getText().split("-");
			
			String formattedName = name[0].trim();
			
			List ItemsNeededList = Arrays.asList(itemsNeeded);
			
			int j=0;
			
			if(ItemsNeededList.contains(name))
			{
				j++;
				driver.findElements(By.xpath("//div[@class='product-action']")).get(i).click();
				
				if(j==3)
				{	
				    break;
				}
			}
		}
		
	}

}
