package PageClasses;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;

import BaseClasses.PageBaseClass;
import BaseClasses.TopMenuClass;

public class MoneyPage extends PageBaseClass
{
	
	public MoneyPage(WebDriver driver, ExtentTest logger) {
		super(driver, logger);
		// TODO Auto-generated constructor stub
		topmenu = PageFactory.initElements(driver, TopMenuClass.class);
	}

	public TopMenuClass topmenu;
	

	@FindBy(xpath="//*[signin_info]/a[1]")
	public WebElement signinLink;
	
	public PortfolioLoginPage clickSignInLink()
	{
		signinLink.click();
		
		return PageFactory.initElements(driver, PortfolioLoginPage.class);
	}
	
}
