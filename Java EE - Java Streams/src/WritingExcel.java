import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WritingExcel {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		XSSFWorkbook workbook = new XSSFWorkbook();
		XSSFSheet sheet0 = workbook.createSheet("first sheet");
		
		/*Row row0 = sheet0.createRow(1);
		Cell cellA = row0.createCell(1);
		Cell cellB = row0.createCell(1);
		
		cellA.setCellValue("first cell");
		cellB.setCellValue("second cell");*/
		
		for(int rows=0 ; rows<10; rows++)
		{
			Row row = sheet0.createRow(rows);
			for(int cols=0 ;cols<10;cols++)
			{
				Cell cell = row.createCell(cols);
				cell.setCellValue((int)(Math.random()*100));
			}
		}
		
		File f = new File("/Users/abvn237/eclipse-workspace/Java EE - Java Streams/src/MyExcelFile.xlsx");
		
		FileOutputStream fo = new FileOutputStream(f);
		

		workbook.write(fo);
		
		fo.close();
		
		//System.out.printkln();
	}

}
