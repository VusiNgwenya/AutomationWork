package PageClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import BaseClasses.PageBaseClass;
import BaseClasses.TopMenuClass;

public class LoginPage extends PageBaseClass{
	
	WebDriver driver;
	
	public TopMenuClass topmenu;
	
	public LoginPage(WebDriver driver)
	{
		this.driver = driver;
		topmenu = PageFactory.initElements(driver, TopMenuClass.class);
	}
	
	public RediffMailPage doLogin()
	{
		return new RediffMailPage();
	}
	
	public TopMenuClass getTopmenu()
	{
		return topmenu;
	}
	
	public void getTitle()
	{
		
	}

}
