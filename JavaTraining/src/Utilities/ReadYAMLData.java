package Utilities;

import java.util.Map;

public class ReadYAMLData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String filePath = System.getProperty("user.dir")+"//testData.yml";
		
		YamlReader reader = new YamlReader(file);
		
		Map testData = (Map) reader.read();
		
		List testCases = (List) testData
		

	}

}
