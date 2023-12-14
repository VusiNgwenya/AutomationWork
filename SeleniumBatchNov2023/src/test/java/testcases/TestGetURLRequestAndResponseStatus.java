package testcases;

import java.util.Optional;

import org.asynchttpclient.Request;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v85.network.Network;
import org.openqa.selenium.devtools.v85.network.model.Response;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestGetURLRequestAndResponseStatus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.firefox.driver", "SeleniumBatchNov2023/geckodriver");
		
		WebDriver driver = new FirefoxDriver();
		
		DevTools devTools = ((FirefoxDriver) driver).getDevTools();
		devTools.createSession();
		
		devTools.send(Network.enable(Optional.empty(), Optional.empty(),Optional.empty());
		
		devTools.addListener(Network.requestWillBeSent(), request ->{
			Request req = req.getRequest();
			
			System.out.println("request URL is : "+req.getUrl()+"req status is : "+req.getStatus());
			
			
		});
		
		devTools.addListener(Network.responseReceived(), response->{
			Response req = response.getResponse();
			
			System.out.println("Response URL is : "+req.getUrl()+" req status is :"+req.getStatus());
		});

	}

}
