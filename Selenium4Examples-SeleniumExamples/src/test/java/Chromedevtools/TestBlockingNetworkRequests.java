package Chromedevtools;

import java.util.Optional;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v85.network.Network;
import org.openqa.selenium.firefox.FirefoxDriver;

import graphql.com.google.common.collect.ImmutableList;

public class TestBlockingNetworkRequests {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.firefox.driver", "/Selenium4Examples-SeleniumExamples/geckodriver");
		
		WebDriver driver = new FirefoxDriver();
		

		DevTools devTools = ((FirefoxDriver) driver).getDevTools();
		
		devTools.createSession();
		
		devTools.send(Network.enable(Optional.empty(), Optional.empty(), Optional.empty()));
		
		devTools.send(Network.setBlockedURLs(ImmutableList.of("*.jpg","*.png","*.jpeg")));
		
		driver.get("http://maketrip.com");
		
	}

}
