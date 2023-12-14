package TestCases;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.datadriven.framework.utils.TestDataProvider;

import BaseClasses.BaseTestClass;
import BaseClasses.PageBaseClass;
import BaseClasses.TopMenuClass;
import PageClasses.LandingPage;
import PageClasses.MoneyPage;
import PageClasses.MyPortfolioPage;
import PageClasses.PortfolioLoginPage;
import Utilities.ExtentReportManager;
import extendListeners.ExtentManager;
import scala.collection.mutable.HashTable;

public class MyPortfolioTest extends BaseTestClass
{

	//ExtentTest report;
	LandingPage landingPage;
	MoneyPage moneyPage;
	PortfolioLoginPage portfolioLoginPage;
	MyPortfolioPage myportfolioPage;
	TopMenuClass topMenu;
	WebElement webElement;
	
	
	@Test(dataProvider="getOpenPortfolioTestData",groups= {"Regression",""})
	public void openPortfolio(HashTable<String, String> testData)
	{
		logger = report.createTest("Login Rediff Portfolio");
		//PageBaseClass pageBase = new PageBaseClass();
		invokeBrowser("chrome");
		
		PageBaseClass pageBase = new PageBaseClass(driver,logger);
		PageFactory.initElements(driver, pageBase);
		
		
		
		
		landingPage = pageBase.OpenApplication();
		
		moneyPage = landingPage.clickMoneyLink();
		
		logger.log(Status.PASS,"Clicked the Money Link Successfully");
		portfolioLoginPage = moneyPage.clickSignInLink();
		
		
		myportfolioPage = portfolioLoginPage.doLogin("anshulc55", "Anshul@12345");
		myportfolioPage.verifyMoneyBiz();
		
		myportfolioPage.getTitle(testData.get("PageTitle"));
			
		topMenu = myportfolioPage.gettopmenu();
		
		topMenu.signOutApplication();
		
	}
	
	
	@DataProvider
	public Object[][] getOpenPortfolioTestData()
	{
		return TestDataProvider.getTestData("RediffPortfolioLaunch","RediffLoginTest","openPortfolio");
	}
	
	@DataProvider
	public Object[][] verifyLoginTestData()
	{
		return TestDataProvider.getTestData("RediffPortfolioLaunch.xlsx","RediffLoginTest","VerifyLogin");
	}
	
	@Test(dataProvider="verifyLoginTestData")
	public void verifyLogin(HashTable<String, String> testData)
	{
		logger = report.createTest("Login Rediff Portfolio :"+testData.get("Comment"));
		
		invokeBrowser("chrome");
		
		PageBaseClass pageBase = new PageBaseClass(driver,logger);
		
		PageFactory.initElements(driver, pageBase);
		
		landingPage = pageBase.OpenApplication();
		
		moneyPage = landingPage.clickMoneyLink();
		
		portfolioLoginPage = moneyPage.clickSignInLink();
		
		portfolioLoginPage.enterUser(testData.get("UserName"));
		
		portfolioLoginPage.submitUserName();
		
		portfolioLoginPage.verifyPasswordField();
		
	}
	
	@Test(dataProvider="addPortfoliotestData",groups= {"Regression","AddPortfolio"})
	public void addPortfolioTest(HashTable<String,String> testData)
	{
		logger = report.createTest("Create Portfolio test : "+testData.get("Comment"));
		
		invokeBrowser("chrome");
		
		PageBaseClass pageBase = new PageBaseClass(driver,logger);
		
		PageFactory.initElements(driver, pageBase);
		
		landingPage = pageBase.OpenApplication();
		
		moneyPage = landingPage.clickMoneyLink();
		
		portfolioLoginPage = portfolioLoginPage.doLogin(testData.get("UserName"), testData.get("Password"));
		
		myportfolioPage.verifyMoneyBiz();
		myportfolioPage.clickCreatePortfolio();
		
		waitForPortfolio();
		myportfolioPage.enterPortfolioName(portfolioName);
		myportfolioPage = myportfolioPage.submitPortfolio();
		myportfolioPage.verifyElementIsDisplayed(webElement);
	
	}
	
}
