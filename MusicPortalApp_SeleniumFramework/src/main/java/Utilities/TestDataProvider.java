package com.datadriven.framework.utils;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import scala.collection.mutable.HashTable;

public class TestDataProvider {

	@Test(dataProvider="getTestData")
	public void sampleTestData(String col1,String col2,String col3,String col4,String col5,String col6)
	{
		
	}
	
	
	
	@DataProvider
	public Object[][] getTestData(String dataFile,String sheetName,String testName)
	{
	    ReadExcelDataFile readdata = new ReadExcelDataFile(System.getProperty("user.dir")+"/DataDrivenframework-JavaProjectTrainingMaster/TestData_Testmanagement.xlsx")
	    
	    String sheetName = "Feature 1";
	    String testName = "Test Two";
	    
	    int startRowNum = 0;
	    int startColumnNum=0;
	    
	    while(!readdata.getCellData(sheetName, 0, startRowNum).equalsIgnoreCase(testName))
	    {
	    	startRowNum++;
	    }
	    
	    int startTestColumn = startRowNum +1;
	    int startTestRow = startRowNum+2;
	    
	    int rows =0;
	    
	    while(!readdata.getCellData(sheetName, 0, startRowNum).equals(""))
	    {
	    	rows++;
	    }
	    
       int columns =0;
       
    
	    while(!readdata.getCellData(sheetName, 0, startColumnNum).equals(""))
	    {
	    	rows++;
	    }
	    
	    
	    Object[][] dataSet = new Object[rows][1];
	    
	    HashTable<String, String> dataTable = null;
	    
	    int dataRowNumber = 0;
	    
	    for(int rowNumber = startTestRow;rowNumber <= startTestColumn + rows; rowNumber++)
	    {
	    	dataTable = new HashTable<String,String>();
	    	
	    	for(int colNumber -0;colNumber <=columns;colNumber++)
	    	{
	    	   String key = readdata.getCellData(sheetName, colNumber, startRowNum);	
	    	}
	    	
	    	   dataRowNumber++;
	    }
	    
	 
	    
	}
}
