package Chromedevtools;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.devtools.DevTools;
//import org.openqa.selenium.devtools.v85.network.Network;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.devtools.v96.network.Network;
//import org.openqa.selenium.devtools.v96.model.Headers;



import io.netty.handler.codec.Headers;

public class TestRequestAndResponseHeader {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.firefox.driver", "/Selenium4Examples-SeleniumExamples/geckodriver");
		
		
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		
		DevTools devTools = ((FirefoxDriver) driver).getDevTools();
		
		devTools.createSession();
		
		devTools.send(Network.enable(Optional.empty(), Optional.empty(), Optional.empty()));
		
		devTools.addListener(Network.requestWillBeSent(), request->{
			{
				org.openqa.selenium.devtools.v85.network.model.Headers header = request.getRequest().getHeaders();
			
	
				if(!header.isEmpty())
				{
					System.out.println("Request Headers: ");
					
					header.forEach((key,value) -> {
						System.out.println(" "+key+"="+value);
					});
				}
			}});
		
		
		
		devTools.addListener(Network.responseReceived(), response->{
			{
				org.openqa.selenium.devtools.v85.network.model.Headers header = response.getResponse().getHeaders();
				//Headers header = response.getResponse().getHeaders();
				
				
				
				if(!header.isEmpty())
				{
					System.out.println("Request Headers: ");
					
					header.forEach((key,value) -> {
						System.out.println(" "+key+"-"+value);
					});
				}
				
				System.out.println("Response URL is : "+response.getResponse().getUrl()+"Status code");
			}});
		
		Map<String,Object> headers = new HashMap<String,Object>();
		headers.put("customerHeaderName", "customerHeaderValue");
		headers.put("Rahul", "Automation Tester");
		Headers head = new Headers(headers);
		
		devTools.send(Network.setExtraHTTPHeaders(head));
		
		
		
		driver.get("https://reqres.in/api/users?page=2");
	}

}
