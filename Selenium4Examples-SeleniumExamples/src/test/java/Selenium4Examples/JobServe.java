package Selenium4Examples;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class JobServe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.firefox.driver", "/Selenium4Examples-SeleniumExamples/geckodriver");
		
		WebDriver driver = null;
		
		String industry = "Education";
		
		driver = new FirefoxDriver();
		
		driver.get("https://www.jobserve.com/in/en/Job-Search/");
		
		driver.findElement(By.xpath("//span[contains(text(),'27 Industries Selected')]")).click();
		driver.findElement(By.xpath("//input[@id='ddcl-selIn-i0']")).click();
		
		List<WebElement> allindustries = driver.findElements(By.xpath("//div[@id='industryDisplay']/div/div/div/label"));
		
		for(int i=0;i<allindustries.size();i++)
		{
			//System.out.println(allindustries.get(i).getText());
			
			if(allindustries.get(i).getText().equalsIgnoreCase(industry))
			{
				allindustries.get(i).click();
			}
		}
	}

}
