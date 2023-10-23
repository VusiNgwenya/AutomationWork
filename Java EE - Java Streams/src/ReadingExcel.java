import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadingExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
		
		File f = new File("/Users/abvn237/eclipse-workspace/Java EE - Java Streams/src/");
		FileInputStream fi = new FileInputStream(f);
		
		Workbook workbook = WorkbookFactory.create(fi);
		
		Sheet sheet0 = (Sheet) workbook.getSheetAt(0);
		Row row0 = ((org.apache.poi.ss.usermodel.Sheet) sheet0).getRow(0);
		
		for(Row row : sheet0)
		{
			for(Cell cell : row)
			{
				switch(cell.getCellType())
				{
				case Cell.CELL_TYPE_STRING;
				  System.out.println(cell.getStringCellValue());
				  break;
				  
				case Cell.CELL_TYPE_NUMERIC;
				System.out.println(cell.getStringCellValue());
				break;
				
				case Cell.CELL_TYPE_BLANK;
				System.out.println("Blank cell"+"\t");
				break;
				
				}
			}
		}

	}

}
