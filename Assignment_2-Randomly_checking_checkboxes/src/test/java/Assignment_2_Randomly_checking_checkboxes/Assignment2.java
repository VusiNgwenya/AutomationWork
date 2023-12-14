//Selenium 4 WebDriver with java(Basics + Advance + Architect) - Section 28 - Assignment 2 - Randomly checking checkboxes - Vusi Ngwenya 

package Assignment_2_Randomly_checking_checkboxes;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Assignment2 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.firefox.driver","/Assignment_2-Randomly_checking_checkboxes/geckodriver");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("http://tizag.com/htmlT/htmlcheckboxes.php");
		
		WebElement soccer = driver.findElement(By.xpath("/html/body/table[3]/tbody/tr[1]/td[2]/table/tbody/tr/td/div[4]/input[1]"));
		
		WebElement football = driver.findElement(By.xpath("/html/body/table[3]/tbody/tr[1]/td[2]/table/tbody/tr/td/div[4]/input[2]"));
		
		WebElement baseball = driver.findElement(By.xpath("/html/body/table[3]/tbody/tr[1]/td[2]/table/tbody/tr/td/div[4]/input[3]"));
		
		WebElement basketball = driver.findElement(By.xpath("/html/body/table[3]/tbody/tr[1]/td[2]/table/tbody/tr/td/div[4]/input[4]"));
		
		double rand = Math.random();
			
		if(rand >= 0.5)
		{
			baseball.click();
			basketball.click();
		}
		else if(rand == 0.5)
		{
			soccer.click();
			football.click();
		}
		else if(rand <= 0.5)
		{ 
			football.click();
			baseball.click();
		}
		else 
		{
			soccer.click();
			basketball.click();
		}
			
		driver.close();
	}

}
