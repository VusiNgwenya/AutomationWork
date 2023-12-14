package base;

import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;

public class BaseTest
{
	public static String fileName;
	
	public static void captureScreenshot()
	{
		Date d = new Date();
		
		fileName = d.toString().replace(":", "_").replace(" ", "_")+".jpg";
		
		File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	}

	public static void captureElementScreenshot(WebElement element)
	{
		Date d = new Date();
		String fileName = d.toString().replace(":", "_").replace(" ", "_")+"";
		
		File screenshot = ((TakesScreenshot) element).getScreenshotAs(OutputType.FILE);
		
		try {
			FileUtils.copyFile(screenshot,new File(System.getProperty("user.dir")));
			FileUtils.copyFile(screenshot,new File(System.getProperty("user.dir")));
		}
		catch(Exception e)
		{
			
		}
	}
}
