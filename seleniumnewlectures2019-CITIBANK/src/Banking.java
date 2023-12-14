import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Banking
{
	public static WebDriver driver=null;
	
	Calculator calc = new Calculator();
	
	public void profit()
	{
		
	}
	
	public void loss()
	{
		
	}
	
	public void addSalary()
	{
		calc.add();
	}
	
	public static void main(String[] args)
	{
		driver = new FirefoxDriver();
		
		driver.get("");
		//driver.get
		
		/*driver.get("https://www.way2automation.com/angularjs-protractor/banking/#/manager");
		
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getPageSource());
		System.out.println(driver.getTitle());*/
	}
	
}
