package overriding;

public class TestCase1 extends Base{

	public static String browserName = "firefox";
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		TestCase1 tc = new TestCase1();
		tc.initBrowser();
		
		
	}
	
	public void initBrowser()
	{
		WebDriver driver = getBrowserInstance(browserName);
		//ChromeDriver driver = new ChromeDriver();
		driver.click();
		driver.sendKeys();
		driver.getTitle();
		
	}

}
