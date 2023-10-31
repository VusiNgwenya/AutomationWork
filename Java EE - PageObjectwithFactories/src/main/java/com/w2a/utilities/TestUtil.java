package com.w2a.utilities;

import java.util.Hashtable;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;

import com.w2a.base.TestBase;

public class TestUtil extends TestBase{

	
	public static void captureScreenshot()
	{
	  File scrFile = ((TakeScreenshot) driver).getScreenshotAs(OutputType.FILE);
	  FileUtils.copyFile(srcFile, new File(System.getProperty("user.dir")+"\\target\\surefire-reports\\html\\error.jpg"));
	  
	}
	
	public static boolean isTestRunnable(String testName,ExcelReader excel)
	{
		int rows = excel.getRowCount(sheetName);
		int cols = excel.getColumnCount(sheetName);
		
		Object[][] data = new Object[rows-1][1];
		
		Hashtable<String,String> table = null;
		
		for(int rNum=2;rNum<=rows;rNum++)	
		{
			table = new Hashtable<String,String>();
			
			for(int colNum=0;colNum<cols;colNum++)
			{
				table.put(excel.getData(sheetName,colNum,1), excel.getData(sheetName,rNum,1));
				
				data[rows-2][colNum] = table;
				
				excel.getCellData(sheetName,"TCID",rNum);
				
				if(testCase.EqualsIgnoreCase(testname))
				
					//excel.getCellData(sheetName,"Runmode",rnum);
					
					if(runmode.equlaIgnoreCase("Y")
							return true;
					else
						return false;
			}
		}
		
		return false;
	}
}
