package BaseClasses;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentTest;

import Utilities.ExtentReportManager;

public class BaseTestClass
{

	public static ExtentTest logger;
	public static ExtentReportManager report;
	public static WebDriver driver;


	public void invokeBrowser(String str)
	{
		
	}
	
}
