package testnglearning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class TestParameterization 
{
	public static WebDriver driver;
	
	
	@Test(dataProvider="dpi")
	public void loginTest(String username,String password)
	{
		driver.get("http://facebook.com");
		
		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys(username);
		driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys(password);
	}

}
