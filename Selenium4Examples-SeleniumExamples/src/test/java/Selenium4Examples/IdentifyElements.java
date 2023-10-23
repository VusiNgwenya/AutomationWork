package Selenium4Examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class IdentifyElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.firefox.driver","/Selenium4Examples-SeleniumExamples/geckodriver");
		
		WebDriver driver = null;
		
		driver = new FirefoxDriver();
		
		driver.get("https://facebook.com");
		
		driver.findElement(By.id("email")).sendKeys("dummy@gmail.com");
		
		driver.findElement(By.name("pass")).sendKeys("dummy");
		
		driver.findElement(By.linkText("Forgotten account?")).click();
		
		driver.findElement(By.cssSelector("[value='Log In']")).click();
	
		
		//driver.findElement(By.partialLinkText("Create")).click();
		
		/*WebElement checkbox = driver.findElement(By.id("u_1b_4_Cu"));
		
		for(int i=0;i<2;i++)
		{
			checkbox.click();
			
			System.out.println(checkbox.isSelected());
		}*/
		
		//driver.findElement(By.xpath("//label[@for='u_1b_6_bd']")).click();
		
		//driver.findElement(By.xpath("//label[@for='Armed']")).click();
		
		//driver.findElement(By.cssSelector(".inputtext._58mg _5dba _2ph-")).sendKeys("Dummy");

		//driver.findElement(By.cssSelector("div[class='inputtext _58mg _5dba _2ph-'] input")).sendKeys("Dummy");
		
		//driver.findElement(By.xpath("//div[@class='inputtext _58mg _5dba _2ph-']/input")).sendKeys("Dummy");
		
		/*driver.findElement(By.cssSelector("input#u_2_b_\\/4")).sendKeys("Dummy");
		
		driver.findElement(By.cssSelector("input#u_2_d_Av")).sendKeys("Dummy Dummy");
		
		driver.findElement(By.cssSelector("input#u_2_g_v4")).sendKeys("dummy@gmail.com");
		
	    driver.findElement(By.cssSelector("input#password_step_input")).sendKeys("Dummy password");*/
		
		
		
		/*driver.findElement(By.name("firstname")).sendKeys("dummy");
		
		driver.findElement(By.name("lastname")).sendKeys("dummy dummy");
		
		driver.findElement(By.name("reg_email__")).sendKeys("dummy@gmail.com");
		
		driver.findElement(By.name("reg_passwd__")).sendKeys("dummy password");*/
		
		
		/*driver.findElement(By.id("u_2_b_/4")).sendKeys("dummy");
		
		driver.findElement(By.id("u_2_d_Av")).sendKeys("dummy dummy");
		
		driver.findElement(By.id("u_2_g_v4")).sendKeys("dummy@gmail.com");
		
		driver.findElement(By.id("password_step_input")).sendKeys("dummy password");*/
		
	
		/*driver.findElement(By.xpath("//*[contains(@id,'u_2_b')]")).sendKeys("dummy");
		driver.findElement(By.xpath("//*[contains(@id,'u_2_d')]")).sendKeys("dummy dummy");
		driver.findElement(By.xpath("//*[contains(@id,'u_2_g']")).sendKeys("dummy@gmail.com");
		driver.findElement(By.xpath("//*[contains(@id,'passw']")).sendKeys("dummy password");*/
		
		
		/*
		driver.findElement(By.xpath("//*[@id='u_2_b_/4']")).sendKeys("dummy");
		
		driver.findElement(By.xpath("//*[@id='u_2_d_Av']")).sendKeys("dummy summy");
		
		driver.findElement(By.xpath("//*[@id='u_2_g_v4']")).sendKeys("dummy@gmail.com");
		
		driver.findElement(By.xpath("//*[@id='password_step_input']")).sendKeys("dummy password");*/
		
		//driver.findElement(By.xpath("//*[contains(@id,'u_2_b_/')]")).sendKeys("dummy");
		
		//driver.findElement(By.id(null))
		
		//driver.findElement(By.xpath("//*[@id='u_2_a_/M']")).sendKeys("dummy");
		
		/*WebElement element = driver.findElement(By.id("u_2_b_/4"));
		
		element.findElement(By.tagName("input")).sendKeys("Dummy");*/
		
		//driver.findElement(By.id("u_2_b_/4")).sendKeys("Dummy");
		//driver.findElement(By.className("inputtext _58mg _5dba _2ph-")).sendKeys("dummy");
		
		//driver.findElement(By.cssSelector("input.u_2_b_/4")).sendKeys("dummy@gmail.com");
		
		//driver.findElement(By.cssSelector("#u_2_b_/4")).sendKeys("dummy");
		
		//driver.findElement(By.cssSelector("#u_2_g_v4")).sendKeys("dummy@gmail.com");
		
		//driver.findElement(By.xpath("//*[@id='u_2_b_/4']")).sendKeys("dummy");
		
		//driver.findElement(By.xpath("//*[@id='u_2_g_v4']")).sendKeys("dummy@gmai.com");
		
		//driver.findElement(By.name("firstname")).sendKeys("dummy");
		
		//driver.findElement(By.id("input[@id='u_6_g_n2']")).sendKeys("dummy@gmail.com");
		//driver.findElement(By.name("reg_email__")).sendKeys("dummy@gmail.com");
		
		//driver.findElement(By.cssSelector("#u_6_g_n2")).sendKeys("dummy@gmail.com");
	}

}
