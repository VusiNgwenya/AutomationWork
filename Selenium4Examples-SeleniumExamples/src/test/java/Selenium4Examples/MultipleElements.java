package Selenium4Examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultipleElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.firefox.driver","/Selenium4Examples-SeleniumExamples/geckodriver");
		
		WebDriver driver = null;
		
		driver = new FirefoxDriver();
		
		driver.get("https://www.hollisterco.com/shop/wd");
		
		System.out.println("Total links on entire page-->"+driver.findElements(By.tagName("a")).size());
		
		WebElement footerdriver = driver.findElement(By.cssSelector(".footer__info-links.grid-col.grid-col-2"));
		
		System.out.println("Total links on footer section-->"+footerdriver.findElements(By.tagName("a")).size());
		
		WebElement columndriver = driver.findElement(By.cssSelector(".footer__info-links.grid-col.grid-col-2 ul ul"));
		System.out.println("Total links in first column-->"+columndriver.findElements(By.tagName("a")).size());
		
		
		
		/*driver.get("http://echoecho.com/htmlforms10.htm");
		
		int count = driver.findElements(By.xpath("//input[@name='group1']")).size();
		
		for(int i=0;i<count;i++)
		{
			System.out.println(driver.findElements(By.xpath("//input[@name='group1']")).get(i).getAttribute("value"));
			driver.findElements(By.xpath("//input[@name='group1']")).get(i).click();
		}*/
		
		/*driver.get("https://facebook.com");
		
		
		driver.findElement(By.xpath("//label[@for='Armed']")).click();*/
		
		//driver.findElement(By.cssSelector(".inputtext.login_form_input_box")).sendKeys("dummy@gmail.com");
		
		
		//driver.findElement(By.xpath("//*[text()='Men']")).click();
		
		//driver.findElement(By.cssSelector("input.inputtext")).sendKeys("dummy@gmail.com");
		//driver.findElement(By.cssSelector("td:nth-of-type(2) input.inputtext")).sendKeys("dummy@gmail.com");
		//driver.findElement(By.cssSelector("td:nth-of-type(1) inout.inputtext")).sendKeys("dummy@gmail.com");
		//driver.findElement(By.cssSelector("tr> td:nth-child(1) input.inputtext")).sendKeys("dummy@gmail.com");
		//driver.findElement(By.cssSelector("td:nth-of-child(2) input.inputtext")).sendKeys("dummy@gmail.com");
		//driver.findElement(By.xpath("(//span[@class='_5k_3']/span[3]")).click();
		
		//driver.findElement(By.xpath("(//span[@class='_5k_3']/span")).click();
		
		//driver.findElement(By.xpath("//div[@class='a4bIc']/input")).sendKeys("home");
		//driver.findElement(By.cssSelector("div[class='a4bIc'] input")).sendKeys("home");
		
		//driver.findElement(By.xpath("(//span[@class='_5k_3']/span")).click();		
		
		//driver.findElement(By.xpath("//span[@class='_5k_2 _5dba']/following-sibling::span[1]")).click();
		
		//driver.findElement(By.xpath("//span[@class='_5k_2 _5dba']/following-sibling::span[2]")).click();
		//driver.findElement(By.xpath("//span[@class=='_5k_2 _5dba']")).click();
		
		/*driver.findElement(By.xpath("//span[@class='_5k_3']/span")).click();
		driver.findElement(By.xpath("//span[@class='_5k_2 _5dba']/following-sibling::span[1]")).click();
		driver.findElement(By.xpath("//span[@class='_5k_2 _5dba']/following-sibling::span[2]")).click();*/
		
		driver.findElement(By.xpath("//label[@class='_58mt']/parent::span")).click();
		
	}

}
