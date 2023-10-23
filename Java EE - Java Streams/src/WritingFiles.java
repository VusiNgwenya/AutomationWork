import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WritingFiles {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		File f = new File("/Users/abvn237/eclipse-workspace/Java EE - Java Streams/src/MyTestFile.txt");
		FileWriter fw = new FileWriter(f);
		BufferedWriter writer = new BufferedWriter(fw);
		
		/*writer.write("First line");
		writer.newLine();
		writer.write("India");
		writer.newLine();
		writer.write("Way2Automation");
		writer.newLine();
		writer.write("Raman");
		
		writer.close();*/
		
		for(int i=0;i<4;i++)
		{
			for(int j=0;j<3;j++)
			{
				int num = (int) (Math.random()*100);
				writer.write(num+",");
			}
		}
		writer.close();
	}
    
}
