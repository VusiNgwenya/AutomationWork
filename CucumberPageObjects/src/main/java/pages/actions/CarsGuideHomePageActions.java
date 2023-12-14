package pages.actions;

import org.openqa.selenium.support.PageFactory;

public class CarsGuideHomePageActions {
	GuideHomePageLocators carsGuideHomePageLocators = null;
	
	
	public CarsGuideHomePageActions()
	{
		this.carsGuideHomePageLocators = new CarsGuideHomePageLocators();
		PageFactory.initElements(SeleniumDriver.getDriver(), carsGuideHomePageLocators);
	}
	
	public void SelectLocation(String str)
	{
		
	}
	
	public void selectCarMake(String carBrand)
	{
		Select selectCarMaker = new Select 
	}
}
