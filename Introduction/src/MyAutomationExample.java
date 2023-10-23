import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class MyAutomationExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//System.setProperty("webdriver.chrome.driver", "/Users/abvn237/eclipse-workspace/Introduction/chromedriver");
		//WebDriver driver = new ChromeDriver();
		
		 System.setProperty("webdriver.firefox.driver","/Users/abvn237/eclipse-workspace/Introduction/geckodriver");
			
		
	    WebDriver driver = new FirefoxDriver();
		
		//SafariDriver driver = new SafariDriver();
		
	    
		driver.get("http://spicejet.com");
		
		driver.findElement(By.id("ct100_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[@value='BLR']")).click();
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//a[@value='MAA'])[2]")).click();
		
		driver.findElement(By.xpath("div[@id='glsct100_mainCoontent_ddl_destinationStation1_CTNR']  //a[@value='MAA']")).click();
		
		
		

	}

}
