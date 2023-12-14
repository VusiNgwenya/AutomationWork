package Testcases;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.opera.OperaOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class TestBrowsers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*System.setProperty("webdriver.firefox.driver", "/Users/abvn237/eclipse-workspace/SeleniumThree/geckodriver");
		
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("http:way2automation.com");*/
		
		
		
		
		/*DesiredCapabilities capabilities = DesiredCapabilities.internetExplorer();
		capabilities.setCapability(InternetExplorer.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
		capabilities.setCapability(InternetExplorer.IGNORE_ZOOM_SETTING, true);
		
		System.setProperty("webdriver.ie.driver", "/Users/abvn237/eclipse-workspace/SeleniumThree/msedgerdriver");
		
		InternetExplorerDriver driver = new InternetExplorerDriver();
		
		driver.get("http:way2automation.com");*/
		
        /*System.setProperty("webdriver.opera.driver", "/Users/abvn237/eclipse-workspace/SeleniumThree/MicrosoftWebDriver");
		
		EdgeDriver driver = new EdgeDriver();
		
		driver.get("http:way2automation.com");*/
		
		
		 System.setProperty("webdriver.opera.driver", "/Users/abvn237/eclipse-workspace/SeleniumThree/operadriver");
			
			OperaDriver driver = new OperaDriver();
			
			driver.get("http:way2automation.com");
			
			DesiredCapabilities capabilities = new DesiredCapabilities.Opera();
			OperaOptions options = new OperaOptions();
			options.setBinary("/Users/abvn237/eclipse-workspace/SeleniumThree/operadriver");
			capabilities.setCapability(OperaOptions.CAPABILITY, options);
			
			OperaDriver driver = new OperaDriver(options);
			driver.get("http://way2automation.com");
		
		
		/* System.setProperty("webdriver.firefox.driver", "/Users/abvn237/eclipse-workspace/SeleniumThree/geckodriver");
			
			ChromeDriver driver = new ChromeDriver();
			
			driver.get("http:way2automation.com");*/
		
	}

}
