package PageClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import BaseClasses.PageBaseClass;
import BaseClasses.TopMenuClass;

public class LandingPage extends PageBaseClass
{

	//WebDriver driver = null;
	
	public ExtentTest logger;
	
	
	public TopMenuClass topmenu;
	
	public LandingPage(WebDriver driver, ExtentTest logger)
	{
		super(driver,logger);
	}

	
	@FindBy(xpath="//*[contains(@class,'moneyicon']")
	public WebElement moneyLink;
	
	
	/*public void openBrowser()
	{
		System.setProperty("webdriver.firefox.driver", System.getProperty("user.dir")+"/SeleniumPOMFramework/geckodriver");
		driver = new FirefoxDriver();
	}
	
	public void openWebsite()
	{
		driver.get("https://www.rediff.com/");
	}
	
	public LoginPage clickSignIn()
	{
		return PageFactory.initElements(driver, LoginPage.class);
		//return new LoginPage();
	}
	
	public void getTitle()
	{
		
	}*/
	
	public MoneyPage clickMoneyLink()
	{
		logger.log(Status.INFO, "Clicking the Money Link, Present in Number");
		moneyLink.click();
		logger.log(Status.PASS, "Clicked the Money Link");
		
		MoneyPage moneyPage = new MoneyPage(driver,logger);
		
		PageFactory.initElements(driver,MoneyPage.class);
		
		return moneyPage;
	}
	
	public LoginPage clickSignIn()
	{
		return PageFactory.initElements(driver, LoginPage.class);
		
	}
}
