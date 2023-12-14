package Utilities;

import java.io.FileOutputStream;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteExcelFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		XSSFWorkbook workbook = new XSSFWorkbook();
		XSSFSheet samplessheet = workbook.createSheet("SampleSheet");
		
		Map<String,Object[]> dataSet = new TreeMap<String,Object[]>();
		dataSet.put("1", new Object[] {"ID","NAME","Company"});
		dataSet.put("2", new Object[] {"1","James","PartLine Inc"});
		dataSet.put("3", new Object[] {"2","Maria","SumoLogic Inc"});
		dataSet.put("4", new Object[] {"4","Julia","Google Inc"});
		dataSet.put("5", new Object[] {"5","Ajay","Facebook Inc"});
		
		Set<String> set = dataSet.keySet();
		
		int rownum =0;
		
		for(String key : set)
		{
			Row row = samplessheet.createRow(rownum++);
			
			Object[] data = dataSet.get(key);
			
			int  cellNum = 0;
			
			for(Object value : data)
			{
				Cell cell = row.createCell(cellNum++);
				
				if(value instanceof String)
				
					cell.setCellValue(String) value;
				else if (value instanceof Integer)
					cell.setCellValue(Integer) value;
			}
			
		}
		
		FileOutputStream writeFile = new FileOutputStream();
		
		

	}

}
