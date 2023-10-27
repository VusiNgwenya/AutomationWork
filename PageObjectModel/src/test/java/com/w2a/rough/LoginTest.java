package com.w2a.rough;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.w2a.pages.HomePage;
import com.w2a.pages.LoginPage;
import com.w2a.pages.ZohoAppPage;
import com.w2a.pages.crm.accounts.AccountsPage;
import com.w2a.pages.crm.accounts.CreateAccountPage;

public class LoginTest {
	
	public static void main(String[] args)
	{
		System.setProperty("webdriver.firefox.driver", System.getProperty(""));
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://zoho.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		
		
		HomePage home = new HomePage(driver);
		home.goToLogin();
		
		LoginPage login = new LoginPage(driver);
		login.doLogin("traner@way2automation.com", "Selenium@123");
		
		ZohoAppPage zp = new ZohoAppPage(driver);
		
		zp.gotoCRM();
		
	
		
		AccountsPage account = new AccountsPage();
		account.gotoCreateAccount();
		CreateAccountPage cap = new CreateAccountPage();
		
		cap.createAccount("Raman");
		
		
		
	}

}
