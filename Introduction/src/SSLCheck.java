import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class SSLCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//ChromeOptions options = new ChromeOptions();
		FirefoxOptions options1 = new FirefoxOptions();
		Proxy proxy = new Proxy();
		proxy.setHttpProxy("ipaddress:8000");
		options1.setCapability("proxy", proxy);
		
		Map<String,Object> prefs = new HashMap<String,Object>(); 
		prefs.put("download.default_directory", "/directory/path");
		//EdgeOptions options2 = new EdgeOptions();
		
		options1.setExperimentalOption("prefs",prefs);
		//options.setAcceptInsecureCerts(true);
		options1.setAcceptInsecureCerts(true);
		//options2.setAcceptInsecureCerts(true);
		
		//System.setProperty("webdriver.chrome.driver","/Users/abvn237/eclipse-workspace/Introduction/chromedriver");
		System.setProperty("webdriver.firefox.driver","/Users/abvn237/eclipse-workspace/Introduction/geckodriver");
		
		//WebDriver driver = new ChromeDriver();
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://expired.badssl.com");
		System.out.println(driver.getTitle());

	}

}
