package PageClasses;

import java.util.List;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import BaseClasses.PageBaseClass;
import BaseClasses.TopMenuClass;

public class MyPortfolioPage extends PageBaseClass{
	
	public TopMenuClass topmenu;
	
	public MyPortfolioPage(WebDriver driver,ExtentTest logger)
	{
		//this.driver = driver;
		super(driver,logger);
		topmenu = PageFactory.initElements(driver, TopMenuClass.class);
		PageFactory.initElements(driver, topmenu);
	}
	


	@FindBy(xpath="//*[@id='headcount']/div[1]/div[1]/a/span")
	public WebElement moneyBiz_text;
	
	@FindBy(id="createPortfolio")
	public WebElement createportfolio_Btn;
	
	@FindBy(id="create")
	public WebElement createportfolio_textbox;
	
	@FindBy(id="createPortfolioButton")
	public WebElement submitCreatePortfolio_Btn;
	
	@FindBy(id="portfolioid")
	public WebElement myPortfolioList;
	
	@FindBy(id="deletePortfolio")
	public WebElement deletePortfolio_Btn;
	
	@FindBy(id="adStock")
	public WebElement addStock_Btn;
	
	@FindBy(id="adStockname")
	public WebElement stockName_TextBox;
	
	public void enterStockName(String stockName)
	{
		try
		{
			stockName_TextBox.sendKeys(stockName);
		}
		catch(Exception e)
		{
			reportFail(e.getMessage());
		}
	}
	
	public void clickAddStock()
	{
		try
		{
			addStock_Btn.click();
			logger.log(Status.PASS, "Clicked the Add Stock Button");
		}
		catch(Exception e)
		{
			reportFail(e.getMessage());
		}
	}
	
	public void deletePortfolio()
	{
		try {
			deletePortfolio_Btn.click();
		}
		catch(Exception e)
		{
			
		}
	}
	
	public void isPortfolioExists(String portfolio)
	{
		boolean flag;
		try
		{
		    List<WebElement> allOptions = getAllElementsOfDropDown(myPortfolioList);
		    
		    for(WebElement option : allOptions)
		    {
		    	
		    	if(option.getText().equalsIgnoreCase(portfolio))
		    	{
		    		flag = true;
		    	}
		    	else
		    	{
		    		flag = false;
		    	}
		    	
		    	Assert.assertTrue(flag);
		    	logger.log(Status.PASS, "Given Portfolio : "+portfolio+"Present in Portfo;io");
		    	
		    	
		    }
		}
		catch(Exception e)
		{
			reportFail(e.getMessage())
		}
	}
	
	
	public MyPortfolioPage submitPortfolio()
	{
		try
		{
			submitCreatePortfolio_Btn.click();
			logger.log(Status.PASS, "Submitted the Portfolio");
		}
		catch(Exception e)
		{
			reportFail(e.getMessage());
		}
		
		return new MyPortfolioPage(driver,logger);
	}
	public void enterPortfolioName(String portfolioName)
	{
		try
		{
			createportfolio_textbox.clear();
			createportfolio_textbox.sendKeys(portfolioName);
			logger.log(Status.PASS, "Enter Portfolio Name : "+portfolioName);
		}
		catch(Exception e)
		{
			reportFail(e.getMessage());
		}
	}
	
	
	public void verifyMoneyBiz()
	{
		moneyBiz_text.isDisplayed();
	}
	
	public TopMenuClass gettopmenu()
	{
		return topmenu;
	}
	
	public void clickCreatePortfolio()
	{
		
	}
	
	public void isPortfolioDeleted(String portfolio)
	{
		boolean flag = false;
		
		try
		{
			List<WebElement> allOptions = getAllElementsOfDropDown(myPortfolioList);
			
			for(WebElement option : allOptions)
			{
				if(!option.getText().equalsIgnoreCase(portfolio))
				{
				   flag = true;
				}
				else
				{
					flag = false;
				}
				
				Assert.assertTrue(flag);
				
				logger.log(Status.PASS, "Given Portfolio : "+portfolio+" is not present in portfolio List");
			}
			
		}
		catch(Exception e)
		{
			reportFail(e.getMessage());
		}
	}

}
