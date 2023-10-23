package Java_EE;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.IOException;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class TestUtil {
	
	public static WebDriver driver = null;
	public static String mailscreenshotpath;
	
	public static void captureScreenshot(String methodName)
	{
		Calendar cal = new GregorianCalendar();
		
		
		int month = cal.get(Calendar.MONTH);
		int year = cal.get(Calendar.YEAR);
		int sec = cal.get(Calendar.SECOND);
		int min = cal.get(Calendar.MINUTE);
		int date = cal.get(Calendar.DATE);
		int day = cal.get(Calendar.HOUR_OF_DAY);
		
	    
		File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		
		try
		{
			mailscreenshotpath = System.getProperty("user.dir")+"\\screenshot"+year+"_"+date+"_"+(month+1)+"_"+day+"_"+min+"_"+sec+".jpeg";
			FileUtils.copyFile(srcFile, new File(mailscreenshotpath));
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		
	}
	
	public static void zip(String filePath)
	{
		try
		{
			File inFolder = new File(filePath);
			File outFolder = new File("Reports.zip");
			ZipOutputStream out = new ZipOutputStream(new BufferedStream());
			
			BufferedInputStream in = null;
			
			byte[] data = new byte[1000];
			String files[] = inFolder.list();
			
			for(int i=0;i<files.length;i++)
			{
				in = new BuferredInputStream(new FileInputStream(
						inFolder.getPath()+"/"+files(i)),1000);
				out.putNextEntry(new ZipEntry(files[i]));
				
				int count;
				
				while((count = in.read(data,0,1000)) != -1)
				{
					
				}
			}
			
			
		}
	}

}
