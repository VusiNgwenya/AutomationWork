package TestCases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import BaseClasses.BaseTestClass;
import BaseClasses.PageBaseClass;
import PageClasses.LandingPage;
import PageClasses.MoneyPage;
import PageClasses.MyPortfolioPage;
import PageClasses.PortfolioLoginPage;
import scala.collection.mutable.HashTable;

public class MyStockTest extends BaseTestClass
{
	LandingPage landingPage;
	MoneyPage moneyPage;
	PortfolioLoginPage portfolioLoginPage;
	MyPortfolioPage myportfolioPage;
	
	@Test
	public void addStockTest(HashTable<String,String> testData)
	{
		//logger = report
		logger = report.createtest("Add Stock in : "+testData.get("Portfolio")+ " - Stock Name "+ testData.get(""));
		
		invokeBrowser("chrome");
		
		PageBaseClass pageBase = new PageBaseClass(driver,logger);
		PageFactory.initElements(driver, pageBase);
		
		landingPage = pageBase.OpenApplication();
		moneyPage = landingPage.clickMoneyLink();
		
		portfolioLoginPage = moneyPage.clickSignInLink();
		myportfolioPage = portfolioLoginPage.doLogin(testData.get("UserName"), testData.get("Password"));
		myportfolioPage.verifyMoneyBiz();
	}

}
