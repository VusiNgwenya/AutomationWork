package Selenium4Examples;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Table {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String companyName = "Hero MotorCorp";
		
		System.setProperty("webdriver.firefox.driver","Selenium4examples-SeleniumExamples/geckodriver");
		
		WebDriver driver = null;
		
		driver = new FirefoxDriver();
		
		driver.get("https://money.rediff.com/bse/daily/group?src=gain_lose");
		
		List<WebElement> companyNames = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td[1]"));
		
		List<WebElement> currentPrices = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td[4]"));
		
		
		for(int i=0;i<companyNames.size();i++)
		{
			System.out.println(companyNames.get(i).getText()+"--------------------"+currentPrices.get(i).getText());
		}
	}

}
