package Utilities;

import java.io.FileNotFoundException;
import java.io.FileReader;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class ReadJsonData {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub

		String filePath = System.getProperty("usr.dir")+"//testdata.json";
		FileReader file = new FileReader(filePath);
		
		JSONParser parser = new JSONParser();
		JSONObject json = (JSONObject) parser.parse(file);
		
		System.out.println(json.toJSONString());
		
		JSONArray testData = (JSONArray) json.get("testdata");
		
		System.out.println();
		
		JSONObject logintest = (JSONObject) testData.get(0);
		
		System.out.println(logintest.toJSONString());
		System.out.println(logintest.get("testName"));
		
		JSONArray logintestSet = (JSONArray) logintest.get("data");
		JSONObject LogintestSetData1 = (JSONObject) logintestSet.get(1);
		System.out.println(LoginTestSetData1.get("browser"));
		
		for(int i=0;i<testData.size();i++)
		{
			JSONObject testCase = (JSONObject) testData.get(i);
			System.out.println("test Case Name is --"+testCase.get("testName"));
			
			JSONArray testCaseData = (JSONArray) testCase.get("data");
			
			for(int j=0;j<testCaseData.size();j++)
			{
				
			}
		}
		
	}

}
