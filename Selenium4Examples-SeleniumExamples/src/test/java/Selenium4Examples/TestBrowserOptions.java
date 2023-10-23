package Selenium4Examples;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class TestBrowserOptions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<String,String> mobileEm = new HashMap<>();
		
		mobileEm.put("deviceName", "iPhone X");
		
		
		FirefoxOptions opt = new FirefoxOptions();
        opt.addArguments("--headless");
        opt.addArguments("incognito");
        
        opt.setAcceptInsecureCerts(true);
        opt.addArguments("window-size=1200,800");
        opt.setExperimentalOption("excludeSwitches",Collections.singletonList("enable-automation"));
        opt.setExperimentalOption("mobileEmulation",mobileEm);
        
        
        System.setProperty("webdriver.firefox.driver", "/Selenium4Examples/SeleniumExamples/geckodriver");
        
        WebDriver driver = new FirefoxDriver(opt);
        
        driver.get("http://selenium.dev");
        
        System.out.println(driver.getTitle());
        

	}

}
