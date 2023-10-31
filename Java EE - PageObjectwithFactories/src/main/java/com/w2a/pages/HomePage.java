package com.w2a.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {
	
	@FindBy(css="#tab-flight-tab")
	public WebElement flightTab;
	
	public void gotoFlights()
	{
		
	}

}
