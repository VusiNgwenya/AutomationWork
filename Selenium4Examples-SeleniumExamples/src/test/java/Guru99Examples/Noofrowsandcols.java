package Guru99Examples;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Noofrowsandcols {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		WebDriver wd;
		
		System.setProperty("webdriver.firefox.driver", "/Selenium4Examples-SeleniumExamples/geckodriver");
		
		wd = new FirefoxDriver();
		
		wd.get("http://money.rediff.com/gainers/bsc/daily/groupa?");
		
		List<WebElement> col = wd.findElements(By.xpath(".//*[@id=='leftcontainer']/table/thead/tr/th"));
		
		System.out.println("No of cols are : "+col.size());
		
		List<WebElement> rows = wd.findElements(By.xpath(".//*[@id='leftcontainer']/table/tbody/tr/td[1]"));
		
		System.out.println("No of rows are :"+rows.size());
		
		wd.close();
	}

}
