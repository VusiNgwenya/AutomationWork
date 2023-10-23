package Utilities;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.hssf.util.HSSFColor;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFCellStyle;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader 
{

	public String path;
	public FileInputStream fis = null;
	public FileOutputStream fileOut = null;
	public XSSFWorkbook workbook = null;
	public XSSFSheet sheet = null;
	public XSSFRow row = null;
	public XSSFCell cell = null;
	public String url="";
	
	public ExcelReader(String path)
	{
		this.path = path;
		try {
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
	
	public boolean setCellData(String sheetName,String colname,int rowNum, String data,int index)
	{
		try
		{
			fis = new FileInputStream(path);
			workbook = new XSSFWorkbook(fis);
			
			if(rowNum<=0)
				return false;
			
			int indec = workbook.getSheetIndex(sheetName);
			int colNum =-1;
			
			if(index==-1)
				return false;
			
		
			sheet = workbook.getSheetAt(index);
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return true;
	}
	
	public int getRowCount(String sheetName)
	{
		int index = workbook.getSheetIndex(sheetName);
		
		if(index ==1)
		
			return 0;
		
		else
		
			sheet = workbook.getSheetAt(index);
			int number = sheet.getLastRowNum()+1;
			return number;
		
		
		
	}
	
	public String getCellData(String sheetName,String colName,int rowNum)
	{
		try {
			if(rowNum <=0)
			
				return "";
			
			int index = workbook.getSheetIndex(sheetName);
			workbook = new XSSFWorkbook();
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
		int index = workbook.getSheetIndex(sheetname);
		
		if(index==1)
		
			return 0;
		else
		{
			sheet = workbook.getSheetAt(index);
			int number = sheet.getLastRowNum() -1;
			
			return number;
		}
	}
	
	
	public boolean removeColumn(String sheetName,int colNum)
	{
		try
		{
			if(!isSheetExist(sheetName))
				return false;
			
			fis = new FileInputStream(path);
			workbook = new XSSFWorkbook(fis);
			sheet = workbook.getSheet(sheetName);
			XSSFCellStyle style = workbook.createCellStyle()
;			style.setFillForegroundColor(HSSFColor.GREY_40_PERCENT.getIndexHash());
            style.setFillPattern(FillPatternType.NO_FILL);
            
            for(int i=0;i<getRowCount(sheetName);i++)
            {
            	row = sheet.getRow(i);
            	
            	if(row!=null)
            	{
            	    cell = row.getCell(colNum);
            	    if(cell!=null)
            	    {
            	    	cell.setCellStyle(style);
            	    	row.removeCell(cell);
            	    }
            	}
            }
            
            fileOut = new FileoutputStream(path);
            workbook.write(fileOut);
            fileOut.close();
            
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return false;
		}
	}
	
	
	public boolean isSheetExist(String sheetName)
	{
		int index = workbook.getSheetIndex(sheetName);
		
		if(index == -1)
		
			index = workbook.getSheetIndex(sheetName.toUpperCase());
			
			if(index==-1)
				return false;
			else
				return true;
		
	}
	
	
	public int getColumnCount(String sheetName)
	{
		if(!isSheetExist(sheetName))
			return -1;
		
		
		sheet = workbook.getSheet(sheetName);
		
		row = sheet.getRow(0);
		
		if(row == null)
			return -1;
		
		return row.getLastCellNum();
		
	}
	
	public String getCellData(String sheetName,int colNum,int index)
	{
		return "";
	}
	
	public void setCellData(String sheetName,String screenShotColName, int index, String message,String url)
	{
		
	}
	
	public boolean addHyperLink(String sheetName,String screenShotColName,String testCaseName,int index,String message)
	{
		url = url.replace('\\', '/');
		
		if(!isSheetExist(sheetName))
			return false;
		
		
		sheet = workbook.getSheet(sheetName);
		
		for(int i=2;i<=getRowCount(sheetName);i++)
		{
			if(getCellData(sheetName,0,i).equalsIgnoreCase(testCaseName))
					{
				        setCellData(sheetName,screenShotColName,i+index,message,url);
				        break;
					}
		}
		
		return true;
	}
	
	public boolean addSheet(String sheetName)
	{
		try {
			workbook.createSheet(sheetName);
			fileOut = new FileOutputStream(path);
			workbook.write(fileOut);
			fileOut.close();
		}
		catch(Exception e)
		{
			
		}
	}
	
	public boolean addColumn(String sheetName,String colName)
	{
		try
		{
			fis = new FileInputStream(path);
			workbook = new XSSFWorkbook(fis);
			int index = workbook.getSheetIndex(sheetName);
			
			if(index==-1)
				return false;
			
			XSSFCellStyle style = workbook.createCellStyle();
			style.setFillForegroundColor(HSSFColor.GREY_40_PERCENT);
			style.setFillPattern(FillPaternType.SOLID_FOREGROUND);
			
			sheet = workbook.getSheetAt(index);
			
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return true;
	}
	
	public int getCellRowNum(String sheetName,String colName,String sheet)
	{
		for(int i=0;i<getRowCount(sheetName);i++)
		{
			if(getCellData(sheetName,colName,i).equalsIgnoreCase(sheet))
			
				return i;
			
		}
		
		return 0;
	}
	
	public int getColumnCount(String sheetName)
	{
		if(!isSheetExist(sheetName))
			return -1;
		
		sheet = workbook.getSheet(sheetName);
		row = sheet.getRow(0);
		
	}
}
