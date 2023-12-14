package test.java.utilities;

import java.util.logging.Logger;

import org.apache.log4j.PropertyConfigurator;

public class TestLogs {
	
	public static Logger log = Logger.getLogger(TestLogs.class.getName());
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PropertyConfigurator.configure("./src/test/resources/properties/log4j.properties");
		log.info("This is the information log");
		
		//log.error("Here the error logs will be printed");
		
		
	}

}
