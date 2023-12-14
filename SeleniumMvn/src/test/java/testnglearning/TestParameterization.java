package testnglearning;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestParameterization
{

	public static WebDriver driver;
	
	@BeforeTest
	public void setUp()
	{
	   System.setProperty("webdriver.firefox.driver", "/SeleniumMvn/geckodriver");
	   
	   driver = new FirefoxDriver();
	   
	   driver.manage().window().maximize();
	   driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	   
	   
	}
	
	@Test(dataProvider="dp")
	public void doLogin(String username,String password)
	{
		driver.get("http://facebook.com");
		driver.findElement(null)
	}
	
	
	@DataProvider(name="dp")
	public Object[][] getData()
	{
		String sheetName = "LoginTest";
		ExcelReader excel = new ExcelReader(".\\src\\test\\resources\\excel\\test");
		
		int rowCount = excel.getRowCount();
		int colCount = excel.getColumnCount();
		
		System.out.println(excel.getCellData(sheetName,0,2));
		System.out.println("Total rows are :"+rowCount+"-----total cols are:");
		
		Object[][] data = new Object[rowCount-1][colCount];
	}
}
