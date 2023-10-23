import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SelIntroduction2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//System.setProperty("webdriver.chrome.driver", "/Users/abvn237/eclipse-workspace/Introduction/chromedriver");
		//WebDriver driver = new ChromeDriver();
		
		 System.setProperty("webdriver.firefox.driver","/Users/abvn237/eclipse-workspace/Introduction/geckodriver");
			
			//WebDriver driver = new ChromeDriver();
	    WebDriver driver = new FirefoxDriver();

		driver.get("https://rahulshettyacademy.com");
		
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
	}

}
