package Java_EE_WebDriverNewModules;

import org.testng.annotations.Test;

import java.util.Hashtable;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
//import org.junit.jupiter.api.Test;

public class TestNGParameterization {
	
	public static ExcelReader excel;
	
	
	@Test(dataProvider="getData")
	public void testData(Hashtable<String,String> table)
	{
		table = new Hashtable<String,String>();
		
		for(int colNum=0;colNum<cols;colNum++)
		{
			table.put(excel.getCellData(sheetName, colNum, 1), null)
		}
	}
	
	@DataProvider
	public static Object[][] getData()
	{
		//Object[][] data = new Object[2][3];
		
		
		if(excel == null)
		{
			excel = new ExcelReader("c:\\selenium\\testngdata.xlsx");
		}
		
		String sheetName = "loginTest";
		
		int rows = excel.getRowCount(sheetName);
		int cols = excel.getColumnCount(sheetName);
		
		Object[][] data = new Object[rows -1 ][cols];
		
		for(int rowNum=2;rowNum<=rows;rowNum++)
		{
			for(int colNum=0;colNum<cols;colNum++)
			{
				data[rowNum-2][0] = excel.getCellData(sheetName, colNum, rowNum);
			}
		}
		
		return data;
	}

}
