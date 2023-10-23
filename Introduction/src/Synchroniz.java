import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Synchroniz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//System.setProperty("webdriver.chrome.driver", "/Users/abvn237/eclipse-workspace/Introduction/chromedriver");
		
		//WebDriver driver = new ChromeDriver();
		
		 System.setProperty("webdriver.firefox.driver","/Users/abvn237/eclipse-workspace/Introduction/geckodriver");
			
			//WebDriver driver = new ChromeDriver();
	    WebDriver driver = new FirefoxDriver();
		
		driver.get("https://alaskatrips.poweredbygps.com/g/pt/hotels/?MDP-ALASKA-US.TPS.BRAND.hotel");
		
		driver.findElement(By.id("H-destination")).sendKeys("nyc");
		driver.findElement(By.id("H-destination")).sendKeys(Keys.TAB);
		driver.findElement(By.id("H-destination")).sendKeys(Keys.ENTER);
		
		WebDriverWait d = new WebDriverWait(driver,20);
		d.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='resultsContainer']/sections")));
		driver.findElement(By.xpath("//div[@id='resultsContainer']/section/articel[1]")).click();
		
		

	}

}
