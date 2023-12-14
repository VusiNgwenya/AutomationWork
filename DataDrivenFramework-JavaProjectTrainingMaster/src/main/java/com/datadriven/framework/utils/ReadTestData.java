package com.datadriven.framework.utils;

public class ReadTestData {

	
	public static void main(String args[])
	{
		ReadExcelDataFile readdata= new ReadExcelDataFile(System.getProperty("user.dir")+"/DataDrivenFramework-JavaProjectTrainingMaster");
		
		String sheetName = "Feature 1";
		String testName = "Test One";
		
		int startRowNum = 0;
		
		while(!readdata.getCellData(sheetName,0,startRowNum).equalsIgnoreCase(testName))
		{
			startRowNum++;
		}
		
		System.out.println("Test Starts from Row Number :"+startRowNum);
		
		
		int startTestColumn = startRowNum +1;
		int startTestRow = startRowNum+2;
	}
}
