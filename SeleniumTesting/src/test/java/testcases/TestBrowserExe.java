package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.manager.SeleniumManager;

public class TestBrowserExe {

	public static void main(String[] args)
	{
		/*System.out.println(SeleniumManager.getInstance().getDriverPath("chromedriver"));
		WebDriver driver = new ChromeDriver();*/
		
		System.out.println(SeleniumManager.getInstance().getDriverPath("/Users/abvn237/eclipse-workspace/Introduction/geckodriver"));
		WebDriver driver = new FirefoxDriver();
		
	}
}
