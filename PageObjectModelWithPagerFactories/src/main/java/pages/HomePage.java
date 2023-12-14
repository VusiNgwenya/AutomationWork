package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import base.BasePage;
import base.NewCarsPage;

public class HomePage extends BasePage
{
	

	public HomePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath="//*[@id=\"cw-top-navbar\"]/li[1]/div[1]/span[1]")
	public WebElement newCars;
	
	@FindBy(xpath="//*[@id=\"cw-top-navbar\"]/li[1]/div[2]/div[2]/div/div[1]/div[1]/ul")
	public WebElement findNewCars;
	
	public NewCarsPage findnewCar()
	{
		new Actions(driver).moveToElement(newCars).perform();
		findNewCars.click();
		
		return new NewCarsPage(driver);
	}
	
	
}
