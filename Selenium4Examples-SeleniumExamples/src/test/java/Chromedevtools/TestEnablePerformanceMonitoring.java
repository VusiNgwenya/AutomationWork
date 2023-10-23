package Chromedevtools;

import java.util.List;
import java.util.Optional;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v113.performance.Performance;
import org.openqa.selenium.devtools.v115.performance.model.Metric;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestEnablePerformanceMonitoring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.firefox.driver", "/Selenium4Examples-SeleniumExamples/geckodriver");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		
		DevTools devTools = ((FirefoxDriver) driver).getDevTools();
		devTools.createSession();
		
		devTools.send(Performance.enable(Optional.of(Performance.EnableTimeDomain.TIMETICKS)));

		driver.get("http://google.com");
		
		List<org.openqa.selenium.devtools.v113.performance.model.Metric> metrics = devTools.send(Performance.getMetrics());
	}

}
