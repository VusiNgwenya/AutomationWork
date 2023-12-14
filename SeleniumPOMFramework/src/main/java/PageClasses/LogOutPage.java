package PageClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseClasses.PageBaseClass;
import BaseClasses.TopMenuClass;

public class LogOutPage extends PageBaseClass{

	public TopMenuClass topmenu;
	public LogOutPage(WebDriver driver)
	{
		super(driver,logger);
		topmenu = PageFactory.initElements(driver, TopMenuClass.class);
		//this.driver = driver;
	}
	
	@FindBy(xpath="//*[@id='wrapper']/div[4]/a")
	public WebElement loginAgainLink;
	
	public LoginPage clickLoginAgain()
	{
		loginAgainLink.click();
		return PageFactory.initElements(driver, LoginPage.class);
		
	}
	
}
