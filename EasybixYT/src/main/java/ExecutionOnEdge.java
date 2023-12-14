import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ExecutionOnEdge
{

	WebDriver driver = null;
	String edgeDriver = "/EasybixYT/MicrosoftWebDriver";
	
	@BeforeTest
	public void initBrowser()
	{
		System.setProperty("webdriver.edge.driver", edgeDriver);
		driver = new EdgeDriver();
		
	}
	
	@Test
	public void openApplication()
	{
		driver.get("https://facebook.com");
		driver.manage().window().maximize();
	}
	
	
}
