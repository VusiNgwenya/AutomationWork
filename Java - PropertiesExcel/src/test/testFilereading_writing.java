package test;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class testFilereading_writing {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		File file = new File("/PropertiesExcel/test.txt");
		file.createNewFile();
		
		FileWriter fw = new FileWriter("/PropertiesExcel/test.txt");
		BufferedWriter filewriter = new BufferedWriter(fw);
		
		filewriter.write("Please write inside this file");
		filewriter.newLine();
		filewriter.write("This is my second line");
		filewriter.flush();
		
		FileReader fr = new FileReader("/PropertiesExcel/test.txt");
		
	}

}
