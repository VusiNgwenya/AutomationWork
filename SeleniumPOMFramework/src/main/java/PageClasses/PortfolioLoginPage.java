package PageClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.aventstack.extentreports.Status;

import BaseClasses.PageBaseClass;

public class PortfolioLoginPage extends PageBaseClass
{
	public PortfolioLoginPage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	@FindBy(id="useremail")
	public WebElement usermail_TextBox;
	
	@FindBy(id="emailsubmit")
	public WebElement emailSubmit_button;
	

	@FindBy(id="userpass")
	public WebElement userSubmit_button;
	
	@FindBy(id="emailpass")
	public WebElement password_TextBox;
	

	@FindBy(id="loginsubmit")
	public WebElement submitLogin_button;
	
	public MyPortfolioPage doLogin(String userName,String password)
	{
		usermail_TextBox.sendKeys(userName);
		logger.log(Status.PASS,"Entered the UserName: "+userName);
		emailSubmit_button.click();
		logger.log(Status.PASS, "Clicked the UserName Submit Button");
		password_TextBox.sendKeys(password);
		logger.log(Status.PASS, "Entered the Password : "+password);
		submitLogin_button.click();
		
		logger.log(Status.INFO,"Clicking the Sign-Out Link");
		
		try
		{
			Thread.sleep(5000);
			
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
		
		String currentPageTitle = driver.getTitle();
		
		if(currentPageTitle.equals("Indian stock markets : login to Portfolio"))
		
		Assert.fail();	
		
		MyPortfolioPage myportfolioPage = new MyPortfolioPage(driver,logger);
		PageFactory.initElements(driver, myportfolioPage);
		
		return myportfolioPage;
	
	}
	
	public void enterUser(String userName)
	{
		usermail_TextBox.sendKeys(userName);
		logger.log(Status.PASS, "Enter the UserName :"+userName);
	}
	
	public void submitUserName()
	{
		emailSubmit_button.click();
		logger.log(Status.PASS, "Clicked the UserName Submit Button");
	}
	
	public void enterPassword(String password)
	{
		password_TextBox.sendKeys(password);
		logger.log(Status.PASS, "Entered the Password :"+password);
	}
	
	public MyPortfolioPage submitLogin()
	{
		submitLogin_button.click();
		logger.log(Status.PASS, "Clicked the submit Login Button");
		MyPortfolioPage myportfolioPage = new MyPortfolioPage(driver,logger);
		PageFactory.initElements(driver, myportfolioPage);
		return myportfolioPage;
	}
	
	public void verifyPasswordField()
	{
		
	}
	
	public static void clickCreatePortfolio()
	{
		
	}
	

}
