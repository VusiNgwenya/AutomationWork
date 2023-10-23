import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.interactions.Actions;

public class actionsDemo {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		//System.setProperty("webdriver.chrome.driver","/Users/abvn237/eclipse-workspace/Introduction/chromedriver");
		
		//WebDriver driver = new ChromeDriver();
		
		//driver.get("https://www.amazon.com/");
		
		//FirefoxOptions options1 = new FirefoxOptions();
		//Proxy proxy = new Proxy();
		//proxy.setHttpProxy("ipaddress:8000");
		//options1.setCapability("proxy", proxy);
		
		//EdgeOptions options2 = new EdgeOptions();
		
		
		//options.setAcceptInsecureCerts(true);
		//options1.setAcceptInsecureCerts(true);
		
        System.setProperty("webdriver.firefox.driver","/Users/abvn237/eclipse-workspace/Introduction/geckodriver");
		
		//WebDriver driver = new ChromeDriver();
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.amazon.com/");
		
		Actions a = new Actions(driver);
		
		a.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("Hello").build();
		
		WebElement move = driver.findElement(By.cssSelector("a[id='nav-link-accountList']"));
		
		
		a.moveToElement(move).contextClick().build().perform();
		
		
		//a.moveToElement(move).build().perform();
		

	}

}
