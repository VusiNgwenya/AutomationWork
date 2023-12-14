package Utilities;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;


public class writeJSON {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JSONObject student1 = new JSONObject();
		
		student1.put("studentName","John");
		student1.put("Grade","5th");
		student1.put("Location","16th Avenue");
		
		
        JSONObject student2 = new JSONObject();
		
		student1.put("StudentName","Anna");
		student1.put("Grade","5th");
		student1.put("Location","16th Avenue");
		
		
		System.out.println(student1.toJSONString());
		System.out.println(student2.toJSONString());
		
		JSONArray studentDetails = new JSONArray();
		studentDetails.add(student1);
		studentDetails.add(student2);
		
		System.out.println(studentDetails.toJSONString());
		
		JSONObject details = new JSONObject();
		details.put("studentDetails",studentDetails);
		
		System.out.println(details.toJSONString());
		//details.
		
		
		

	}

}
