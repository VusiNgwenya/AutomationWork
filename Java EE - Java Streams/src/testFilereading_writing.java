import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class testFilereading_writing {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		/*File file = new File("/Users/abvn237/eclipse-workspace/Java EE - Java Streams/src/test.txt");
		file.createNewFile();
		
		FileWriter fw = new FileWriter("/Users/abvn237/eclipse-workspace/Java EE - Java Streams/src/test.txt");
        BufferedWriter filewriter = new BufferedWriter(fw);
        
        filewriter.write("Please write inside this file");
        filewriter.newLine();
        filewriter.write("This is my second line");
        filewriter.flush();*/
        
        FileReader fr = new FileReader("/Users/abvn237/eclipse-workspace/Java EE - Java Streams/src/test.txt");
        BufferedReader filereader = new BufferedReader(fr);
        String i = "";
        
        
        /*System.out.println(filereader.readLine());
        System.out.println(filereader.readLine());
        System.out.println(filereader.readLine());
        System.out.println(filereader.readLine());*/
        
        while((i = filereader.readLine()) != null)
        {
        	System.out.println();
        }        
	}

}
