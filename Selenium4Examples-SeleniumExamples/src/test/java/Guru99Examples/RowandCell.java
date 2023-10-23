package Guru99Examples;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RowandCell {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		WebDriver wd;
		
		System.setProperty("webdriver.firefox.driver", "/Selenium4Examples-SeleniumExamples/geckodriver");
		
		wd = new FirefoxDriver();
		
		wd.get("https://demo.guru99.com/test/web-table-element.php");
		
		wd.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		WebElement baseTable = wd.findElement(By.tagName("table"));
		
		WebElement tableRow = baseTable.findElement(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr[3]"));
		
		String rowtext = tableRow.getText();
		
		System.out.println("Third row of table : "+rowtext);
		
		WebElement callIneed = tableRow.findElement(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr[3]/td[2]"));
		
		String valueIneed = callIneed.getText();
		
		System.out.println("Cell value is : "+valueIneed);
		
		wd.close();
		
				

	}

}
