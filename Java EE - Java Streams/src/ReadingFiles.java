import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadingFiles {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		File f = new File("/Users/abvn237/eclipse-workspace/Java EE - Java Streams/src/MyTestFile.txt");
		//File f = new File("/Users/abvn237/Desktop/Screenshots/MyTestFile.txt");
		FileReader fr = new FileReader(f);
		
		BufferedReader reader = new BufferedReader(fr);
		
		//System.out.println(reader.readLine());
		
		while(reader.readLine() != null)
		{
			System.out.println(reader.readLine());
		}
		
		reader.close();
	}

}
