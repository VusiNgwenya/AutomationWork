package test;

import java.util.Properties;

public class testCase1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Properties prop = new Properties();
		

		FleInputStream fis = new FileInputStream("");
		
		prop.load(fis);
		
		System.out.println(prop.getProperty("name"));
		System.out.println(prop.getProperty("course"));
		
	}

}
