package TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import PageClasses.LandingPage;
import PageClasses.LoginPage;
import PageClasses.RediffMailPage;

public class MailTests 
{

	@Test
	public void writeMultiTest()
	{
		/*System.setProperty("webdriver.firefox.driver", System.getProperty("user.dir")+"/SeleniumPOMFramework/geckodriver");
		WebDriver driver = new FirefoxDriver();*/
		
		LandingPage landingPage = new LandingPage();
		landingPage.getTitle();
		landingPage.openBrowser();
		landingPage.openWebsite();
		
		LoginPage loginPage = landingPage.clickSignIn();
		loginPage.getTitle();
		
		RediffMailPage rediffmailPage = loginPage.doLogin();
		rediffmailPage.getTitle();
	}
}
