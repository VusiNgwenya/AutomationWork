package com.datadriven.framework.base;

import org.apache.logging.log4j.Logger;

public interface BaseUI {
	
	Logger logger;
	
	public void waitForPageLoad()
	{
		//JavascriptEs
	}
	
	public void doLogin()
	{
		logger.log(Status.INFO,"Loggin the Application");
		invokeBrowser();
		openURL("webdriver");
		elementClick("zohoLoginTextBox_ClassName")
		
	}
}
