package com.datadriven.framework.utils;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelDataFile 
{
	
	public String path;
	public FileInputStream fis = null;
	public FileOutputStream fileOut = null;
	private XSSFWorkbook workbook = null;
	private XSSFSheet sheet = null;
	private XSSFRow row = null;
	private XSSFCell cell = null;

	public ReadExcelDataFile(String path)
	{
		this.path = path;
		
		try
		{
			fis = new FileInputStream(path);
			workbook = new XSSFWorkbook(fis);
			sheet = workbook.getSheetAt(0);
			fis.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public int getRowCount(String sheetName)
	{
		int index = workbook.getSheetIndex(sheetName);
		
		if(index ==-1)
		{
			return 0;
		}
		else
		{
			sheet = workbook.getSheetAt(index);
			int number = sheet.getLastRowNum()+1;
			
			return number;
		}
		
	}
	
	
	public String getCellData(String sheetName,int indx,int startRowNum)
	{
		int index = workbook.getSheetIndex(sheetName);
		
		if(index ==-1)
		{
			return 0;
		}
		else
		{
			sheet = workbook.getSheetAt(index);
			int number = sheet.getLastRowNum()+1;
			
			return number;
		}
		
	}
}
