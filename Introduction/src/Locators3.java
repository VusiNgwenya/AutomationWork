import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Locators3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//System.setProperty("webdriver.chrome.driver", "/Users/abvn237/eclipse-workspace/Introduction/chromedriver");
		
		//WebDriver driver = new ChromeDriver();
		
		 System.setProperty("webdriver.firefox.driver","/Users/abvn237/eclipse-workspace/Introduction/geckodriver");
			
			//WebDriver driver = new ChromeDriver();
	    WebDriver driver = new FirefoxDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		System.out.println(driver.findElement(By.xpath("//header/div/button[1]/following-sibling::button[1]")).getText());
		System.out.println(driver.findElement(By.xpath("//header/div/button[1]/parent::div/button[2]")).getText());
		
	}

}
